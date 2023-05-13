package org.metable.hex.soccer.favorites;

import org.junit.Assert;
import org.junit.Test;
import org.metable.soccer.CommonTest;

public class TestAddFavoritePlayer extends CommonTest {

    @Test
    public void should_add_player_when_full_name_and_team_are_given() {
        // Given
        dsl.enterPlayerInfo("first name: Mason", "last name: Mount", "team name: Chelsea");

        // When
        dsl.addFavoritePlayer();

        // Then
        Assert.assertTrue(dsl.favoritePlayersContains("first name: Mason", "last name: Mount", "team name: Chelsea"));
    }

    @Test
    public void should_prevent_add_player_when_first_name_is_missing() {
        // When
        dsl.enterPlayerInfo("first name: ", "last name: Mount", "team name: Chelsea");

        // Then
        Assert.assertFalse(dsl.addFavoritePlayerIsAvailable());
        Assert.assertTrue(dsl.favoritePlayersViewContainsMessage("message: First name is missing."));
    }

    @Test
    public void should_prevent_add_player_when_team_name_is_missing() {
        // When
        dsl.enterPlayerInfo("first name: Mason", "last name: Mount", "team name: ");

        // Then
        Assert.assertFalse(dsl.addFavoritePlayerIsAvailable());
        Assert.assertTrue(dsl.favoritePlayersViewContainsMessage("message: Team name is missing."));
    }

    @Test
    public void should_prevent_add_player_when_last_name_is_missing() {
        // When
        dsl.enterPlayerInfo("first name: Mason", "last name: ", "team name: Chelsea");

        // Then
        Assert.assertFalse(dsl.addFavoritePlayerIsAvailable());
        Assert.assertTrue(dsl.favoritePlayersViewContainsMessage("message: Last name is missing."));
    }
}
