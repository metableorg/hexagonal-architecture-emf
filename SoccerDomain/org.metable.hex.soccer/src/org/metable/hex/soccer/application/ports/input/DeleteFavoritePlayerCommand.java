package org.metable.hex.soccer.application.ports.input;

public class DeleteFavoritePlayerCommand {

    public final String identity;

    public DeleteFavoritePlayerCommand(String identity) {
        this.identity = identity;
    }
}
