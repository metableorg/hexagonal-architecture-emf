package org.metable.hex.soccer.application.ports.output;

import java.io.IOException;

import org.metable.hex.soccer.domain.entity.SoccerUniverse;

public interface SoccerUniverseOutputPort {
    void persist() throws IOException;

    void undo();

    SoccerUniverse getSoccerUniverse();
}
