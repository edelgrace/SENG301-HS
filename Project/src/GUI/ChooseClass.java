package GUI;
public class ChooseClass extends javax.swing.JFrame {
   
    public ChooseClass() {
        initComponents();
    }
    
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseClass().setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ClassPanel = new javax.swing.JPanel();
        Druid = new java.awt.Button();
        Hunter = new java.awt.Button();
        Mage = new java.awt.Button();
        Paladin = new java.awt.Button();
        Priest = new java.awt.Button();
        Shaman = new java.awt.Button();
        Rogue = new java.awt.Button();
        Warrior = new java.awt.Button();
        Warlock = new java.awt.Button();
        Back = new java.awt.Button();
        ClassTitle = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ClassPanel.setBackground(new java.awt.Color(0, 51, 102));
        ClassPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        ClassPanel.setMinimumSize(new java.awt.Dimension(250, 250));
        ClassPanel.setName(""); // NOI18N
        ClassPanel.setPreferredSize(new java.awt.Dimension(250, 250));
        ClassPanel.setLayout(new java.awt.GridBagLayout());

        Druid.setBackground(new java.awt.Color(204, 204, 255));
        Druid.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Druid.setLabel("Druid");
        Druid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DruidActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Druid, gridBagConstraints);

        Hunter.setBackground(new java.awt.Color(204, 204, 255));
        Hunter.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Hunter.setLabel("Hunter");
        Hunter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HunterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Hunter, gridBagConstraints);

        Mage.setBackground(new java.awt.Color(204, 204, 255));
        Mage.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Mage.setLabel("Mage");
        Mage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MageActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Mage, gridBagConstraints);

        Paladin.setBackground(new java.awt.Color(204, 204, 255));
        Paladin.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Paladin.setLabel("Paladin");
        Paladin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaladinActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Paladin, gridBagConstraints);

        Priest.setBackground(new java.awt.Color(204, 204, 255));
        Priest.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Priest.setLabel("Priest");
        Priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Priest, gridBagConstraints);

        Shaman.setBackground(new java.awt.Color(204, 204, 255));
        Shaman.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Shaman.setLabel("Shaman");
        Shaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShamanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Shaman, gridBagConstraints);

        Rogue.setBackground(new java.awt.Color(204, 204, 255));
        Rogue.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Rogue.setLabel("Rogue");
        Rogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RogueActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Rogue, gridBagConstraints);

        Warrior.setBackground(new java.awt.Color(204, 204, 255));
        Warrior.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Warrior.setLabel("Warrior");
        Warrior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarriorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Warrior, gridBagConstraints);

        Warlock.setBackground(new java.awt.Color(204, 204, 255));
        Warlock.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Warlock.setLabel("Warlock");
        Warlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarlockActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Warlock, gridBagConstraints);

        Back.setLabel("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(Back, gridBagConstraints);

        ClassTitle.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        ClassTitle.setForeground(new java.awt.Color(255, 255, 0));
        ClassTitle.setText("CHOOSE A CLASS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        ClassPanel.add(ClassTitle, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.back();
    }                                     

    private void DruidActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Druid");
    }                                     

    private void HunterActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Hunter");
    }                                     

    private void MageActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Mage");
    }                                     

    private void PaladinActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Paladin");
    }                                    

    private void PriestActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Priest");
    }                                     

    private void RogueActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Rogue");
    }                                     

    private void ShamanActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Shaman");
    }                                     

    private void WarriorActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Warrior");
    }                                     

    private void WarlockActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Main.chooseClass("Warlock");
    }                                  

    // Variables declaration - do not modify                     
    private java.awt.Button Back;
    private java.awt.Button Druid;
    private java.awt.Button Hunter;
    private java.awt.Button Mage;
    private java.awt.Button Paladin;
    private java.awt.Button Priest;
    private java.awt.Button Shaman;
    private java.awt.Button Rogue;
    private java.awt.Button Warrior;
    private java.awt.Button Warlock;
    private javax.swing.JPanel ClassPanel;
    private java.awt.Label ClassTitle;
    // End of variables declaration                   
}
