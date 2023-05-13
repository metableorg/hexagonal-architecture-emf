package org.metable.hex.soccer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.metable.hex.soccer.domain.entity.Player;

@SuppressWarnings("serial")
public class FavoritePlayersPanel extends JPanel {

    private JList<String> favoritePlayersList;
    private ListModel listModel;

    private class ListModel extends DefaultListModel<String> {

        public void view(List<Player> players) {
            clear();
            for (Player player : players) {
                final String row = player.getFirstName() + " " + player.getLastName() + " " + player.getTeamName();
                addElement(row);
            }
        }
    }

    /**
     * Create the panel.
     */
    public FavoritePlayersPanel() {
        setLayout(new BorderLayout(0, 0));

        JButton showFavoritesButton = new JButton("Show Favorite Players");
        showFavoritesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FavoritesViewPanel parent = (FavoritesViewPanel) getParent();
                parent.requestFavorites();
            }
        });
        add(showFavoritesButton, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);
        
        favoritePlayersList = new JList<>();
        listModel = new ListModel();
        favoritePlayersList.setModel(listModel);
        scrollPane.setViewportView(favoritePlayersList);

    }

    public void view(List<Player> players) {
        listModel.clear();
        listModel.view(players);
    }
}
