package database;

import java.util.ArrayList;

public class CurrentContacts {
      static private ArrayList<Contact> contacts;
      static public void setContacts(ArrayList<Contact> c){
    	  contacts = c;
      }
      static public ArrayList<Contact> getContacts(){
    	  return contacts;
      }
      
      static public void addContact(Contact c){
    	  contacts.add(c);
      }
      
      static public void reset(){
    	  contacts.clear();
      }
	public static void initialize() {
		contacts = new ArrayList<Contact>();
	}
	public static String getUserRealName(String userID){
		System.out.println("the input userID is "+userID);
		for(Contact c: contacts){
			if(c.getUserID().equals(userID)){
				return c.getFirstName()+" "+c.getLastName().substring(0,1).toUpperCase();
			}
		}
		return null;
	}
}
