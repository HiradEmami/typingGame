/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typinggame;

/**
 *
 * @author Hirad Gorgoroth
 */
public class mainFrame extends javax.swing.JFrame {

    private String gameDifficulty;
    private String wordDifficulty;
    
    public mainFrame() {
        initComponents();
        pageInitiation();
    }

   private void pageInitiation(){
       setPanel("startPanel");
   }
   private void setPanel(String action)
   {
       switch (action){
           case "startPanel":{
               gamePanel.setVisible(false);
               settingPanel.setVisible(false);  
               scorePanel.setVisible(false);
               startPanel.setVisible(true);
               break;
           }
           case "gamePanel":{

               settingPanel.setVisible(false);
               startPanel.setVisible(false);
               scorePanel.setVisible(false);
               gamePanel.setVisible(true);
               break;
           }
           case "settingPanel":{
               gamePanel.setVisible(false);
               startPanel.setVisible(false);
               scorePanel.setVisible(false);
               settingPanel.setVisible(true);
               break;
           }
           case "scorePanel":{
               gamePanel.setVisible(false);
               settingPanel.setVisible(false);
               startPanel.setVisible(false);
               scorePanel.setVisible(true);
               break;
           }
           default:{ 
               gamePanel.setVisible(false);
               settingPanel.setVisible(false);               
               scorePanel.setVisible(false);
               startPanel.setVisible(true);
               break;
           }
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        startPanel = new javax.swing.JPanel();
        scoreButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        settingPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JbwordEasy = new javax.swing.JToggleButton();
        JbwordMedium = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        JbgameEasy = new javax.swing.JToggleButton();
        JbgameMedium = new javax.swing.JToggleButton();
        JbwordHard = new javax.swing.JToggleButton();
        JbgameHard1 = new javax.swing.JToggleButton();
        scorePanel = new javax.swing.JPanel();
        gamePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        startPanel.setBackground(new java.awt.Color(0, 0, 0));

        scoreButton.setBackground(new java.awt.Color(204, 0, 51));
        scoreButton.setForeground(new java.awt.Color(255, 255, 255));
        scoreButton.setText("Score");
        scoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreButtonActionPerformed(evt);
            }
        });

        startButton.setBackground(new java.awt.Color(204, 0, 51));
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(scoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        jPanel1.add(startPanel, "card4");

        settingPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Word Difficulty");

        JbwordEasy.setText("Easy");
        JbwordEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbwordEasyActionPerformed(evt);
            }
        });

        JbwordMedium.setText("Medium");
        JbwordMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbwordMediumActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Game Diffiiculty");

        JbgameEasy.setText("Easy");
        JbgameEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbgameEasyActionPerformed(evt);
            }
        });

        JbgameMedium.setText("Medium");
        JbgameMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbgameMediumActionPerformed(evt);
            }
        });

        JbwordHard.setText("Hard");
        JbwordHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbwordHardActionPerformed(evt);
            }
        });

        JbgameHard1.setText("Hard");
        JbgameHard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbgameHard1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingPanelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JbwordEasy, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(JbgameEasy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                                .addComponent(JbgameMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                                .addComponent(JbwordMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(JbwordHard, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                    .addContainerGap(687, Short.MAX_VALUE)
                    .addComponent(JbgameHard1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(148, 148, 148)))
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbwordEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbwordMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbwordHard, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbgameEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbgameMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                    .addContainerGap(196, Short.MAX_VALUE)
                    .addComponent(JbgameHard1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(136, 136, 136)))
        );

        jPanel1.add(settingPanel, "card5");

        scorePanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout scorePanelLayout = new javax.swing.GroupLayout(scorePanel);
        scorePanel.setLayout(scorePanelLayout);
        scorePanelLayout.setHorizontalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        scorePanelLayout.setVerticalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(scorePanel, "card3");

        gamePanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(gamePanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
      setPanel("scorePanel");
    }//GEN-LAST:event_scoreButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
      setPanel("settingPanel");
    }//GEN-LAST:event_startButtonActionPerformed

    private void JbwordEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbwordEasyActionPerformed
       JbwordHard.setSelected(false);
       JbwordMedium.setSelected(false);
       JbwordEasy.setSelected(true);
       wordDifficulty="easy";
    }//GEN-LAST:event_JbwordEasyActionPerformed

    private void JbwordMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbwordMediumActionPerformed
       JbwordEasy.setSelected(false);
       JbwordHard.setSelected(false);
       JbwordMedium.setSelected(true);
       wordDifficulty="medium";
    }//GEN-LAST:event_JbwordMediumActionPerformed

    private void JbwordHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbwordHardActionPerformed
        JbwordEasy.setSelected(false);
        JbwordMedium.setSelected(false);
        JbwordHard.setSelected(true);
        wordDifficulty="hard";

    }//GEN-LAST:event_JbwordHardActionPerformed

    private void JbgameEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbgameEasyActionPerformed
        JbgameHard1.setSelected(false);
        JbgameMedium.setSelected(false);
        JbgameEasy.setSelected(true);
        gameDifficulty="easy";
    }//GEN-LAST:event_JbgameEasyActionPerformed

    private void JbgameMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbgameMediumActionPerformed
        JbgameEasy.setSelected(false);
        JbgameHard1.setSelected(false);
        JbgameMedium.setSelected(true);
        gameDifficulty="medium";
    }//GEN-LAST:event_JbgameMediumActionPerformed

    private void JbgameHard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbgameHard1ActionPerformed
        JbgameEasy.setSelected(false);
        JbgameMedium.setSelected(false);
        JbgameHard1.setSelected(true);
        gameDifficulty="hard";
    }//GEN-LAST:event_JbgameHard1ActionPerformed

  
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JbgameEasy;
    private javax.swing.JToggleButton JbgameHard1;
    private javax.swing.JToggleButton JbgameMedium;
    private javax.swing.JToggleButton JbwordEasy;
    private javax.swing.JToggleButton JbwordHard;
    private javax.swing.JToggleButton JbwordMedium;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton scoreButton;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startPanel;
    // End of variables declaration//GEN-END:variables
}
