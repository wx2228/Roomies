/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.UUID;

/**
 *
 * @author Hang Xu
 */
public  class  CurrentUser {
    private static  String currentUUID;
    
     public static String getID()
    {   
        return currentUUID;
    }
   
    public static void setID(String string)
    {
        CurrentUser.currentUUID=string;
    }
}
