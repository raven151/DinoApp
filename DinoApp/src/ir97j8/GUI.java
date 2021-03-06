/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir97j8;


import static ir97j8.FileIO.*;

import static ir97j8.Images.*;
import java.util.ArrayList;

/**
 *
 * @author Nyulasi Ákos
 */
public class GUI extends javax.swing.JFrame {
 public static ArrayList<dinosaurs> dinos = new ArrayList<dinosaurs>();

    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        Background = new javax.swing.JPanel();
        DinoBox = new javax.swing.JComboBox<>();
        LName = new javax.swing.JLabel();
        LType = new javax.swing.JLabel();
        LLength = new javax.swing.JLabel();
        LHeight = new javax.swing.JLabel();
        LVName = new javax.swing.JLabel();
        LVType = new javax.swing.JLabel();
        LVLength = new javax.swing.JLabel();
        LVHeight = new javax.swing.JLabel();
        LDescription = new javax.swing.JLabel();
        LVDescription = new javax.swing.JLabel();
        LWeight = new javax.swing.JLabel();
        LVWeight = new javax.swing.JLabel();
        Picture = new javax.swing.JPanel();
        LPicture = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MINew = new javax.swing.JMenuItem();
        MIExit = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DinoApp");
        setBackground(new java.awt.Color(153, 255, 153));
        setFocusTraversalPolicyProvider(true);

        Background.setBackground(new java.awt.Color(153, 255, 153));

        DinoBox.setMaximumRowCount(500);
        DinoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinoBoxActionPerformed(evt);
            }
        });

        LName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LName.setText("Név:");

        LType.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LType.setText("Besorolás:");

        LLength.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LLength.setText("Hosszúság:");

        LHeight.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LHeight.setText("Magasság:");

        LVName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LVName.setText("Neve");

        LVType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LVType.setText("Besorolása");

        LVLength.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LVLength.setText("Hossza");

        LVHeight.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LVHeight.setText("Magassága");

        LDescription.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LDescription.setText("Leírás:");

        LVDescription.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LVDescription.setText("Leírása");
        LVDescription.setAlignmentY(0.0F);
        LVDescription.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LVDescription.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        LWeight.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LWeight.setText("Tömeg:");

        LVWeight.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LVWeight.setText("Tömege");

        Picture.setBackground(new java.awt.Color(153, 255, 153));
        Picture.setEnabled(false);

        javax.swing.GroupLayout PictureLayout = new javax.swing.GroupLayout(Picture);
        Picture.setLayout(PictureLayout);
        PictureLayout.setHorizontalGroup(
            PictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        PictureLayout.setVerticalGroup(
            PictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        LPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Triceratops.jpg"))); // NOI18N
        LPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LPicture.setMaximumSize(new java.awt.Dimension(100, 100));
        LPicture.setMinimumSize(new java.awt.Dimension(100, 100));
        LPicture.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DinoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LName)
                    .addComponent(LType)
                    .addComponent(LLength)
                    .addComponent(LWeight)
                    .addComponent(LDescription)
                    .addComponent(LHeight))
                .addGap(68, 68, 68)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LVHeight)
                            .addComponent(LVLength)
                            .addComponent(LVType)
                            .addComponent(LVName)
                            .addComponent(LVWeight))
                        .addGap(212, 212, 212)
                        .addComponent(LPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LVDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DinoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LName)
                            .addComponent(LVName))
                        .addGap(42, 42, 42)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LType)
                            .addComponent(LVType))
                        .addGap(55, 55, 55)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LLength)
                            .addComponent(LVLength))
                        .addGap(57, 57, 57)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LHeight)
                            .addComponent(LVHeight))
                        .addGap(60, 60, 60)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LWeight)
                            .addComponent(LVWeight)))
                    .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(LDescription))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LVDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenu1.setText("Fájl");

        MINew.setText("Új Hozzáadása");
        MINew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINewActionPerformed(evt);
            }
        });
        jMenu1.add(MINew);

        MIExit.setText("Kilepes");
        MIExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIExitActionPerformed(evt);
            }
        });
        jMenu1.add(MIExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1454, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DinoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinoBoxActionPerformed
            Integer chosen = DinoBox.getSelectedIndex();
        
        
            List(chosen);
            
    }//GEN-LAST:event_DinoBoxActionPerformed

    private void MINewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINewActionPerformed
        new addDino().setVisible(true);
    }//GEN-LAST:event_MINewActionPerformed

    private void MIExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIExitActionPerformed
        super.dispose();
    }//GEN-LAST:event_MIExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        CreateFile();
        
       
        ReadFile(dinos);
        
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
          
            
            
            new GUI().setVisible(true);
            
            for(int i = 0; i< dinos.size();i++)
            {
            DinoBox.addItem(dinos.get(i).getName());
            }
            
            List(0);
           
            
            
            
            
            
            
            
            
            
            
        });
    }

     public static void List(Integer chosen){
             
        
        
            LVName.setText(dinos.get(chosen).getName());
            LVType.setText(dinos.get(chosen).getType());
            LVDescription.setText("<html>" + dinos.get(chosen).getDescription() + "</html>");
            
            LVLength.setText(String.valueOf(dinos.get(chosen).getLength()) + " Méter");
            LVHeight.setText(String.valueOf(dinos.get(chosen).getHeight()) + " Méter");
            LVWeight.setText(String.valueOf(dinos.get(chosen).getWeight()) + " Tonna");
            setImage(LPicture, dinos.get(chosen).getName());
         
     }
 
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    protected static volatile javax.swing.JComboBox<String> DinoBox;
    private javax.swing.JLabel LDescription;
    private javax.swing.JLabel LHeight;
    private javax.swing.JLabel LLength;
    private javax.swing.JLabel LName;
    private static javax.swing.JLabel LPicture;
    private javax.swing.JLabel LType;
    private static javax.swing.JLabel LVDescription;
    private static javax.swing.JLabel LVHeight;
    private static javax.swing.JLabel LVLength;
    private static javax.swing.JLabel LVName;
    private static javax.swing.JLabel LVType;
    private static javax.swing.JLabel LVWeight;
    private javax.swing.JLabel LWeight;
    private static javax.swing.JMenuItem MIExit;
    private javax.swing.JMenuItem MINew;
    private static javax.swing.JPanel Picture;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
