/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionality;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Hang Xu
 */
public class Bill {
	Date date;
	ArrayList<String> names;
	double amount;
    String desciption;
    int roommateIndex;
    
    public Bill(Date aDate, double aAmount, ArrayList<String> aNames,String aDescription){
        date = aDate;
        this.amount= aAmount;
        this.names = aNames;
        this.desciption= aDescription;
    }
    
    public Date getDate(){
    	return this.date;
    }
    
    public double getAmount(){
    	return this.amount;
    }
    
    public ArrayList<String> getNames(){
    	return this.names;
    }

    public String getDescr()
    {
        return this.desciption;
    }
       
    public int nameToRoommateIndex(String people)
    {
      switch(people)
        {
            case "Lily": return 1;
            case "Marshall":return 2;
            case "Marshall,Lily": return 3;
            case "Ted": return 4;
            case "Ted,Lily":return 5;
            case "Ted,Marshall": return 6;
            case "Ted,Marshall,Lily":return 7;
        }  
      return 0;
    }
}
