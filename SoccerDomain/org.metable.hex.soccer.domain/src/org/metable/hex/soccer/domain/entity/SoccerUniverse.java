package org.metable.hex.soccer.domain.entity;

import java.util.Iterator;
import java.util.Set;

public class SoccerUniverse {

    private Set<Team> teams;

    public void addTeam(final Team team) {
        teams.add(team);
    }

    public void mapTo(SoccerUniverseDto soccerUniverseDto) {

        final Iterator<Team> it = teams.iterator();

        while (it.hasNext()) {
            final Team team = it.next();
            TeamDto teamDto = soccerUniverseDto.getTeamDto();
            team.mapTo(teamDto);
            soccerUniverseDto.addTeam(teamDto);
        }
    }
}
