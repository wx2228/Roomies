/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 *
 * @author Hang Xu
 */
public class ContactButton extends JButton{
	String userID;
    ContactButton(String text, String userID){
        this.setText(text);
        this.userID= userID;
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactButtonActionPerformed(evt);
            }
        });
    }

	protected void ContactButtonActionPerformed(ActionEvent evt) {
		ContactInfoGUI CIG = new ContactInfoGUI(userID);
		CIG.setVisible(true);
		
	}
}
