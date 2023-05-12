package org.metable.hex.soccer.application.ports.input;

import java.util.List;

import org.metable.hex.soccer.application.ports.output.FavoritePlayersStorePort;
import org.metable.hex.soccer.application.ports.output.FavoritePlayersViewPort;
import org.metable.hex.soccer.application.usecases.FavoritePlayersUseCase;
import org.metable.hex.soccer.domain.entity.Player;

public class PlayerCommandPort implements FavoritePlayersUseCase {

    private static final String NO_FAVORITES_MESSAGE = "You have no favorite players.";

    private final FavoritePlayersStorePort store;
    private final FavoritePlayersViewPort view;

    public PlayerCommandPort(FavoritePlayersStorePort store, FavoritePlayersViewPort view) {
        this.store = store;
        this.view = view;
    }

    @Override
    public void requestFavorites() {
        List<Player> favorites = store.queryFavorites();

        view.removeMessage(NO_FAVORITES_MESSAGE);

        if (favorites.isEmpty()) {
            view.addMessage(NO_FAVORITES_MESSAGE);
        }

        view.view(favorites);
    }

    @Override
    public void addFavoritePlayer(AddFavoritePlayerCommand command) {
        store.addFavorite(command.firstName, command.lastName, command.teamName);
        requestFavorites();
    }

    @Override
    public void enterPlayerInfo(String firstName, String lastName, String teamName) {
        view.enableAddFavorite(false);

        if (firstName.isEmpty()) {
            return;
        }

        if (lastName.isEmpty()) {
            return;
        }

        if (teamName.isEmpty()) {
            return;
        }

        view.enableAddFavorite(true);
    }

    public void deleteFavoritePlayer(DeleteFavoritePlayerCommand command) {
        store.removeFavorite(command.identity);
        requestFavorites();
    }
}
