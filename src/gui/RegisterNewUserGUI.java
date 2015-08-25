/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import functionality.NewUserRegister;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import database.User;

/**
 *
 * @author Hang Xu
 */
public class RegisterNewUserGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNewUserGUI
     */
    public RegisterNewUserGUI() {
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

        userNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        confirmPasswordText = new javax.swing.JPasswordField();
        Register = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        setResizable(false);

        userNameText.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        userNameText.setForeground(new java.awt.Color(204, 204, 255));
        userNameText.setText("Username");
        userNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameTextFocusLost(evt);
            }
        });
        userNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameTextMouseClicked(evt);
            }
        });
        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });
        userNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameTextKeyPressed(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        passwordText.setForeground(new java.awt.Color(204, 204, 255));
        passwordText.setText("dddddddd");
        passwordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFocusLost(evt);
            }
        });
        passwordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextMouseClicked(evt);
            }
        });
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        confirmPasswordText.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        confirmPasswordText.setForeground(new java.awt.Color(204, 204, 255));
        confirmPasswordText.setText("Password");
        confirmPasswordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordTextFocusLost(evt);
            }
        });
        confirmPasswordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPasswordTextMouseClicked(evt);
            }
        });
        confirmPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTextActionPerformed(evt);
            }
        });
        confirmPasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPasswordTextKeyPressed(evt);
            }
        });

        Register.setText("Register");
        Register.setBorder(null);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        cancel.setText("cancel");
        cancel.setBorder(null);

        logoLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("Roomies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTextFocusGained
        // TODO add your handling code here:
        if(!userNameText.getForeground().equals(Color.black)){
            userNameText.setText(null);
            userNameText.setForeground(Color.black);
        }  
    }//GEN-LAST:event_userNameTextFocusGained

    private void userNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameTextMouseClicked
        // TODO add your handling code here:
        if(!userNameText.getForeground().equals(Color.black)){
            userNameText.setText(null);
            userNameText.setForeground(Color.black);
        }       
    }//GEN-LAST:event_userNameTextMouseClicked

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_userNameTextActionPerformed

    private void userNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTextKeyPressed
        // TODO add your handling code here:
        if (!userNameText.getForeground().equals(Color.black))
        {
            userNameText.setText(null);
            userNameText.setForeground(Color.black);
        }
    }//GEN-LAST:event_userNameTextKeyPressed

    private void passwordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusGained
        // TODO add your handling code here:
        if(!passwordText.getForeground().equals(Color.black)){
        	passwordText.setText(null);
        	passwordText.setForeground(Color.black);
        }
    }//GEN-LAST:event_passwordTextFocusGained

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
            if(Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK))
        	logoLabel.setForeground(Color.red);
        else logoLabel.setForeground(Color.black);
    }//GEN-LAST:event_passwordTextKeyPressed

    private void confirmPasswordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordTextFocusGained
        // TODO add your handling code here:
    	if(!confirmPasswordText.getForeground().equals(Color.black)){
    	     confirmPasswordText.setText(null);
    	     confirmPasswordText.setForeground(Color.black);
        }
    }//GEN-LAST:event_confirmPasswordTextFocusGained

    private void confirmPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordTextActionPerformed
        // TODO add your handling code here:
        if(!confirmPasswordText.getForeground().equals(Color.black)){
             confirmPasswordText.setText(null);
             confirmPasswordText.setForeground(Color.black);
        }
    }//GEN-LAST:event_confirmPasswordTextActionPerformed

    private void confirmPasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordTextKeyPressed
        // TODO add your handling code here:
        if(Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK))
        	logoLabel.setForeground(Color.red);
        else logoLabel.setForeground(Color.black);
    }//GEN-LAST:event_confirmPasswordTextKeyPressed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        NewUserRegister n = new NewUserRegister();
        User newUser = new User(userNameText.getText().toLowerCase(), passwordText.getText());
        n.register(newUser);
        

    }//GEN-LAST:event_RegisterActionPerformed

    private void confirmPasswordTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPasswordTextMouseClicked
        // TODO add your handling code here:
        if(!confirmPasswordText.getForeground().equals(Color.black)){
    		confirmPasswordText.setText(null);
    		confirmPasswordText.setForeground(Color.black);
        }
    }//GEN-LAST:event_confirmPasswordTextMouseClicked

    private void passwordTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseClicked
        // TODO add your handling code here:
        if(!passwordText.getForeground().equals(Color.black)){
        	passwordText.setText(null);
        	passwordText.setForeground(Color.black);
        }
    }//GEN-LAST:event_passwordTextMouseClicked

    private void userNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTextFocusLost
        // TODO add your handling code here:
        if(userNameText.getText().equals("")){
            userNameText.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); 
            userNameText.setForeground(new java.awt.Color(204, 204, 255));
            userNameText.setText("Username");
        }
    }//GEN-LAST:event_userNameTextFocusLost

    private void confirmPasswordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordTextFocusLost
        // TODO add your handling code here:
        if(confirmPasswordText.getText().equals("")){
            confirmPasswordText.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); 
            confirmPasswordText.setForeground(new java.awt.Color(204, 204, 255));
            confirmPasswordText.setText("Username");
        }
    }//GEN-LAST:event_confirmPasswordTextFocusLost

    private void passwordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusLost
        // TODO add your handling code here:        
        if(passwordText.getText().equals("")){
            passwordText.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); 
            passwordText.setForeground(new java.awt.Color(204, 204, 255));
            passwordText.setText("Username");
        }
    }//GEN-LAST:event_passwordTextFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegisterNewUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewUserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNewUserGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register;
    private javax.swing.JButton cancel;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}