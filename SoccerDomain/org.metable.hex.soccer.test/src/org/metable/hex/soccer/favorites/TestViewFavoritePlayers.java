package org.metable.hex.soccer.favorites;

import org.junit.Assert;
import org.junit.Test;
import org.metable.soccer.CommonTest;

public class TestViewFavoritePlayers extends CommonTest {

    @Test
    public void should_clear_no_favorites_message_when_first_favorite_players_is_added() {
        // Given
        dsl.viewFavoritePlayers();
        Assert.assertTrue(dsl.favoritePlayersViewContainsMessage("message: You have no favorite players."));
        dsl.enterPlayerInfo();

        // When
        dsl.addFavoritePlayer();

        // Then
        Assert.assertFalse(dsl.favoritePlayersViewContainsMessage("message: You have no favorite players."));
    }

    @Test
    public void should_show_favorite_players_when_requested_to_view_favorite_players() {
        // Given
        dsl.favoritePlayer("first name: Mason", "last name: Mount", "team name: Chelsea");
        dsl.favoritePlayer("first name: Thiago", "last name: Silva", "team name: Chelsea");

        // When
        dsl.viewFavoritePlayers();

        // Then
        Assert.assertTrue(
                dsl.favoritePlayersViewContainsPlayer("first name: Mason", "last name: Mount", "team name: Chelsea"));
        Assert.assertTrue(
                dsl.favoritePlayersViewContainsPlayer("first name: Thiago", "last name: Silva", "team name: Chelsea"));
    }

    @Test
    public void should_show_no_favorites_message_when_last_favorite_player_is_deleted() {
        // Given
        dsl.favoritePlayer("first name: Mason", "last name: Mount", "team name: Chelsea");

        // When
        dsl.removeFavoritePlayer("first name: Mason", "last name: Mount", "team name: Chelsea");

        // Then
        Assert.assertTrue(dsl.favoritePlayersViewContainsMessage("message: You have no favorite players."));
    }

    @Test
    public void should_show_no_favorites_message_when_requested_to_view_favorite_players_and_there_are_no_favorites() {
        // When
        dsl.viewFavoritePlayers();

        // Then
        Assert.assertTrue(dsl.favoritePlayersViewContainsMessage("message: You have no favorite players."));
    }
}
