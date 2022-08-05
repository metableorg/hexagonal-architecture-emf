package org.metable.hex.soccer.framework.adapters.file;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.metable.hex.domain.emf.soccer.SoccerPackage;
import org.metable.hex.domain.emf.soccer.provider.SoccerItemProviderAdapterFactory;
import org.metable.hex.soccer.application.ports.output.SoccerUniverseOutputPort;
import org.metable.hex.soccer.domain.entity.SoccerUniverse;
import org.metable.hex.soccer.domain.entity.Team;

public class SoccerUniverseFileAdapter implements SoccerUniverseOutputPort {

    private static SoccerUniverseFileAdapter instance;
    private static org.metable.hex.domain.emf.soccer.SoccerUniverse soccerUniverseEmf;
    private static EditingDomain editingDomain;

    public static SoccerUniverseFileAdapter getInstance() throws IOException {
        if (instance == null) {
            instance = new SoccerUniverseFileAdapter();
        }
        return instance;
    }
    
    private static EditingDomain newEditingDomain() {
        // Create an adapter factory that yields item providers.
        ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
                ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new SoccerItemProviderAdapterFactory()); 

        // Create a command stack to support undo/redo
        BasicCommandStack commandStack = new BasicCommandStack();

        AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack,
                new HashMap<Resource, Boolean>());

        return editingDomain;
    }

    private static SoccerUniverse readSoccerUniverse() throws IOException {
        editingDomain = newEditingDomain();

        ResourceSet resourceSet = editingDomain.getResourceSet(); 

        // ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("soccer", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./soccer_universe.soccer");

        @SuppressWarnings("unused")
        final SoccerPackage soccerPackage = SoccerPackage.eINSTANCE;
        
        Resource resource = editingDomain.loadResource(uri.toFileString());

        // Resource resource = resourceSet.createResource(uri);
        // resource.load(null);

        soccerUniverseEmf = (org.metable.hex.domain.emf.soccer.SoccerUniverse) resource.getContents().get(0);

        return toDomain(soccerUniverseEmf);
    }

    private static SoccerUniverse toDomain(org.metable.hex.domain.emf.soccer.SoccerUniverse soccer) {
        SoccerUniverse soccerUniverse = new SoccerUniverse();

        soccer.getTeams().forEach(team -> {
            Team newTeam = new Team(team.getId(), team.getName());
            soccerUniverse.addTeam(newTeam);
        });

        return soccerUniverse;
    }

    private final SoccerUniverse soccerUniverse;

    private SoccerUniverseFileAdapter() throws IOException {
        soccerUniverse = readSoccerUniverse();
    }

    @Override
    public SoccerUniverse getSoccerUniverse() {
        return soccerUniverse;
    }

    @Override
    public void persist(Team team) {
    }

    @Override
    public void undo() {
    }
}
