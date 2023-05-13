package org.metable.hex.soccer.application.ports.input;

public class DeleteFavoritePlayerCommand {

    public final String firstName;
    public final String lastName;
    public final String teamName;

    public DeleteFavoritePlayerCommand(String firstName, String lastName, String teamName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }
}
