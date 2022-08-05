package org.metable.hex.soccer.domain.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class SoccerUniverse {

    @Override
    public String toString() {
        return "SoccerUniverse [teams=" + teams + "]";
    }

    private Set<Team> teams = new HashSet<>();

    public Team newTeam(String name) {
        Team team = new Team(UUID.randomUUID().toString(), name);
        teams.add(team);
        return team;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }
}
