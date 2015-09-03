/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.CurrentProperty;
import database.CurrentUser;

/**
 *
 * @author Hang Xu
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        System.out.println("Current user is "+CurrentUser.getID());
        System.out.println("Current property is "+CurrentProperty.getID());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkButton = new javax.swing.JButton();
        mofButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        outButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        checkButton.setText("Check");
        checkButton.setPreferredSize(new java.awt.Dimension(73, 227));
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        mofButton.setText("Message On Fridge");
        mofButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mofButtonActionPerformed(evt);
            }
        });

        infoButton.setText("Info Center");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        outButton.setText("Out");
        outButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mofButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(outButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mofButton, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(outButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        BillCheckGUI billGUI = new BillCheckGUI();
        billGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_checkButtonActionPerformed

    private void mofButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mofButtonActionPerformed
        // TODO add your handling code here:
        MessageOnFridgeGUI mofGUI = new MessageOnFridgeGUI();
        mofGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mofButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        // TODO add your handling code here:
        InfoCenterGUI infoGUI = new InfoCenterGUI();
        infoGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoButtonActionPerformed

    private void outButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outButtonActionPerformed
        // TODO add your handling code here:
    	CurrentUser.setID(null);
    	CurrentProperty.setID(null);
        LoginGUI loginGUI = new LoginGUI();
        loginGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_outButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JButton mofButton;
    private javax.swing.JButton outButton;
    // End of variables declaration//GEN-END:variables
}
