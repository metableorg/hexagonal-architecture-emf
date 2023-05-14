package org.metable.hex.soccer.application.usecases;

public interface SoccerUniverseUseCase {
    void newTeam(String name);

    void removeTeam(String name);

    void undo();
}
