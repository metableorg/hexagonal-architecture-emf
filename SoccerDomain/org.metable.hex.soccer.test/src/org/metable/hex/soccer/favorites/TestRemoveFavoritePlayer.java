package org.metable.hex.soccer.favorites;

import org.junit.Assert;
import org.junit.Test;
import org.metable.soccer.CommonTest;

public class TestRemoveFavoritePlayer extends CommonTest {

    @Test
    public void should_allow_removal_when_a_player_is_selected() {
        // Given
        dsl.favoritePlayer("first name: Mason", "last name: Mount", "team name: Chelsea");
        Assert.assertFalse(dsl.removeFavoritePlayerIsAvailable());

        // When
        dsl.selectPlayer("first name: Mason", "last name: Mount", "team name: Chelsea");

        // Then
        Assert.assertTrue(dsl.removeFavoritePlayerIsAvailable());
    }

    @Test
    public void should_prevent_removal_when_no_player_selected() {
        // Given
        dsl.favoritePlayer("first name: Mason", "last name: Mount", "team name: Chelsea");
        dsl.selectPlayer("first name: Mason", "last name: Mount", "team name: Chelsea");
        Assert.assertTrue(dsl.removeFavoritePlayerIsAvailable());

        // When
        dsl.unselectPlayer("first name: Mason", "last name: Mount", "team name: Chelsea");

        // Then
        Assert.assertFalse(dsl.removeFavoritePlayerIsAvailable());
    }

    @Test
    public void should_remove_selected_player() {
        // Given
        dsl.favoritePlayer("first name: Mason", "last name: Mount", "team name: Chelsea");
        dsl.favoritePlayer("first name: Thiago", "last name: Silva", "team name: Chelsea");

        dsl.selectPlayer("first name: Mason", "last name: Mount", "team name: Chelsea");

        // When
        dsl.removeFavoritePlayer();

        // Then
        Assert.assertFalse(dsl.removeFavoritePlayerIsAvailable());
        Assert.assertFalse(
                dsl.favoritePlayersViewContainsPlayer("first name: Mason", "last name: Mount", "team name: Chelsea"));
        Assert.assertTrue(
                dsl.favoritePlayersViewContainsPlayer("first name: Thiago", "last name: Silva", "team name: Chelsea"));
    }
}
