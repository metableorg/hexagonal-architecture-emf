package org.metable.hex.soccer.application.ports.output;

import org.metable.hex.soccer.domain.entity.SoccerUniverse;
import org.metable.hex.soccer.domain.entity.Team;

public interface SoccerUniverseOutputPort {
    void persist(Team team);

    void undo();

    SoccerUniverse getSoccerUniverse();
}
