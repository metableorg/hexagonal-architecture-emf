package org.metable.hex.soccer;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;

import org.metable.hex.soccer.application.ports.input.AddFavoritePlayerCommand;
import org.metable.hex.soccer.application.ports.input.PlayerCommandPort;
import org.metable.hex.soccer.application.ports.output.FavoritePlayersStorePort;
import org.metable.hex.soccer.application.ports.output.FavoritePlayersViewPort;
import org.metable.hex.soccer.domain.entity.Player;

@SuppressWarnings("serial")
public class FavoritesViewPanel extends JPanel implements FavoritePlayersViewPort {

    private AddFavoritePlayerFormPanel favoritePlayerForm;
    private FavoritePlayersPanel favoritePlayersPanel;
    private FavoritePlayersStorePort favoritePlayers;
    private MessagePanel messagePanel;
    private PlayerCommandPort playerCommandPort;

    /**
     * Create the panel.
     */
    public FavoritesViewPanel() {
        init();
    }

    public FavoritesViewPanel(FavoritePlayersStorePort favoritePlayers) {
        this.favoritePlayers = favoritePlayers;
        init();
    }

    private void init() {
        setLayout(new BorderLayout(0, 0));

        favoritePlayerForm = new AddFavoritePlayerFormPanel();
        add(favoritePlayerForm, BorderLayout.NORTH);

        favoritePlayersPanel = new FavoritePlayersPanel();
        add(favoritePlayersPanel, BorderLayout.CENTER);

        messagePanel = new MessagePanel();
        add(messagePanel, BorderLayout.SOUTH);

        playerCommandPort = new PlayerCommandPort(favoritePlayers, this);

        enterPlayerInfo("", "", "");
    }

    @Override
    public void view(List<Player> players) {
        favoritePlayersPanel.view(players);
    }

    @Override
    public void enableAddFavorite(boolean value) {
        favoritePlayerForm.enableAddFavorite(value);
    }

    @Override
    public void addMessage(String message) {
        messagePanel.addMessage(message);
    }

    @Override
    public void removeMessage(String message) {
        messagePanel.removeMessage(message);
    }

    public void enterPlayerInfo(String firstName, String lastName, String teamName) {
        playerCommandPort.enterPlayerInfo(firstName, lastName, teamName);
    }

    public void addFavoritePlayer(AddFavoritePlayerCommand command) {
        playerCommandPort.addFavoritePlayer(command);
    }

    public void requestFavorites() {
        playerCommandPort.requestFavorites();
    }
}
