package GUI;

import javax.swing.*;
import java.awt.*;
import Deck.*;

public class DeckScreen extends javax.swing.JFrame {
    
    public DeckScreen(String init) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        button22 = new java.awt.Button();
        save = new java.awt.Button();
        Load = new java.awt.Button();
        mainMenu = new java.awt.Button();
        deckListTitle = new java.awt.Label();
        CardCollectionPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new java.awt.Button();
        DeckScrollPane = new javax.swing.JScrollPane();
        DeckPane = new javax.swing.JPanel();

        button22.setLabel("button22");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setForeground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        save.setActionCommand("saveDeck");
        save.setBackground(new java.awt.Color(204, 204, 255));
        save.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(51, 51, 51));
        save.setLabel("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(save, gridBagConstraints);

        Load.setActionCommand("load");
        Load.setBackground(new java.awt.Color(204, 204, 255));
        Load.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        Load.setForeground(new java.awt.Color(51, 51, 51));
        Load.setLabel("LOAD");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(Load, gridBagConstraints);
        Load.getAccessibleContext().setAccessibleName("load");

        mainMenu.setActionCommand("mainMenu");
        mainMenu.setBackground(new java.awt.Color(204, 204, 255));
        mainMenu.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        mainMenu.setForeground(new java.awt.Color(51, 51, 51));
        mainMenu.setLabel("MAIN MENU");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(mainMenu, gridBagConstraints);

        deckListTitle.setAlignment(java.awt.Label.CENTER);
        deckListTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deckListTitle.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        deckListTitle.setForeground(new java.awt.Color(51, 51, 51));
        deckListTitle.setText("DECK LIST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(deckListTitle, gridBagConstraints);

        CardCollectionPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CardCollectionPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        CardCollectionPane.setAutoscrolls(true);
        CardCollectionPane.setMaximumSize(null);
        CardCollectionPane.setMinimumSize(null);

        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());
        CardCollectionPane.setViewportView(jPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(CardCollectionPane, gridBagConstraints);

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setForeground(new java.awt.Color(51, 51, 51));
        searchField.setToolTipText("");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(searchField, gridBagConstraints);

        searchButton.setBackground(new java.awt.Color(204, 204, 204));
        searchButton.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        searchButton.setLabel("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(searchButton, gridBagConstraints);

        DeckScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        DeckScrollPane.setMinimumSize(new java.awt.Dimension(300, 6));
        DeckScrollPane.setPreferredSize(new java.awt.Dimension(300, 200));

        DeckPane.setForeground(new java.awt.Color(204, 204, 255));
        DeckPane.setLayout(new java.awt.GridBagLayout());
        DeckScrollPane.setViewportView(DeckPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(DeckScrollPane, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        Main.search(searchField);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        Main.mainMenu();
    }//GEN-LAST:event_mainMenuActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        Main.saveDeck();
    }//GEN-LAST:event_saveActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        Main.loadDeck();
    }//GEN-LAST:event_LoadActionPerformed

    // Create a button for the card and add it to the card collection pane
    public void addCards(String buttonID, String buttonText, int PositionY) {
        JButton button = new JButton(buttonText);
        button.setName(buttonID);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        
        GridBagConstraints gridBagConstraints;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = PositionY;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(button, gridBagConstraints);
    }
    
    // Create a label for a card and add it to the deck pane
    public void addCardLabel(String cardID, String labelText, int PositionY) {
        JLabel label = new JLabel(labelText);
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setName(cardID);
        label.setText(labelText);
        
        GridBagConstraints gridBagConstraints;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = PositionY;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);

        DeckPane.add(label, gridBagConstraints);
    }
    
    // Create a remove button for a card and add it to the deck pane
    public void addRemoveButton(String cardID, int PositionY) {
        String buttonText = "x";
        JButton button = new JButton(buttonText);
        button.setBackground(new java.awt.Color(255, 51, 51));
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setName(cardID);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        
        GridBagConstraints gridBagConstraints;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = PositionY;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        DeckPane.add(button, gridBagConstraints);
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {
        // Controller
        Main.add((JButton)evt.getSource());
    }
    
    private void removeActionPerformed(java.awt.event.ActionEvent evt) {
        // Controller
        Main.remove((JButton)evt.getSource());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CardCollectionPane;
    public javax.swing.JPanel DeckPane;
    private javax.swing.JScrollPane DeckScrollPane;
    private java.awt.Button Load;
    private java.awt.Button button22;
    private java.awt.Label deckListTitle;
    public javax.swing.JPanel jPanel1;
    private java.awt.Button mainMenu;
    private java.awt.Button save;
    private java.awt.Button searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables

}
