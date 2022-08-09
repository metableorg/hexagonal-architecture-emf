package org.metable.hex.soccer.application.ports.output;

import java.io.IOException;

import org.metable.hex.soccer.domain.entity.SoccerUniverse;
import org.metable.hex.soccer.domain.entity.Team;

public interface SoccerUniverseOutputPort extends UndoRedoPort {
    void persist() throws IOException;
    
    void persist(Team team) throws IOException;
    
    SoccerUniverse getSoccerUniverse();
}
