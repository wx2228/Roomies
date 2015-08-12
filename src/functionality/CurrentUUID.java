/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionality;

import java.util.UUID;

/**
 *
 * @author Hang Xu
 */
public  class  CurrentUUID {
    private static  UUID currentUUID;
    

    
     public static UUID getID()
    {   
        return currentUUID;
    }
     
     
    public static void setID(UUID aUUID)
    {
        CurrentUUID.currentUUID=aUUID;
    }
}
