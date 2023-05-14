package org.metable.hex.soccer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.metable.hex.soccer.application.ports.input.AddFavoritePlayerCommand;

@SuppressWarnings("serial")
public class AddFavoritePlayerFormPanel extends JPanel {
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField teamNameTextField;
    private JButton addButton;

    /**
     * Create the panel.
     */
    public AddFavoritePlayerFormPanel() {
        setLayout(new BorderLayout(0, 0));

        JPanel formPanel = new JPanel();
        add(formPanel, BorderLayout.CENTER);
        GridBagLayout gbl_formPanel = new GridBagLayout();
        gbl_formPanel.columnWidths = new int[] { 60, 378, 0 };
        gbl_formPanel.rowHeights = new int[] { 19, 19, 19, 0 };
        gbl_formPanel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
        gbl_formPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
        formPanel.setLayout(gbl_formPanel);

        JLabel firstNameLabel = new JLabel("First Name:");
        GridBagConstraints gbc_firstNameLabel = new GridBagConstraints();
        gbc_firstNameLabel.anchor = GridBagConstraints.EAST;
        gbc_firstNameLabel.insets = new Insets(0, 0, 5, 5);
        gbc_firstNameLabel.gridx = 0;
        gbc_firstNameLabel.gridy = 0;
        formPanel.add(firstNameLabel, gbc_firstNameLabel);

        firstNameTextField = new JTextField();
        firstNameTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                FavoritesViewPanel parent = (FavoritesViewPanel) getParent();
                parent.enterPlayerInfo(firstNameTextField.getText(), lastNameTextField.getText(),
                        teamNameTextField.getText());
            }
        });
        GridBagConstraints gbc_firstNameTextField = new GridBagConstraints();
        gbc_firstNameTextField.anchor = GridBagConstraints.NORTH;
        gbc_firstNameTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_firstNameTextField.insets = new Insets(0, 0, 5, 0);
        gbc_firstNameTextField.gridx = 1;
        gbc_firstNameTextField.gridy = 0;
        formPanel.add(firstNameTextField, gbc_firstNameTextField);
        firstNameTextField.setColumns(10);

        JLabel lastNameLabel = new JLabel("Last Name:");
        GridBagConstraints gbc_lastNameLabel = new GridBagConstraints();
        gbc_lastNameLabel.anchor = GridBagConstraints.EAST;
        gbc_lastNameLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lastNameLabel.gridx = 0;
        gbc_lastNameLabel.gridy = 1;
        formPanel.add(lastNameLabel, gbc_lastNameLabel);

        lastNameTextField = new JTextField();
        lastNameTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                FavoritesViewPanel parent = (FavoritesViewPanel) getParent();
                parent.enterPlayerInfo(firstNameTextField.getText(), lastNameTextField.getText(),
                        teamNameTextField.getText());
            }
        });
        GridBagConstraints gbc_lastNameTextField = new GridBagConstraints();
        gbc_lastNameTextField.anchor = GridBagConstraints.NORTH;
        gbc_lastNameTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_lastNameTextField.insets = new Insets(0, 0, 5, 0);
        gbc_lastNameTextField.gridx = 1;
        gbc_lastNameTextField.gridy = 1;
        formPanel.add(lastNameTextField, gbc_lastNameTextField);
        lastNameTextField.setColumns(10);

        JLabel teamNameLabel = new JLabel("Team Name:");
        GridBagConstraints gbc_teamNameLabel = new GridBagConstraints();
        gbc_teamNameLabel.anchor = GridBagConstraints.EAST;
        gbc_teamNameLabel.insets = new Insets(0, 0, 0, 5);
        gbc_teamNameLabel.gridx = 0;
        gbc_teamNameLabel.gridy = 2;
        formPanel.add(teamNameLabel, gbc_teamNameLabel);

        teamNameTextField = new JTextField();
        teamNameTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                FavoritesViewPanel parent = (FavoritesViewPanel) getParent();
                parent.enterPlayerInfo(firstNameTextField.getText(), lastNameTextField.getText(),
                        teamNameTextField.getText());
                ;
            }
        });
        GridBagConstraints gbc_teamNameTextField = new GridBagConstraints();
        gbc_teamNameTextField.anchor = GridBagConstraints.NORTH;
        gbc_teamNameTextField.fill = GridBagConstraints.HORIZONTAL;
        gbc_teamNameTextField.gridx = 1;
        gbc_teamNameTextField.gridy = 2;
        formPanel.add(teamNameTextField, gbc_teamNameTextField);
        teamNameTextField.setColumns(10);

        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        addButton = new JButton("Add Player");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddFavoritePlayerCommand command = new AddFavoritePlayerCommand(firstNameTextField.getText(),
                        lastNameTextField.getText(), teamNameTextField.getText());

                FavoritesViewPanel parent = (FavoritesViewPanel) getParent();
                parent.addFavoritePlayer(command);
            }
        });
        addButton.setEnabled(false);
        buttonPanel.add(addButton);

        JPanel panel = new JPanel();
        add(panel, BorderLayout.NORTH);
    }

    public void enableAddFavorite(boolean value) {
        addButton.setEnabled(value);
    }
}
