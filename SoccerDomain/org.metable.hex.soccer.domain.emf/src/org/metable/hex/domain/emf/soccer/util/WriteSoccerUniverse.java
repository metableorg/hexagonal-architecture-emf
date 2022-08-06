
package org.metable.hex.domain.emf.soccer.util;

import java.io.IOException;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.domain.emf.soccer.EmfFieldPosition;
import org.metable.hex.domain.emf.soccer.EmfPlayer;
import org.metable.hex.domain.emf.soccer.EmfPosition;
import org.metable.hex.domain.emf.soccer.EmfRosterMember;
import org.metable.hex.domain.emf.soccer.EmfSoccerUniverse;
import org.metable.hex.domain.emf.soccer.EmfSpecialityPosition;
import org.metable.hex.domain.emf.soccer.EmfTeam;
import org.metable.hex.domain.emf.soccer.SoccerFactory;

public class WriteSoccerUniverse {

    public static void main(String[] args) throws IOException {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("soccer", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./soccer_universe.soccer");

        Resource resource = resourceSet.createResource(uri);

        EmfSoccerUniverse soccer = SoccerFactory.eINSTANCE.createEmfSoccerUniverse();

        // Players
        EmfPlayer mendy = SoccerFactory.eINSTANCE.createEmfPlayer();
        mendy.setId(UUID.randomUUID().toString());
        mendy.setFirstName("Edouard");
        mendy.setLastName("Mendy");

        soccer.getPlayers().add(mendy);

        EmfPlayer becker = SoccerFactory.eINSTANCE.createEmfPlayer();
        becker.setId(UUID.randomUUID().toString());
        becker.setFirstName("Alisson");
        becker.setLastName("Becker");

        soccer.getPlayers().add(becker);

        // Positions
        EmfPosition keeper = SoccerFactory.eINSTANCE.createEmfPosition();
        keeper.setName("Goalkeeper");
        keeper.setFieldPosition(EmfFieldPosition.BACK);
        keeper.setSpecialityPosition(EmfSpecialityPosition.KEEPER);

        soccer.getPositions().add(keeper);

        // Teams
        EmfTeam team = SoccerFactory.eINSTANCE.createEmfTeam();
        team.setId(UUID.randomUUID().toString());
        team.setName("Chelsea");

        // Roster
        EmfRosterMember rosterMember = SoccerFactory.eINSTANCE.createEmfRosterMember();
        rosterMember.setPlayer(mendy);
        rosterMember.setPosition(keeper);
        rosterMember.setNumber(1);

        team.getRoster().add(rosterMember);

        soccer.getTeams().add(team);

        team = SoccerFactory.eINSTANCE.createEmfTeam();
        team.setId(UUID.randomUUID().toString());
        team.setName("Liverpool");

        rosterMember = SoccerFactory.eINSTANCE.createEmfRosterMember();
        rosterMember.setPlayer(becker);
        rosterMember.setPosition(keeper);
        rosterMember.setNumber(1);

        team.getRoster().add(rosterMember);

        soccer.getTeams().add(team);

        resource.getContents().add(soccer);

        resource.save(null);
    }
}
