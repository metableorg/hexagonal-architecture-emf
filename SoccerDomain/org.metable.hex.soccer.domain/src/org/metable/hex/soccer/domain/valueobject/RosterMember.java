package org.metable.hex.soccer.domain.valueobject;

import java.util.Objects;

import org.metable.hex.soccer.domain.entity.Player;

public final class RosterMember {
    @Override
    public int hashCode() {
        return Objects.hash(player, position);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RosterMember other = (RosterMember) obj;
        return Objects.equals(player, other.player) && Objects.equals(position, other.position);
    }

    private final Position position;
    private final Player player;

    public RosterMember(Player player, Position position) {
        this.player = player;
        this.position = position;
    }

    public Player getPlayer() {
        return player;
    }

    public Position getPosition() {
        return position;
    }
}
