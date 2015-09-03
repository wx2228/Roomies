package functionality;

import gui.MainGUI;
import gui.UserRegisterSucceedPopUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.CurrentProperty;
import database.CurrentUser;
import database.Property;

public class PropertyUserConnector {
	public void connect(Property p){
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String databaseUSN = "root";
		String databasePWD = "Xuhang202";
	
		try { 
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD); 
			Statement st = conn.createStatement();
			String command = "INSERT INTO roomies_property.property_user_mapping"
					+ " (`propertyID`,`userID`)"
					+ " VALUES ('"+p.propertyID+"','"+CurrentUser.getID()+"');";
			System.out.println(command);
			int val = st.executeUpdate(command);
			if(val == 1){
                CurrentProperty.setID(p.propertyID);
				MainGUI MG = new MainGUI();
				MG.setVisible(true);
                }
			conn.close();
			} 
		catch (Exception e) { e.printStackTrace(); 
		} 
	} 

}
