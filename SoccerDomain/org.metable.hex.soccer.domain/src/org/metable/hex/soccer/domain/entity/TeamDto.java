package org.metable.hex.soccer.domain.entity;

import java.util.Set;

import org.metable.hex.soccer.domain.valueobject.RosterMember;

public interface TeamDto {

    public String getId();

    public String getName();

    public void setId(String id);

    public void setName(String name);

    public void addRosterMember(RosterMember member);
    
    public Set<RosterMember> getRoster();
}
