package org.metable.hex.soccer.framework.adapters.file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.metable.hex.domain.emf.soccer.EmfSoccerUniverse;
import org.metable.hex.domain.emf.soccer.EmfTeam;
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

    private static boolean containsTeam(EList<EmfTeam> teams, String name) {
        for (EmfTeam team : teams) {
            if (team.getName().contentEquals(name)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsTeam(Set<Team> teams, String name) {
        for (Team team : teams) {
            if (team.getName().contentEquals(name)) {
                return true;
            }
        }
        return false;
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

    private static SoccerUniverse toDomain(EmfSoccerUniverse soccer) {
        SoccerUniverse soccerUniverse = new SoccerUniverse();

        soccer.getTeams().forEach(team -> {
            Team newTeam = new Team(team.getName());
            soccerUniverse.addTeam(newTeam);
        });

        return soccerUniverse;
    }
    private Resource resource;
    private EmfSoccerUniverse soccerUniverseEmf;

    private SoccerUniverse soccerUniverse;

    private AdapterFactoryEditingDomain editingDomain;

    private SoccerUniverseFileAdapter() throws IOException {
        @SuppressWarnings("unused")
        final SoccerPackage soccerPackage = SoccerPackage.eINSTANCE;

        soccerUniverse = readSoccerUniverse();
    }

    @Override
    public boolean canUndo() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SoccerUniverse getSoccerUniverse() {
        return soccerUniverse;
    }

    @Override
    public void persist() throws IOException {
        addTeams();
        removeTeams();

        resource.save(null);
    }

    @Override
    public void persist(Team team) throws IOException {
        // TODO Auto-generated method stub

    }

    @Override
    public void redo() {
        throw new java.lang.UnsupportedOperationException();
    }

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

    private void addTeams() {
        Set<Team> teams = soccerUniverse.getTeams();

        teams.forEach(team -> {
            if (!containsTeam(soccerUniverseEmf.getTeams(), team.getName())) {
                EmfTeam emfTeam = SoccerFactory.eINSTANCE.createEmfTeam();

                emfTeam.setName(team.getName());

                Command command = new CreateChildCommand(editingDomain, soccerUniverseEmf,
                        SoccerPackage.Literals.EMF_SOCCER_UNIVERSE__TEAMS, emfTeam, null);

                editingDomain.getCommandStack().execute(command);
            }
        });
    }

    private SoccerUniverse readSoccerUniverse() throws IOException {
        editingDomain = newEditingDomain();

        ResourceSet resourceSet = editingDomain.getResourceSet();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("soccer", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./soccer_universe.soccer");

        resource = editingDomain.loadResource(uri.toFileString());

        soccerUniverseEmf = (EmfSoccerUniverse) resource.getContents().get(0);

        return toDomain(soccerUniverseEmf);
    }

    private void removeTeams() {
        List<EmfTeam> teamsToDelete = new ArrayList<>();

        EList<EmfTeam> teams = soccerUniverseEmf.getTeams();

        teams.forEach(team -> {
            if (!containsTeam(soccerUniverse.getTeams(), team.getName())) {
                teamsToDelete.add(team);
            }
        });

        teamsToDelete.forEach(team -> {
            Command command = DeleteCommand.create(editingDomain, team);
            editingDomain.getCommandStack().execute(command);
        });
    }
}
