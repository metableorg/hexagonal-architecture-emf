package org.metable.hex.soccer.dsl;

import org.metable.hex.soccer.driver.SoccerDslDriver;

public class SoccerDsl {

    private final SoccerDslDriver driver;

    public SoccerDsl(SoccerDslDriver driver) {
        this.driver = driver;
    }

    public void enterPlayerInfo(String... args) {
        final Parameters params = new Parameters(args);
        final String firstName = params.Optional("first name", "Mason");
        final String lastName = params.Optional("last name", "Mount");
        final String teamName = params.Optional("team name", "Chelsea");

        driver.enterPlayerInfo(firstName, lastName, teamName);
    }

    public void viewFavoritePlayers() {
        driver.viewFavorites();
    }

    public void favoritePlayer(String... args) {
        final Parameters params = new Parameters(args);
        final String firstName = params.Optional("first name", "Mason");
        final String lastName = params.Optional("last name", "Mount");
        final String teamName = params.Optional("team name", "Chelsea");

        driver.favoritePlayer(firstName, lastName, teamName);
    }

    public boolean favoritePlayersViewContainsPlayer(String... args) {
        final Parameters params = new Parameters(args);
        final String firstName = params.Optional("first name", "Mason");
        final String lastName = params.Optional("last name", "Mount");
        final String teamName = params.Optional("team name", "Chelsea");

        return driver.favoritePlayersViewContainsPlayer(firstName, lastName, teamName);
    }

    public boolean favoritePlayersViewContainsMessage(String... args) {
        final Parameters params = new Parameters(args);
        final String message = params.Optional("message", "");

        return driver.favoritePlayersViewContainsMessage(message);
    }

    public void addFavoritePlayer() {
        driver.addFavoritePlayer();
    }

    public boolean favoritePlayersContains(String... args) {
        final Parameters params = new Parameters(args);
        final String firstName = params.Optional("first name", "Mason");
        final String lastName = params.Optional("last name", "Mount");
        final String teamName = params.Optional("team name", "Chelsea");

        return driver.favoritePlayersContains(firstName, lastName, teamName);
    }

    public void deleteFavoritePlayer(String... args) {
        final Parameters params = new Parameters(args);
        final String identity = params.Optional("identity", "1");

        driver.deleteFavoritePlayer(identity);
    }
}
