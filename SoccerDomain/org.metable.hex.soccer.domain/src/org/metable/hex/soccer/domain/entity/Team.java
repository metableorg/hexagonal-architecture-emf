package org.metable.hex.soccer.domain.entity;

import java.util.Optional;

import org.metable.hex.soccer.domain.valueobject.Position;
import org.metable.hex.soccer.domain.valueobject.RosterMember;

public class Team {

    @SuppressWarnings("unused")
    private final String id;
    private final String name;
    private final Roster roster;

    public Team(final String id, final String name) {
        this.id = id;
        this.name = name;
        this.roster = new Roster();
    }

    public void addPlayer(final Player player, final Position position) {
        roster.addMember(new RosterMember(player, position));
    }

    public void removePlayer(final Player player) {
        Optional<RosterMember> member = roster.findMember(player);
        member.ifPresent(m -> roster.removeMember(m));
    }

    public String getName() {
        return name;
    }
}
