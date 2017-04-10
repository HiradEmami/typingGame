/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typinggame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Hirad Gorgoroth
 */
public class mainFrame extends javax.swing.JFrame {

    private String gameDifficulty;
    private String wordDifficulty;
    private ArrayList <String> words;
    private int playerScore;
    private int totalTime;
    private int bonustime;
    static Timer timer =new Timer();
    private int interval =1000;
    
    public mainFrame() {
        initComponents();
        pageInitiation();
        
    }

   private void pageInitiation(){
       setPanel("startPanel");
       this.words=new ArrayList<String>();
       inputWordTF.setHorizontalAlignment(JTextField.CENTER);
       currentWordTF.setHorizontalAlignment(JTextField.CENTER);
       playerScore=0;
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
               StartGame();
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
        JbwordEasy = new javax.swing.JToggleButton();
        JbwordMedium = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        JbgameEasy = new javax.swing.JToggleButton();
        JbgameMedium = new javax.swing.JToggleButton();
        JbwordHard = new javax.swing.JToggleButton();
        JbgameHard1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scorePanel = new javax.swing.JPanel();
        gamePanel = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        inputWordTF = new javax.swing.JTextField();
        currentWordTF = new javax.swing.JTextField();

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
        jLabel2.setText("Word Difficulty");

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

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Game Diffiiculty");

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JbwordEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbgameEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbwordMedium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbgameMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(JbwordHard, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(394, 394, 394))
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                    .addContainerGap(687, Short.MAX_VALUE)
                    .addComponent(JbgameHard1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(148, 148, 148)))
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                    .addContainerGap(407, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(389, 389, 389)))
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbwordEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbwordMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbwordHard, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbgameEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbgameMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                    .addContainerGap(196, Short.MAX_VALUE)
                    .addComponent(JbgameHard1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(136, 136, 136)))
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingPanelLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel4)
                    .addContainerGap(206, Short.MAX_VALUE)))
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

        scoreLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(0, 204, 102));
        scoreLabel.setText("Your Score:");

        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setText("Timer");

        inputWordTF.setBackground(new java.awt.Color(0, 0, 0));
        inputWordTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inputWordTF.setForeground(new java.awt.Color(255, 255, 255));
        inputWordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputWordTFActionPerformed(evt);
            }
        });
        inputWordTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputWordTFKeyPressed(evt);
            }
        });

        currentWordTF.setEditable(false);
        currentWordTF.setBackground(new java.awt.Color(0, 0, 0));
        currentWordTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        currentWordTF.setForeground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(scoreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timerLabel)
                .addGap(196, 196, 196))
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(inputWordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(currentWordTF)
                    .addGap(20, 20, 20)))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreLabel)
                    .addComponent(timerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(inputWordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(currentWordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        jPanel1.add(gamePanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     boolean wordrun = false;
     boolean gamerun = false;
     if(!JbgameEasy.isSelected() && !JbgameHard1.isSelected() && !JbgameMedium.isSelected() )
     {
         JOptionPane.showMessageDialog(null, "Please select a game difficulty!");
         gamerun = false;
     }else{
         gamerun=true;
     }
     if(!JbwordEasy.isSelected() && !JbwordHard.isSelected() && !JbwordMedium.isSelected() )
     {
         JOptionPane.showMessageDialog(null, "Please select a word difficulty!");
         wordrun = false;
     }else{
         wordrun = true;
     }
     if(wordrun && gamerun)
     {
         // set the words
         setWords();
     }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputWordTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputWordTFKeyPressed
  
   
    }//GEN-LAST:event_inputWordTFKeyPressed

    private void inputWordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputWordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputWordTFActionPerformed
private void StartGame()
{
    currentWordTF.setText(words.get(randInt(0, words.size()-1)));
    scoreLabel.setText("Your Score: "+playerScore);
    switch(gameDifficulty)
    {case "easy":
    {
        totalTime= 60;
        bonustime=10;
        break;
    }
    case "medium":
    {totalTime= 30;
        bonustime=5;
        
        break;
    }
    case "hard":
    {totalTime= 5;
        bonustime=1;
        
        break;
    }
        
    }
   inputWordTF.requestFocusInWindow();
     timer.scheduleAtFixedRate(new TimerTask() {
            
            public void run() {
                timerLabel.setText("Timer : "+totalTime+" seconds left");
                totalTime--;
                
                if(inputWordTF.getText().equals(currentWordTF.getText())){
                   totalTime=totalTime+bonustime;
                   currentWordTF.setText(words.get(randInt(0, words.size()-1)));
                   playerScore=playerScore+200;
                   scoreLabel.setText("Your Score: "+playerScore);
                   inputWordTF.setText("");
                }
                
                if (totalTime<= 0){
                    timer.cancel();
            }}
        }, 0, interval);
     
   
    
}



  private void resetAllWords()
  {
      try {
           boolean remains=true;
   while(remains)
   {remains=false;
         for(int i=0;i<=words.size()-1;i++)
    {
       words.remove(i);
    }
           for(int i=0;i<=words.size()-1;i++)
    {
        words.remove(i);
            remains=true;
        
    }
         
   }
      } catch (Exception e) {
          System.out.println(e);
      }
  }
  
  private int setWordlength()
  {int length=5;
      switch(wordDifficulty){
          case "easy":{
              length=5;
            break;  
          }
          case "medium":{
              length=7;
              
            break;  
          }
          case "hard":{
              length=13;
              
            break;  
          }
      }
      return length;
  }
  private void setWords(){
      resetAllWords();
      int lengthLimit= setWordlength();
      words= new ArrayList<String>();
        try {
               InputStream inputStream = FileReader.class.getResourceAsStream("/Long_word_list.txt");
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      BufferedReader reader = new BufferedReader(inputStreamReader);
      String line = null;
      while ((line =reader.readLine()) !=null){
          char []temp= line.toCharArray();
          if(temp.length<lengthLimit)
          {
             words.add(line);  
          }
         
      }
      reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        setPanel("gamePanel");
  }
  
  public static int randInt(int min, int max) {

    Random rand = new Random();


    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
    
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
    private javax.swing.JTextField currentWordTF;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JTextField inputWordTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton scoreButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startPanel;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}
