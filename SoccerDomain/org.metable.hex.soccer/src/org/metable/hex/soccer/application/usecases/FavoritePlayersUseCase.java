package org.metable.hex.soccer.application.usecases;

import org.metable.hex.soccer.application.ports.input.AddFavoritePlayerCommand;
import org.metable.hex.soccer.application.ports.input.DeleteFavoritePlayerCommand;

public interface FavoritePlayersUseCase {

    public void requestFavorites();

    void addFavoritePlayer(AddFavoritePlayerCommand command);

    void enterPlayerInfo(String firstName, String lastName, String teamName);

    void removeFavoritePlayer(DeleteFavoritePlayerCommand command);

    void selectPlayer(String firstName, String lastName, String teamName);

    void unselectPlayer(String firstName, String lastName, String teamName);

}
