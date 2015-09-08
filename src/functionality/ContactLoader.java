package functionality;

import java.sql.ResultSet;
import database.Contact;
import database.CurrentContacts;
import database.CurrentProperty;

public class ContactLoader extends DatabaseCommander{
    public void load(){
    	try{
    		try {
    			openConnection();
    			ResultSet contacts;
    			String command= "SELECT first_name,last_name,map.userID,middle_name,phone_number,email "
    					+ "FROM roomies_property.property_user_mapping as map "
    					+ "INNER JOIN roomies_user.user as user "
    					+ "ON map.userID=user.userID "
    					+ "where PropertyID='"+CurrentProperty.getID()+"';";
    			contacts = st.executeQuery(command); 
    			while(contacts.next()){
    				Contact c = new Contact(contacts.getString("first_name"),contacts.getString("middle_name"),
    						contacts.getString("last_name"),contacts.getString("phone_number"),
    						contacts.getString("email"),contacts.getString("userID"));
    				CurrentContacts.addContact(c);
    			}
    		} 
    		finally{
    			closeConnection();
    		}
    	}
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		
    }
}
