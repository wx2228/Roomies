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
public class FileInfo {
    static String filePath;

    
    public static  void setPath(String f)
    {
        filePath = f;
       
    }
    
    
    public static String getPath()
    {
        return filePath;
    }
}
