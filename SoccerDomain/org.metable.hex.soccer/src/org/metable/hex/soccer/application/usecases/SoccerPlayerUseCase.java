package org.metable.hex.soccer.application.usecases;

public interface SoccerPlayerUseCase {
    void newPlayer(String firstName, String lastName);

    void removePlayer(String playerId);
}
