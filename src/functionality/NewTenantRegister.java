package functionality;

import gui.TenantRegisterGUI;
import gui.TenantRegisterSucceedPopUp;
import gui.UserRegisterSucceedPopUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.Contact;
import database.CurrentUser;
import database.User;

public class NewTenantRegister {
	public boolean register(Contact toBeRegister){
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "root";
		String password = "Xuhang202";
		String registerUserID = CurrentUser.getID().toString();
		try {
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,userName,password); 
			Statement st = conn.createStatement();  
			String command = "UPDATE roomies_user.user "
					+ "SET first_name = '"+toBeRegister.firstName+"',middle_name='"+toBeRegister.middleName+""
					+ "',last_name='"+toBeRegister.lastName+"',phone_number='"+toBeRegister.phoneNumber+""
							+ "',email='"+toBeRegister.emailAddress+""
									+ "' WHERE userID = '"+registerUserID+"';";
			System.out.println(command);
			int val = st.executeUpdate(command);
					
			if(val == 1){
				TenantRegisterSucceedPopUp TRSPU = new TenantRegisterSucceedPopUp();
				TRSPU.setVisible(true);
                }
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return false; 
	}
}
