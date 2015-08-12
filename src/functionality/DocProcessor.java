/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionality;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Hang Xu
 */

// This class is used to read and write the documentation such as roommates' agreement or lease.
public class DocProcessor {
   private static String filePath="C:\\Users\\Hang Xu\\Desktop\\lease.txt";
   
   // read method is used to read the file from database and then convert to Reader for further use(show or edit)
   public FileReader read() throws FileNotFoundException{
	   FileReader reader = new FileReader(filePath);
	   return reader;
   }
   
   public FileWriter write() throws IOException{
	   FileWriter writer = new FileWriter(filePath);
	   return writer;
   }

public static void setPath(String f) {
	filePath = f;
	
}
}
