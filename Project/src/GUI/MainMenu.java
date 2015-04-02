package GUI;

public class MainMenu extends javax.swing.JFrame {
    public MainMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenuPanel = new javax.swing.JPanel();
        MenuTitle = new java.awt.Label();
        NewDeck = new java.awt.Button();
        LoadDeck = new java.awt.Button();
        Exit = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        MainMenuPanel.setBackground(new java.awt.Color(0, 51, 102));
        MainMenuPanel.setMaximumSize(new java.awt.Dimension(960, 640));
        MainMenuPanel.setMinimumSize(new java.awt.Dimension(600, 600));
        MainMenuPanel.setPreferredSize(new java.awt.Dimension(600, 600));
        MainMenuPanel.setLayout(new java.awt.GridLayout(4, 1, 0, 20));

        MenuTitle.setAlignment(java.awt.Label.CENTER);
        MenuTitle.setFont(new java.awt.Font("Lucida Console", 0, 34)); // NOI18N
        MenuTitle.setForeground(new java.awt.Color(255, 255, 0));
        MenuTitle.setText("HEARTHSTONE DECK BUILDERINO");
        MainMenuPanel.add(MenuTitle);

        NewDeck.setActionCommand("NewDeck");
        NewDeck.setBackground(new java.awt.Color(204, 204, 255));
        NewDeck.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        NewDeck.setForeground(new java.awt.Color(51, 51, 51));
        NewDeck.setLabel("NEW DECK");
        NewDeck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDeckActionPerformed(evt);
            }
        });
        MainMenuPanel.add(NewDeck);
        NewDeck.getAccessibleContext().setAccessibleName("NewDeck");

        LoadDeck.setActionCommand("LoadDeck");
        LoadDeck.setBackground(new java.awt.Color(204, 204, 255));
        LoadDeck.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        LoadDeck.setForeground(new java.awt.Color(51, 51, 51));
        LoadDeck.setLabel("LOAD DECK");
        LoadDeck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadDeckActionPerformed(evt);
            }
        });
        MainMenuPanel.add(LoadDeck);
        LoadDeck.getAccessibleContext().setAccessibleName("LoadDeck");
        LoadDeck.getAccessibleContext().setAccessibleDescription("");

        Exit.setActionCommand("Exit");
        Exit.setBackground(new java.awt.Color(204, 204, 255));
        Exit.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(51, 51, 51));
        Exit.setLabel("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        MainMenuPanel.add(Exit);
        Exit.getAccessibleContext().setAccessibleName("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewDeckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDeckActionPerformed
        Controller.newDeck();
    }//GEN-LAST:event_NewDeckActionPerformed

    private void LoadDeckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadDeckActionPerformed
        Controller.loadDeck();
    }//GEN-LAST:event_LoadDeckActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Exit;
    private java.awt.Button LoadDeck;
    private javax.swing.JPanel MainMenuPanel;
    private java.awt.Label MenuTitle;
    private java.awt.Button NewDeck;
    // End of variables declaration//GEN-END:variables
}
