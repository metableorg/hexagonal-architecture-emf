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

        @Override
        public List<Player> queryFavorites() {
            List<Player> result = new ArrayList<>(favoritePlayers);
            return result;
        }

        @Override
        public void removeFavorite(DeleteFavoritePlayerCommand command) {
            Player playerToDelete = null;

            for (Player player : favoritePlayers) {
                if (player.matches(command.firstName, command.lastName, command.teamName)) {
                    playerToDelete = player;
                    break;
                }
            }

            if (playerToDelete != null) {
                favoritePlayers.remove(playerToDelete);
            }
        }
    }

    private class FavoritePlayersView implements FavoritePlayersViewPort {

        private List<Player> favoritePlayers;
        private String firstName = "";
        private String lastName = "";
        private String teamName = "";
        private boolean addFavoriteEnabled;
        private boolean removeFavoriteEnabled;
        private List<String> messages = new ArrayList<>();

        private final PlayerCommandPort playerCommandPort;
        private Player selectedPlayer;

        public FavoritePlayersView() {
            playerCommandPort = new PlayerCommandPort(DefaultSoccerDslDriver.this.favoritePlayers, this);
        }

        @Override
        public void addMessage(String message) {
            messages.add(message);
        }

        @Override
        public void clearSelection() {
            selectedPlayer = null;
        }

        public void clickAddFavortePlayerButton() {
            AddFavoritePlayerCommand command = new AddFavoritePlayerCommand(getPlayerFirstName(), getPlayerLastName(),
                    getTeamName());
            playerCommandPort.addFavoritePlayer(command);
        }

        public void clickRemoveFavoritePlayerButton() {
            final Player selected = getSelectedPlayer();
            if (selected == null) {
                return;
            }

            DeleteFavoritePlayerCommand command = new DeleteFavoritePlayerCommand(selected.getFirstName(),
                    selected.getLastName(), selected.getTeamName());
            playerCommandPort.removeFavoritePlayer(command);
        }

        public boolean contains(String targetMessage) {

            for (String message : messages) {

                if (message.equals(targetMessage)) {
                    return true;
                }
            }

            return false;
        }

        public boolean contains(String firstName, String lastName, String teamName) {

            return getPlayer(firstName, lastName, teamName) != null;
        }

        public void enableAddFavorite(boolean value) {
            addFavoriteEnabled = value;
        }

        @Override
        public void enableRemoveFavorite(boolean value) {
            removeFavoriteEnabled = value;
        }

        public Player getPlayer(String firstName, String lastName, String teamName) {

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

                return player;
            }

            return null;
        }

        public String getPlayerFirstName() {
            return firstName;
        }

        public String getPlayerLastName() {
            return lastName;
        }

        public Player getSelectedPlayer() {
            return selectedPlayer;
        }

        public String getTeamName() {
            return teamName;
        }

        public boolean isAddFavoriteEnabled() {
            return addFavoriteEnabled;
        }

        public boolean isRemoveFavoriteEnabled() {
            return removeFavoriteEnabled;
        }

        public void refresh() {
            playerCommandPort.requestFavorites();
        }

        @Override
        public void removeMessage(String message) {

            messages.remove(message);
        }

        @Override
        public void selectionChanged(List<Integer> selectedIndices) {
        }

        public void selectPlayer(String firstName, String lastName, String teamName) {
            playerCommandPort.selectPlayer(firstName, lastName, teamName);
            selectedPlayer = new Player("0", firstName, lastName, teamName);
        }

        public void setPlayerFirstName(String name) {
            this.firstName = name;
            playerCommandPort.enterPlayerInfo(firstName, lastName, teamName);
        }

        public void setPlayerLastName(String name) {
            this.lastName = name;
            playerCommandPort.enterPlayerInfo(firstName, lastName, teamName);
        }

        public void setTeamName(String name) {
            this.teamName = name;
            playerCommandPort.enterPlayerInfo(firstName, lastName, teamName);
        }

        public void unselectPlayer(String firstName, String lastName, String teamName) {
            playerCommandPort.unselectPlayer(firstName, lastName, teamName);
        }

        @Override
        public void view(List<Player> players) {
            favoritePlayers = new ArrayList<>(players);
        }
    }

    private final FavoritePlayers favoritePlayers = new FavoritePlayers();
    private final FavoritePlayersView view = new FavoritePlayersView();

    @Override
    public void addFavoritePlayer() {

        view.clickAddFavortePlayerButton();
    }

    @Override
    public boolean addFavoritePlayerIsAvailable() {
        return view.isAddFavoriteEnabled();
    }

    @Override
    public void dispose() {
    }

    @Override
    public void enterPlayerInfo(String firstName, String lastName, String teamName) {

        view.setPlayerFirstName(firstName);
        view.setPlayerLastName(lastName);
        view.setTeamName(teamName);
    }

    @Override
    public void favoritePlayer(String firstName, String lastName, String teamName) {
        favoritePlayers.addFavorite(firstName, lastName, teamName);
        viewFavorites();
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
    public boolean favoritePlayersViewContainsMessage(String message) {

        return view.contains(message);
    }

    @Override
    public boolean favoritePlayersViewContainsPlayer(String firstName, String lastName, String teamName) {

        return view.contains(firstName, lastName, teamName);
    }

    @Override
    public int numberOfFavoritePlayers() {
        return favoritePlayers.queryFavorites().size();
    }

    @Override
    public void removeFavoritePlayer() {
        view.clickRemoveFavoritePlayerButton();
    }

    @Override
    public boolean removeFavoritePlayerIsAvailable() {
        return view.isRemoveFavoriteEnabled();
    }

    @Override
    public void selectPlayer(String firstName, String lastName, String teamName) {
        view.selectPlayer(firstName, lastName, teamName);
    }

    @Override
    public void unselectPlayer(String firstName, String lastName, String teamName) {
        view.unselectPlayer(firstName, lastName, teamName);

    }

    @Override
    public void viewFavorites() {
        view.refresh();

    }
}