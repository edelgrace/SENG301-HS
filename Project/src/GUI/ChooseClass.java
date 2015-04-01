package GUI;

public class ChooseClass extends javax.swing.JInternalFrame {
    Controller control;
    
    public ChooseClass() {
        control = new Controller();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Druid = new javax.swing.JButton();
        Hunter = new javax.swing.JButton();
        Mage = new javax.swing.JButton();
        Paladin = new javax.swing.JButton();
        Priest = new javax.swing.JButton();
        Rogue = new javax.swing.JButton();
        Shaman = new javax.swing.JButton();
        Warlock = new javax.swing.JButton();
        Warrior = new javax.swing.JButton();
        ChooseBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel1.setText("CHOOSE YOUR CLASS");

        Druid.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Druid.setText("DRUID");
        Druid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DruidActionPerformed(evt);
            }
        });

        Hunter.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Hunter.setText("HUNTER");
        Hunter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HunterActionPerformed(evt);
            }
        });

        Mage.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Mage.setText("MAGE");
        Mage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MageActionPerformed(evt);
            }
        });

        Paladin.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Paladin.setText("PALADIN");
        Paladin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaladinActionPerformed(evt);
            }
        });

        Priest.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Priest.setText("PRIEST");
        Priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriestActionPerformed(evt);
            }
        });

        Rogue.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Rogue.setText("ROGUE");
        Rogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RogueActionPerformed(evt);
            }
        });

        Shaman.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Shaman.setText("SHAMAN");
        Shaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShamanActionPerformed(evt);
            }
        });

        Warlock.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Warlock.setText("WARLOCK");
        Warlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarlockActionPerformed(evt);
            }
        });

        Warrior.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        Warrior.setText("WARRIOR");
        Warrior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarriorActionPerformed(evt);
            }
        });

        ChooseBack.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        ChooseBack.setText("BACK");
        ChooseBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Druid, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Shaman, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Paladin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChooseBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Warlock, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(Priest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hunter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Mage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Warrior, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(Rogue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Druid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(Hunter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Rogue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Priest, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Paladin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Shaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Warlock, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Warrior, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(ChooseBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Druid class
    private void DruidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DruidActionPerformed
        control.chooseClass("Druid");
    }//GEN-LAST:event_DruidActionPerformed

    // Hunter class
    private void HunterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HunterActionPerformed
        control.chooseClass("Hunter");
    }//GEN-LAST:event_HunterActionPerformed

    // Mage class
    private void MageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MageActionPerformed
        control.chooseClass("Mage");
    }//GEN-LAST:event_MageActionPerformed

    // Paladin class
    private void PaladinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaladinActionPerformed
        control.chooseClass("Paladin");
    }//GEN-LAST:event_PaladinActionPerformed

    // Priest class
    private void PriestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriestActionPerformed
        control.chooseClass("Priest");
    }//GEN-LAST:event_PriestActionPerformed

    // Rogue class
    private void RogueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RogueActionPerformed
        control.chooseClass("Rogue");
    }//GEN-LAST:event_RogueActionPerformed

    // Shaman class
    private void ShamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShamanActionPerformed
        control.chooseClass("Shaman");
    }//GEN-LAST:event_ShamanActionPerformed

    // Warlock class
    private void WarlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarlockActionPerformed
        control.chooseClass("Warlock");
    }//GEN-LAST:event_WarlockActionPerformed

    // Warrior class
    private void WarriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarriorActionPerformed
        control.chooseClass("Warrior");
    }//GEN-LAST:event_WarriorActionPerformed

    // Back button
    private void ChooseBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_ChooseBackActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChooseBack;
    private javax.swing.JButton Druid;
    private javax.swing.JButton Hunter;
    private javax.swing.JButton Mage;
    private javax.swing.JButton Paladin;
    private javax.swing.JButton Priest;
    private javax.swing.JButton Rogue;
    private javax.swing.JButton Shaman;
    private javax.swing.JButton Warlock;
    private javax.swing.JButton Warrior;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
