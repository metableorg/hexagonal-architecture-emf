package org.metable.hex.soccer.application.ports.output;

import java.io.IOException;

import org.metable.hex.soccer.application.usecases.SoccerUniverseUseCase;
import org.metable.hex.soccer.domain.entity.SoccerUniverse;
import org.metable.hex.soccer.domain.entity.Team;

public class SoccerUniverseInputPort implements SoccerUniverseUseCase {

    private final SoccerUniverseOutputPort outputPort;

    public SoccerUniverseInputPort(SoccerUniverseOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public void newTeam(String name) {
        SoccerUniverse soccerUniverse = outputPort.getSoccerUniverse();
        Team team = soccerUniverse.newTeam(name);
        try {
            outputPort.persist(team);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void undo() {
        outputPort.undo();
    }
}
