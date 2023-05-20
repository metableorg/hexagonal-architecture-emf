package org.metable.hex.soccer.driver;

public interface SoccerDslDriver {

    void addFavoritePlayer();

    boolean addFavoritePlayerIsAvailable();

    void dispose();

    void enterPlayerInfo(String firstName, String lastName, String teamName);

    void favoritePlayer(String firstName, String lastName, String teamName);

    boolean favoritePlayersContains(String firstName, String lastName, String teamName);

    boolean favoritePlayersViewContainsMessage(String message);

    boolean favoritePlayersViewContainsPlayer(String firstName, String lastName, String teamName);

    int numberOfFavoritePlayers();

    void removeFavoritePlayer();

    boolean removeFavoritePlayerIsAvailable();

    void selectPlayer(String firstName, String lastName, String teamName);

    void unselectPlayer(String firstName, String lastName, String teamName);

    void viewFavorites();
}
