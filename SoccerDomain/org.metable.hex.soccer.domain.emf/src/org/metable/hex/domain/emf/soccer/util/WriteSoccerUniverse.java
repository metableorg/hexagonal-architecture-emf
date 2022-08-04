
package org.metable.hex.domain.emf.soccer.util;

import java.io.IOException;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.domain.emf.soccer.FieldPosition;
import org.metable.hex.domain.emf.soccer.Player;
import org.metable.hex.domain.emf.soccer.Position;
import org.metable.hex.domain.emf.soccer.RosterMember;
import org.metable.hex.domain.emf.soccer.SoccerFactory;
import org.metable.hex.domain.emf.soccer.SoccerUniverse;
import org.metable.hex.domain.emf.soccer.SpecialityPosition;
import org.metable.hex.domain.emf.soccer.Team;

public class WriteSoccerUniverse {

    public static void main(String[] args) throws IOException {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("soccer", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./soccer_universe.soccer");

        Resource resource = resourceSet.createResource(uri);

        SoccerUniverse soccer = SoccerFactory.eINSTANCE.createSoccerUniverse();

        // Players
        Player mendy = SoccerFactory.eINSTANCE.createPlayer();
        mendy.setId(UUID.randomUUID().toString());
        mendy.setFirstName("Edouard");
        mendy.setLastName("Mendy");

        soccer.getPlayers().add(mendy);

        Player becker = SoccerFactory.eINSTANCE.createPlayer();
        becker.setId(UUID.randomUUID().toString());
        becker.setFirstName("Alisson");
        becker.setLastName("Becker");

        soccer.getPlayers().add(becker);

        // Positions
        Position keeper = SoccerFactory.eINSTANCE.createPosition();
        keeper.setName("Goalkeeper");
        keeper.setFieldPosition(FieldPosition.BACK);
        keeper.setSpecialityPosition(SpecialityPosition.KEEPER);

        soccer.getPositions().add(keeper);

        // Teams
        Team team = SoccerFactory.eINSTANCE.createTeam();
        team.setId(UUID.randomUUID().toString());
        team.setName("Chelsea");

        // Roster
        RosterMember rosterMember = SoccerFactory.eINSTANCE.createRosterMember();
        rosterMember.setPlayer(mendy);
        rosterMember.setPosition(keeper);
        rosterMember.setNumber(1);

        team.getRoster().add(rosterMember);

        soccer.getTeams().add(team);

        team = SoccerFactory.eINSTANCE.createTeam();
        team.setId(UUID.randomUUID().toString());
        team.setName("Liverpool");

        rosterMember = SoccerFactory.eINSTANCE.createRosterMember();
        rosterMember.setPlayer(becker);
        rosterMember.setPosition(keeper);
        rosterMember.setNumber(1);

        team.getRoster().add(rosterMember);

        soccer.getTeams().add(team);

        resource.getContents().add(soccer);

        resource.save(null);
    }
}
