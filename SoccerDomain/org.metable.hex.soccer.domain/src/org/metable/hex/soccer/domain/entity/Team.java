package org.metable.hex.soccer.domain.entity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

import org.metable.hex.soccer.domain.valueobject.Position;
import org.metable.hex.soccer.domain.valueobject.RosterMember;

public class Team {

    private static class Roster {
        private final Set<RosterMember> players;

        public Roster() {
            players = new HashSet<>();
        }

        public void addMember(final RosterMember member) {
            players.add(member);
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

        public void removeMember(final RosterMember member) {
            players.remove(member);
        }
    }

    private final String name;
    private final Roster roster;

    public Team(final String name) {
        this.name = name;
        this.roster = new Roster();
    }

    public void addPlayer(final Player player, final Position position) {
        roster.addMember(new RosterMember(player, position));
    }

    public String getName() {
        return name;
    }

    public void removePlayer(final Player player) {
        Optional<RosterMember> member = roster.findMember(player);
        member.ifPresent(m -> roster.removeMember(m));
    }

    @Override
    public String toString() {
        return "Team [name=" + name + "]";
    }
}
