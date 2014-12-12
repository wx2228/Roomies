/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomies.data;

/**
 *
 * @author Hang Xu
 */
public  class  ID {
    static  int idNumber;
    static String[] name ={"Ted","Marshall","Lily"};
    
    public static String getName()
    {   
        return name[idNumber];
    }
    
     public static int getIDNumber()
    {   
        return idNumber;
    }
     
    public static void setID(int id)
    {
        ID.idNumber=id;
    }
}
