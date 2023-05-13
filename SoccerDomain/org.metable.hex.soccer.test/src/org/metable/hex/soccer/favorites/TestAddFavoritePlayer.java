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
    public void should_prevent_add_player_when_team_name_is_missing() {
        // Given

        // When
        dsl.enterPlayerInfo("first name: Mason", "last name: Mount", "team name:");

        // Then
//        Assert.assertTrue(dsl.addFavoritePlayerIsNotAvailable());
//        Assert.assertTrue(dsl.informationalMessagesContains("Team name is missing."));
    }
}
