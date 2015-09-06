package functionality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.Contact;
import database.CurrentContacts;
import database.CurrentProperty;

public class ContactLoader {
    public void load(){
    	String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String databaseUSN = "root";
		String databasePWD = "Xuhang202";
		
	   
		try {
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD); 
			Statement st = conn.createStatement();  
			ResultSet contacts;
			String command= "SELECT first_name,last_name,map.userID,middle_name,phone_number,email "
					+ "FROM roomies_property.property_user_mapping as map "
					+ "INNER JOIN roomies_user.user as user "
					+ "ON map.userID=user.userID "
					+ "where PropertyID='"+CurrentProperty.getID()+"';";
			contacts = st.executeQuery(command); 
			while(contacts.next()){
				Contact c = new Contact();
				c.firstName=contacts.getString("first_name");
				c.lastName=contacts.getString("last_name");
				c.middleName=contacts.getString("middle_name");
				c.phoneNumber = contacts.getString("phone_number");
				c.emailAddress=contacts.getString("email");
				c.userID=contacts.getString("userID");
				System.out.println("firstname:"+c.firstName);
				CurrentContacts.addContact(c);
			}
			
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		
    }
}
