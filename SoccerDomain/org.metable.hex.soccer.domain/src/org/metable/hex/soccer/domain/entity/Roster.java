package org.metable.hex.soccer.domain.entity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

import org.metable.hex.soccer.domain.valueobject.RosterMember;

public final class Roster {
    private final Set<RosterMember> players;

    public Roster() {
        players = new HashSet<>();
    }

    public void addMember(final RosterMember member) {
        players.add(member);
    }

    public void removeMember(final RosterMember member) {
        players.remove(member);
    }

    public Optional<RosterMember> findMember(final Player player) {
        final Iterator<RosterMember> it = players.iterator();

        while (it.hasNext()) {
            final RosterMember member = it.next();
            if (member.getPlayer().equals(player)) {
                return Optional.of(member);
            }
        }

        return Optional.empty();
    }
}
