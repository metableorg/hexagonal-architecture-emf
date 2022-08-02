package org.metable.hex.soccer.domain.entity;

import java.util.Objects;

public class Player {
    public static Player mapFromDto(PlayerDto playerDto) {
        return new Player(playerDto.getId(), playerDto.getFirstName(), playerDto.getLastName());
    }

    private final String id;

    private final String firstName;

    private final String lastName;
    public Player(final String id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void mapToDto(PlayerDto playerDto) {
        playerDto.setId(id);
        playerDto.setFirstName(firstName);
        playerDto.setLastName(lastName);
    }
}
