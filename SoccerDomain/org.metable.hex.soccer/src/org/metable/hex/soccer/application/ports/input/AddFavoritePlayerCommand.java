package org.metable.hex.soccer.application.ports.input;

public final class AddFavoritePlayerCommand {

    public final String firstName;
    public final String lastName;
    public final String teamName;

    public AddFavoritePlayerCommand(String firstName, String lastName, String teamName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }

}
