package functionality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.Address;
import database.Property;

public class PropertySearcher {
	Property inputProperty;

	
	public PropertySearcher(Property p){
		this.inputProperty = p; 
	}
	
	
	public boolean PropertyExists(){
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String databaseUSN = "root";
		String databasePWD = "Xuhang202";
		 String streetLine1 = this.inputProperty.propertyAddress.streetLine1.trim().toLowerCase();
		 String streetLine2 = this.inputProperty.propertyAddress.streetLine2.trim().toLowerCase();
		 String aptNumber = this.inputProperty.propertyAddress.aptNumber.trim().toLowerCase();
		 String city = this.inputProperty.propertyAddress.city.trim().toLowerCase();
		 String state = this.inputProperty.propertyAddress.state.trim().toLowerCase();
		 String country = this.inputProperty.propertyAddress.country.trim().toLowerCase();
		 String zipcode = this.inputProperty.propertyAddress.zipcode.trim().toLowerCase();
	
		try {
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD); 
			Statement st = conn.createStatement();  
			ResultSet check;
			check = st.executeQuery("SELECT * FROM roomies_property.property WHERE `Street Line 1` = "+streetLine1+" `Street Line 2` = "+streetLine2+" `Apt Number` = "+aptNumber+" `City` = "+city+" `State` = "+state+" `Country` = "+country+" `Zipcode` = "+zipcode); 		
			if(check.absolute(1)){
				conn.close();
				return true;
			}
			else{
				conn.close();
				return false;
				} 
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return false; 
	}

}
