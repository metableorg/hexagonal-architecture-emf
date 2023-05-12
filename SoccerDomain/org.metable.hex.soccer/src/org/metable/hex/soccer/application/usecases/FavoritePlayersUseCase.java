package org.metable.hex.soccer.application.usecases;

import org.metable.hex.soccer.application.ports.input.AddFavoritePlayerCommand;
import org.metable.hex.soccer.application.ports.input.DeleteFavoritePlayerCommand;

public interface FavoritePlayersUseCase {

    public void requestFavorites();

    void addFavoritePlayer(AddFavoritePlayerCommand command);

    void deleteFavoritePlayer(DeleteFavoritePlayerCommand command);

    void enterPlayerInfo(String firstName, String lastName, String teamName);

}
