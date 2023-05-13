package org.metable.hex.soccer.driver;

import java.util.ArrayList;
import java.util.List;

import org.metable.hex.soccer.application.ports.input.AddFavoritePlayerCommand;
import org.metable.hex.soccer.application.ports.input.DeleteFavoritePlayerCommand;
import org.metable.hex.soccer.application.ports.input.PlayerCommandPort;
import org.metable.hex.soccer.application.ports.output.FavoritePlayersStorePort;
import org.metable.hex.soccer.application.ports.output.FavoritePlayersViewPort;
import org.metable.hex.soccer.domain.entity.Player;

public class DefaultSoccerDslDriver implements SoccerDslDriver {

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
        public void removeFavorite(String identity) {
            Player playerToDelete = null;

            for (Player player : favoritePlayers) {
                if (player.hasId(identity)) {
                    playerToDelete = player;
                    break;
                }
            }

            if (playerToDelete != null) {
                favoritePlayers.remove(playerToDelete);
            }
        }
    }

    private static class FavoritePlayersView implements FavoritePlayersViewPort {

        private List<Player> favoritePlayers;
        private String firstName;
        private String lastName;
        private String teamName;
        private boolean addFavoriteEnabled;
        private List<String> messages = new ArrayList<>();

        @Override
        public void view(List<Player> players) {
            this.favoritePlayers = new ArrayList<>(players);
        }

        public boolean contains(String firstName, String lastName, String teamName) {

            for (Player player : favoritePlayers) {

                if (!player.getFirstName().equals(firstName)) {
                    continue;
                }

                if (!player.getLastName().equals(lastName)) {
                    continue;
                }

                if (!player.getTeamName().equals(teamName)) {
                    continue;
                }

                return true;
            }

            return false;
        }

        public boolean contains(String targetMessage) {

            for (String message : messages) {

                if (message.equals(targetMessage)) {
                    return true;
                }
            }

            return false;
        }

        public void setPlayerFirstName(String name) {
            this.firstName = name;
        }

        public void setPlayerLastName(String name) {
            this.lastName = name;
        }

        public void setTeamName(String name) {
            this.teamName = name;
        }

        public void enableAddFavorite(boolean value) {
            addFavoriteEnabled = value;
        }

        public boolean isAddFavoriteEnabled() {
            return addFavoriteEnabled;
        }

        public String getPlayerFirstName() {
            return firstName;
        }

        public String getPlayerLastName() {
            return lastName;
        }

        public String getTeamName() {
            return teamName;
        }

        @Override
        public void addMessage(String message) {
            messages.add(message);
        }

        @Override
        public void removeMessage(String message) {

            messages.remove(message);
        }
    }

    private final FavoritePlayers favoritePlayers = new FavoritePlayers();
    private final FavoritePlayersView view = new FavoritePlayersView();

    private final PlayerCommandPort playerCommandPort = new PlayerCommandPort(favoritePlayers, view);

    @Override
    public void viewFavorites() {
        playerCommandPort.requestFavorites();
    }

    @Override
    public void favoritePlayer(String firstName, String lastName, String teamName) {
        favoritePlayers.addFavorite(firstName, lastName, teamName);
        viewFavorites();
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean favoritePlayersViewContainsPlayer(String firstName, String lastName, String teamName) {

        return view.contains(firstName, lastName, teamName);
    }

    @Override
    public boolean favoritePlayersViewContainsMessage(String message) {

        return view.contains(message);
    }

    @Override
    public void enterPlayerInfo(String firstName, String lastName, String teamName) {
        view.setPlayerFirstName(firstName);
        view.setPlayerLastName(lastName);
        view.setTeamName(teamName);

        playerCommandPort.enterPlayerInfo(firstName, lastName, teamName);
    }

    @Override
    public boolean favoritePlayersContains(String firstName, String lastName, String teamName) {
        List<Player> favorites = favoritePlayers.queryFavorites();

        for (Player player : favorites) {

            if (!player.getFirstName().equals(firstName)) {
                continue;
            }

            if (!player.getLastName().equals(lastName)) {
                continue;
            }

            if (!player.getTeamName().equals(teamName)) {
                continue;
            }

            return true;
        }

        return false;
    }

    @Override
    public void addFavoritePlayer() {

        if (!view.isAddFavoriteEnabled()) {
            throw new java.lang.IllegalStateException("Add favorite player not enabled.");
        }

        AddFavoritePlayerCommand command = new AddFavoritePlayerCommand(view.getPlayerFirstName(),
                view.getPlayerLastName(), view.getTeamName());

        playerCommandPort.addFavoritePlayer(command);
    }

    @Override
    public void deleteFavoritePlayer(String identity) {
        DeleteFavoritePlayerCommand command = new DeleteFavoritePlayerCommand(identity);
        playerCommandPort.deleteFavoritePlayer(command);
    }

}