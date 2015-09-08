package functionality;

import java.sql.ResultSet;
import database.Property;

public class PropertySearcher extends DatabaseCommander{
	Property inputProperty;
	
	public PropertySearcher(Property p){
		this.inputProperty = p; 
	}
	
	
	public boolean PropertyExists(){
		 String streetLine1 = this.inputProperty.propertyAddress.streetLine1.trim().toLowerCase();
		 String streetLine2 = this.inputProperty.propertyAddress.streetLine2.trim().toLowerCase();
		 String aptNumber = this.inputProperty.propertyAddress.aptNumber.trim().toLowerCase();
		 String city = this.inputProperty.propertyAddress.city.trim().toLowerCase();
		 String state = this.inputProperty.propertyAddress.state.trim().toLowerCase();
		 String country = this.inputProperty.propertyAddress.country.trim().toLowerCase();
		 String zipcode = this.inputProperty.propertyAddress.zipcode.trim().toLowerCase();
	
		try{
			try {
				openConnection();
				ResultSet check;
				check = st.executeQuery("SELECT * FROM roomies_property.property WHERE `Street Line 1` = '"+streetLine1+"' AND `Street Line 2` = '"+streetLine2+"' AND `Apt Number` = '"+aptNumber+"' AND `City` = '"+city+"' AND `State` = '"+state+"' AND `Country` = '"+country+"' AND `Zipcode` = '"+zipcode+"';"); 		
				if(check.absolute(1)){
					return true;
				}
				else{
					return false;
					} 
				} 
			finally{
				closeConnection();
			}
		}
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return false; 
	}

	
	public String getPropertyID(){
		 String streetLine1 = this.inputProperty.propertyAddress.streetLine1.trim().toLowerCase();
		 String streetLine2 = this.inputProperty.propertyAddress.streetLine2.trim().toLowerCase();
		 String aptNumber = this.inputProperty.propertyAddress.aptNumber.trim().toLowerCase();
		 String city = this.inputProperty.propertyAddress.city.trim().toLowerCase();
		 String state = this.inputProperty.propertyAddress.state.trim().toLowerCase();
		 String country = this.inputProperty.propertyAddress.country.trim().toLowerCase();
		 String zipcode = this.inputProperty.propertyAddress.zipcode.trim().toLowerCase();
		try{
			try {  
				openConnection();
				ResultSet check = st.executeQuery("SELECT propertyID FROM roomies_property.property WHERE `Street Line 1` = '"+streetLine1+"' AND `Street Line 2` = '"+streetLine2+"' AND `Apt Number` = '"+aptNumber+"' AND `City` = '"+city+"' AND `State` = '"+state+"' AND `Country` = '"+country+"' AND `Zipcode` = '"+zipcode+"';"); 		
				String result ="";
				while(check.next()){
					 result = check.getString("PropertyID");
					System.out.println("the property id is "+result);
				}
				return result;
				} 
			finally{
				closeConnection();
			}
		}
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return "";

	}
}
