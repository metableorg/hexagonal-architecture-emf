package org.metable.hex.soccer;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;

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

        PlayerCommandPort playerCommandPort = new PlayerCommandPort(favoritePlayers, this);

        favoritePlayerForm = new AddFavoritePlayerFormPanel(playerCommandPort);
        add(favoritePlayerForm, BorderLayout.NORTH);

        favoritePlayersPanel = new FavoritePlayersPanel(playerCommandPort);
        add(favoritePlayersPanel, BorderLayout.CENTER);

        messagePanel = new MessagePanel();
        add(messagePanel, BorderLayout.SOUTH);

        playerCommandPort.requestFavorites();
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
}
