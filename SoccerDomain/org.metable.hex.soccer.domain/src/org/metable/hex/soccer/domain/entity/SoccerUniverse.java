package org.metable.hex.soccer.domain.entity;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class SoccerUniverse {

    @Override
    public String toString() {
        return "SoccerUniverse [teams=" + teams + ", players=" + players + "]";
    }

    private final Set<Team> teams = new HashSet<>();

    private final Set<Player> players = new HashSet<>();

    public void newTeam(String name) {
        Team team = new Team(name);
        teams.add(team);
    }
    
    public void newPlayer(String firstName, String lastName) {
        Player player = new Player(UUID.randomUUID().toString(), firstName, lastName);
        players.add(player);
    }
    
    public void removePlayer(Player player) {
        players.remove(player);
    }

    public Set<Team> getTeams() {
        return Collections.unmodifiableSet(teams);
    }

    public Set<Player> getPlayers() {
        return Collections.unmodifiableSet(players);
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(String name) {
        Team teamToRemove = null;
        
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                teamToRemove = team;
                break;
            }
        }
        
        if (teamToRemove == null) {
            return;
        }
        
        teams.remove(teamToRemove);
    }
}
