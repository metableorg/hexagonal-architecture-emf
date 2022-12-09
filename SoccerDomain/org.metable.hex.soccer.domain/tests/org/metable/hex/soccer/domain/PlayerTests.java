package org.metable.hex.soccer.domain;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.metable.hex.soccer.domain.entity.Player;

public class PlayerTests {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void players_with_the_same_id_are_equal() {
        // Arrange
        Player player1 = new Player("23", "John", "Smith");
        Player player2 = new Player("23", "John", "Smith");

        // Act
        final boolean result = player1.equals(player2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void player_id_is_a_search_key() {
        // Arrange
        Player player1 = new Player("23", "Player", "One");
        Player player2 = new Player("23", "Player", "Two");

        Map<Player, String> map = new HashMap<>();
        map.put(player1, "player 1 result");

        // Act
        final String result = map.get(player2);

        // Assert
        Assert.assertEquals("player 1 result", result);
    }

    @Test
    public void player_is_equal_to_self() {
        // Arrange
        Player player = new Player("23", "John", "Smith");

        // Act
        final boolean result = player.equals(player);

        // Asset
        Assert.assertTrue(result);
    }

    @Test
    public void player_is_not_equal_to_null() {
        // Arrange
        Player player = new Player("23", "John", "Smith");

        // Act
        final boolean result = player.equals(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void player_is_not_equal_to_string() {
        // Arrange
        Player player = new Player("23", "John", "Smith");

        // Act
        @SuppressWarnings("unlikely-arg-type")
        final boolean result = player.equals("abc");

        // Assert
        Assert.assertFalse(result);
    }

}
