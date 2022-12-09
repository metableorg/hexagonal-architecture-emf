package org.metable.hex.soccer.domain.entity;

import java.util.Objects;

public class Player {
    private final String id;

    @SuppressWarnings("unused")
    private final String firstName;

    @SuppressWarnings("unused")
    private final String lastName;

    public Player(final String id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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
}
