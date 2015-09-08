package functionality;

import java.sql.ResultSet;
import database.Property;

public class PropertySearcher extends DatabaseCommander{
	Property inputProperty;
	 String streetLine1;
	 String streetLine2;
	 String aptNumber;
	 String city;
	 String state;
	 String country;
	 String zipcode;
	 
	public PropertySearcher(Property p){
		this.inputProperty = p; 
	    streetLine1 = this.inputProperty.getPropertyAddress().getStreetLine1().trim().toLowerCase();
		streetLine2 = this.inputProperty.getPropertyAddress().getStreetLine2().trim().toLowerCase();
		aptNumber = this.inputProperty.getPropertyAddress().getAptNumber().trim().toLowerCase();
	    city = this.inputProperty.getPropertyAddress().getCity().trim().toLowerCase();
		state = this.inputProperty.getPropertyAddress().getState().trim().toLowerCase();
		country = this.inputProperty.getPropertyAddress().getCountry().trim().toLowerCase();
		zipcode = this.inputProperty.getPropertyAddress().getZipcode().trim().toLowerCase();
	}
	
	
	public boolean PropertyExists(){
		try{
			try {
				openConnection();
				ResultSet check;
				check = st.executeQuery("SELECT * FROM roomies_property.property WHERE `Street Line 1` = '"
				+streetLine1+"' AND `Street Line 2` = '"+streetLine2+"' AND `Apt Number` = '"
				+aptNumber+"' AND `City` = '"+city+"' AND `State` = '"+state+"' AND `Country` = '"
				+country+"' AND `Zipcode` = '"+zipcode+"';"); 		
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
