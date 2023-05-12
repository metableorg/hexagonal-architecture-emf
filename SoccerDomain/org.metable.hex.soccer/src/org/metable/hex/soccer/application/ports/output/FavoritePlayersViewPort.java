package org.metable.hex.soccer.application.ports.output;

import java.util.List;

import org.metable.hex.soccer.domain.entity.Player;

public interface FavoritePlayersViewPort {

    public void view(List<Player> players);

    public void enableAddFavorite(boolean value);

    public void addMessage(String message);

    public void removeMessage(String message);
}
