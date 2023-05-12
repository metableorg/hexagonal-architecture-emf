package org.metable.hex.soccer;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class MessagePanel extends JPanel {

    private JLabel messageTextLabel;

    /**
     * Create the panel.
     */
    public MessagePanel() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);

        JLabel messageLabel = new JLabel("Message:");
        GridBagConstraints gbc_messageLabel = new GridBagConstraints();
        gbc_messageLabel.insets = new Insets(0, 0, 0, 5);
        gbc_messageLabel.gridx = 0;
        gbc_messageLabel.gridy = 0;
        add(messageLabel, gbc_messageLabel);

        messageTextLabel = new JLabel("");
        GridBagConstraints gbc_messageTextLabel = new GridBagConstraints();
        gbc_messageTextLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_messageTextLabel.gridx = 1;
        gbc_messageTextLabel.gridy = 0;
        add(messageTextLabel, gbc_messageTextLabel);

    }

    public void addMessage(String message) {
        messageTextLabel.setText(message);
    }

    public void removeMessage(String message) {
        messageTextLabel.setText("");
    }

}
