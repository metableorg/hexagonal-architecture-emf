package org.metable.hex.soccer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.metable.hex.soccer.application.ports.input.DeleteFavoritePlayerCommand;
import org.metable.hex.soccer.application.ports.output.FavoritePlayersStorePort;
import org.metable.hex.soccer.domain.entity.Player;

public class SoccerApp {

    private JFrame frame;
    private FavoritesViewPanel view;
    private FavoritePlayers favoritePlayers;

    private static class FavoritePlayers implements FavoritePlayersStorePort {

        private final List<Player> favoritePlayers = new ArrayList<>();

        @Override
        public void addFavorite(String firstName, String lastName, String teamName) {
            Player player = new Player(favoritePlayers.size() + "", firstName, lastName, teamName);

            favoritePlayers.add(player);
        }

        @Override
        public List<Player> queryFavorites() {
            List<Player> result = new ArrayList<>(favoritePlayers);
            return result;
        }

        @Override
        public void removeFavorite(DeleteFavoritePlayerCommand command) {
        }
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SoccerApp window = new SoccerApp();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public SoccerApp() {
        favoritePlayers = new FavoritePlayers();
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 691, 595);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        view = new FavoritesViewPanel(favoritePlayers);
        frame.getContentPane().add(view, BorderLayout.CENTER);
    }

}
