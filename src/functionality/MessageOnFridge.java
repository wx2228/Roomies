/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionality;

/**
 *
 * @author Hang Xu
 */
public class MessageOnFridge {
    static String messageShown = "Marshall says:DONT FORGET THE PARTY TONIGHT!\nLily says:We need a new coffee maker\n";
    public static void addMessage(String f )
    {
        if (messageShown==null)
            messageShown=f;
        else{
        messageShown = messageShown+f;}
    }
    
    public static String getMOF()
            {
                return messageShown;
            }
    public static String getOneMOF(int i)
    {
        String[] tmp = messageShown.split("\n");
        return tmp[i];
    }
}
