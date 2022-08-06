package org.metable.hex.soccer.domain.entity;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SoccerUniverse {

    @Override
    public String toString() {
        return "SoccerUniverse [teams=" + teams + "]";
    }

    private Set<Team> teams = new HashSet<>();

    public void newTeam(String name) {
        Team team = new Team(name);
        teams.add(team);
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public Set<Team> getTeams() {
        return Collections.unmodifiableSet(teams);
    }
}
