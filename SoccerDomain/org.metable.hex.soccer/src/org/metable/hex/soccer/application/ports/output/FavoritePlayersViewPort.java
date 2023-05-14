package org.metable.hex.soccer.application.ports.output;

import java.util.List;

import org.metable.hex.soccer.domain.entity.Player;

public interface FavoritePlayersViewPort {

    public void addMessage(String message);

    public void enableAddFavorite(boolean value);

    public void removeMessage(String message);

    public void view(List<Player> players);
}
