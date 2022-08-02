package org.metable.hex.soccer.domain.entity;

import java.util.Set;

public interface SoccerUniverseDto {
    
    public TeamDto getTeamDto();

    public void addTeam(TeamDto team);

    public Set<Team> getTeams();
}
