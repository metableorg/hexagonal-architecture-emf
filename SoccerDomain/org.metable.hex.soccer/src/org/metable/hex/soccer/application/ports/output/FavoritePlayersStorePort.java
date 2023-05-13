package org.metable.hex.soccer.application.ports.output;

import java.util.List;

import org.metable.hex.soccer.application.ports.input.DeleteFavoritePlayerCommand;
import org.metable.hex.soccer.domain.entity.Player;

public interface FavoritePlayersStorePort {

    public void addFavorite(String firstName, String lastName, String teamName);

    public List<Player> queryFavorites();

    public void removeFavorite(DeleteFavoritePlayerCommand command);
}
