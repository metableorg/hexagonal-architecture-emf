package org.metable.hex.soccer.application.ports.input;

import java.util.List;

import org.metable.hex.soccer.application.ports.output.FavoritePlayersStorePort;
import org.metable.hex.soccer.application.ports.output.FavoritePlayersViewPort;
import org.metable.hex.soccer.application.usecases.FavoritePlayersUseCase;
import org.metable.hex.soccer.domain.entity.Player;

public class PlayerCommandPort implements FavoritePlayersUseCase {

    private static final String MESSAGE_NO_FAVORITES = "You have no favorite players.";
    private static final String MESSAGE_FIRST_NAME_IS_MISSING = "First name is missing.";
    private static final String MESSAGE_LAST_NAME_IS_MISSING = "Last name is missing.";
    private static final String MESSAGE_TEAM_NAME_IS_MISSING = "Team name is missing.";
    private static final String MESSAGE_DUPLICATES_NOT_ALLOWED = "Duplicates are not allowed.";

    private final FavoritePlayersStorePort store;
    private final FavoritePlayersViewPort view;

    public PlayerCommandPort(FavoritePlayersStorePort store, FavoritePlayersViewPort view) {
        this.store = store;
        this.view = view;

        requestFavorites();
    }

    @Override
    public void addFavoritePlayer(AddFavoritePlayerCommand command) {
        if (store.contains(command.firstName, command.lastName, command.teamName)) {
            return;
        }
        store.addFavorite(command.firstName, command.lastName, command.teamName);
        enterPlayerInfo(command.firstName, command.lastName, command.teamName);
        requestFavorites();
    }

    public void deleteFavoritePlayer(DeleteFavoritePlayerCommand command) {
        store.removeFavorite(command);
        requestFavorites();
    }

    @Override
    public void enterPlayerInfo(String firstName, String lastName, String teamName) {
        view.enableAddFavorite(false);
        view.removeMessage(MESSAGE_FIRST_NAME_IS_MISSING);
        view.removeMessage(MESSAGE_LAST_NAME_IS_MISSING);
        view.removeMessage(MESSAGE_TEAM_NAME_IS_MISSING);
        view.removeMessage(MESSAGE_DUPLICATES_NOT_ALLOWED);

        boolean haveAllRequiredData = true;

        if (firstName.strip().isEmpty()) {
            view.addMessage(MESSAGE_FIRST_NAME_IS_MISSING);
            haveAllRequiredData = false;
        }

        if (lastName.strip().isEmpty()) {
            view.addMessage(MESSAGE_LAST_NAME_IS_MISSING);
            haveAllRequiredData = false;
        }

        if (teamName.strip().isEmpty()) {
            view.addMessage(MESSAGE_TEAM_NAME_IS_MISSING);
            haveAllRequiredData = false;
        }

        if (!haveAllRequiredData) {
            return;
        }

        if (store.contains(firstName.strip(), lastName.strip(), teamName.strip())) {
            view.addMessage(MESSAGE_DUPLICATES_NOT_ALLOWED);
            return;
        }

        view.enableAddFavorite(true);
    }

    @Override
    public void requestFavorites() {
        List<Player> favorites = store.queryFavorites();

        view.removeMessage(MESSAGE_NO_FAVORITES);

        if (favorites.isEmpty()) {
            view.addMessage(MESSAGE_NO_FAVORITES);
        }

        view.view(favorites);
    }
}
