package org.metable.hex.soccer.application.usecases;

import org.metable.hex.soccer.domain.entity.Player;
import org.metable.hex.soccer.domain.valueobject.Position;

public interface SoccerTeamUseCase {
    void addRosterMember(Player player, Position position, int number);

    void removeRosterMember(Player player);
}
