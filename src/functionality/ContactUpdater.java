package functionality;

import gui.UserRegisterSucceedPopUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.Contact;
import database.CurrentContacts;
import database.CurrentUser;

public class ContactUpdater {
	  Contact c ;
	public ContactUpdater(Contact collectedContact) {
		 c = collectedContact;
	}

	public boolean update() {
		
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "root";
		String password = "Xuhang202";

		try { 
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,userName,password); 
			Statement st = conn.createStatement();
			String command = "UPDATE roomies_user.user "
					+ "SET first_name = '"+c.firstName+"', middle_name = '"+c.middleName+"',"
							+ "last_name = '"+c.lastName+"',phone_number = '"+c.phoneNumber+"',"
									+ "email = '"+c.emailAddress+"'"
					+ "WHERE userID = '"+CurrentUser.getID()+"';";
			System.out.println(command);
			int val = st.executeUpdate(command);
			conn.close();
			if(val == 1) {
				ContactLoader CL = new  ContactLoader();
				CurrentContacts.reset();
				CL.load();
				return true;
			}
			else return false;
	
			} 
		catch (Exception e) { e.printStackTrace(); 
		}
		return false; 
	}

}
