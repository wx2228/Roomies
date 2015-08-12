/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import gui.*;
import database.UserDatabase;
/**
 *
 * @author Hang Xu
 */
public class Roomies {
    public static void main(String[] args) {
    	UserDatabase userDB = new UserDatabase();
      LoginGUI login = new LoginGUI();
      login.setVisible(true);
    }  
}
