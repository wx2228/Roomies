/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomies.Simulation;
import roomies.GUI.*;
/**
 *
 * @author Hang Xu
 */
public class LoginCheck {
    String[] usernames = {"ted","marshall","lily"};
    String[] passwords = {"1","202","333"};
    String inputUsername;
    String inputPassword;
    int number;
    public LoginCheck(String username, String password)
    {
        inputUsername = username;
        inputPassword = password;
    }
    
    public boolean Check()
    {
        int i=0;
        while(i<usernames.length&&!usernames[i].equals(inputUsername))
        {
            i++;
        }
        if (i>=usernames.length)
            return false;
        
        if (passwords[i].equals(inputPassword))
        {
            this.number =i;
            return true;
        }
            
        else return false;
        
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
}
