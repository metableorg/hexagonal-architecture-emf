package org.metable.hex.soccer.domain.entity;

import java.util.Objects;

public class Player {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String teamName;

    public Player(final String id, final String firstName, final String lastName, final String teamName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }

    public Player(final String id, final String firstName, final String lastName) {
        this(id, firstName, lastName, "");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Player other = (Player) obj;

        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean matches(String firstName, String lastName, String teamName) {
        if (!this.firstName.equals(firstName)) {
            return false;
        }

        if (!this.lastName.equals(lastName)) {
            return false;
        }

        if (!this.teamName.equals(teamName)) {
            return false;
        }

        return true;
    }
}
