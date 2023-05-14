package org.metable.hex.soccer.application.ports.input;

import java.io.IOException;

import org.metable.hex.soccer.application.ports.output.SoccerUniverseOutputPort;
import org.metable.hex.soccer.application.usecases.SoccerUniverseUseCase;
import org.metable.hex.soccer.domain.entity.SoccerUniverse;

public class SoccerUniverseInputPort implements SoccerUniverseUseCase {

    private final SoccerUniverseOutputPort outputPort;

    public SoccerUniverseInputPort(SoccerUniverseOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public void newTeam(String name) {
        SoccerUniverse soccerUniverse = outputPort.getSoccerUniverse();
        soccerUniverse.newTeam(name);

        try {
            outputPort.persist();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeTeam(String name) {
        SoccerUniverse soccerUniverse = outputPort.getSoccerUniverse();
        soccerUniverse.removeTeam(name);

        try {
            outputPort.persist();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void undo() {
        outputPort.undo();
    }
}
