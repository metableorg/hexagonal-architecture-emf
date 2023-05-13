package org.metable.hex.soccer.driver;

public interface SoccerDslDriver {

    void addFavoritePlayer();

    boolean addFavoritePlayerIsAvailable();

    void deleteFavoritePlayer(String firstName, String lastName, String teamName);

    void dispose();

    void enterPlayerInfo(String firstName, String lastName, String teamName);

    void favoritePlayer(String firstName, String lastName, String teamName);

    boolean favoritePlayersContains(String firstName, String lastName, String teamName);

    boolean favoritePlayersViewContainsMessage(String message);

    boolean favoritePlayersViewContainsPlayer(String firstName, String lastName, String teamName);

    void viewFavorites();

}
