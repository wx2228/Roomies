package functionality;

import gui.NewUserRegisterSucceed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.Property;
import database.User;

public class NewPropertyRegister {
Property newProperty;
	
	public NewPropertyRegister(Property p) {
	this.newProperty = p;
}

	public boolean register(){
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "root";
		String password = "Xuhang202";
		String streetLine1 = this.newProperty.propertyAddress.streetLine1.trim().toLowerCase();
		 String streetLine2 = this.newProperty.propertyAddress.streetLine2.trim().toLowerCase();
		 String aptNumber = this.newProperty.propertyAddress.aptNumber.trim().toLowerCase();
		 String city = this.newProperty.propertyAddress.city.trim().toLowerCase();
		 String state = this.newProperty.propertyAddress.state.trim().toLowerCase();
		 String country = this.newProperty.propertyAddress.country.trim().toLowerCase();
		 String zipcode = this.newProperty.propertyAddress.zipcode.trim().toLowerCase();
		 String propertyID = this.newProperty.propertyID.toString();
	
		try {
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,userName,password); 
			Statement st = conn.createStatement();
			int val = st.executeUpdate("INSERT INTO roomies_property.property "+
                                                    " (`PropertyID`,`Street Line 1`,`Street Line 2`,`Apt Number`,`City`,`State`,`Country`,`Zipcode`)  "+
					                                "  VALUES    "+
                                                     "('1111','"+streetLine1+"','"+streetLine2+"','"+aptNumber+"','"+city+"','"+state+"','"+country+"','"+zipcode+"');");
		System.out.println(val);	
		conn.close();
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return false; 
	}

}
