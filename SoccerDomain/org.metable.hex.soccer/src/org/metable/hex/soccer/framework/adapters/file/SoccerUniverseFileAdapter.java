package org.metable.hex.soccer.framework.adapters.file;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.metable.hex.domain.emf.soccer.SoccerFactory;
import org.metable.hex.domain.emf.soccer.SoccerPackage;
import org.metable.hex.domain.emf.soccer.provider.SoccerItemProviderAdapterFactory;
import org.metable.hex.soccer.application.ports.output.SoccerUniverseOutputPort;
import org.metable.hex.soccer.domain.entity.SoccerUniverse;
import org.metable.hex.soccer.domain.entity.Team;

public class SoccerUniverseFileAdapter implements SoccerUniverseOutputPort {

    private static SoccerUniverseFileAdapter instance;

    public static SoccerUniverseFileAdapter getInstance() throws IOException {
        if (instance == null) {
            instance = new SoccerUniverseFileAdapter();
        }
        return instance;
    }

    private static AdapterFactoryEditingDomain newEditingDomain() {
        ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory();

        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new SoccerItemProviderAdapterFactory());

        // Create a command stack to support undo/redo
        BasicCommandStack commandStack = new BasicCommandStack();

        AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack,
                new HashMap<Resource, Boolean>());

        return editingDomain;
    }

    private Resource resource;

    private SoccerUniverse readSoccerUniverse() throws IOException {
        editingDomain = newEditingDomain();

        ResourceSet resourceSet = editingDomain.getResourceSet();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("soccer", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./soccer_universe.soccer");

        resource = editingDomain.loadResource(uri.toFileString());

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

    private org.metable.hex.domain.emf.soccer.SoccerUniverse soccerUniverseEmf;
    private AdapterFactoryEditingDomain editingDomain;
    private SoccerUniverse soccerUniverse;

    private SoccerUniverseFileAdapter() throws IOException {
        @SuppressWarnings("unused")
        final SoccerPackage soccerPackage = SoccerPackage.eINSTANCE;

        soccerUniverse = readSoccerUniverse();
    }

    @Override
    public SoccerUniverse getSoccerUniverse() {
        return soccerUniverse;
    }

    @Override
    public void persist(Team team) {
        org.metable.hex.domain.emf.soccer.Team emfTeam = fetchTeam(team.getId());

        if (emfTeam != null) {
            // Do nothing for now.
            return;
        }

        emfTeam = SoccerFactory.eINSTANCE.createTeam();

        emfTeam.setId(team.getId());
        emfTeam.setName(team.getName());

        Command command = new CreateChildCommand(editingDomain, soccerUniverseEmf,
                SoccerPackage.Literals.SOCCER_UNIVERSE__TEAMS, emfTeam, null);

        editingDomain.getCommandStack().execute(command);

        try {
            resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private org.metable.hex.domain.emf.soccer.Team fetchTeam(String id) {
        EList<org.metable.hex.domain.emf.soccer.Team> teams = soccerUniverseEmf.getTeams();
        for (org.metable.hex.domain.emf.soccer.Team team : teams) {
            if (team.getId().contentEquals(id)) {
                return team;
            }
        }
        return null;
    }

//    private IItemPropertyDescriptor getPropertyDescriptor(EObject owner, EStructuralFeature attribute) {
//        IItemPropertySource propertySource = (IItemPropertySource) editingDomain.getAdapterFactory().adapt(owner,
//                IItemPropertySource.class);
//
//        IItemPropertyDescriptor property = propertySource.getPropertyDescriptor(owner, attribute);
//
//        return property;
//    }

    @Override
    public void undo() {
        editingDomain.getCommandStack().undo();

        try {
            resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        soccerUniverse = toDomain(soccerUniverseEmf);
    }
}
