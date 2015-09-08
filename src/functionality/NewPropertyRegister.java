package functionality;

import database.CurrentProperty;
import database.CurrentUser;
import database.Property;

public class NewPropertyRegister extends DatabaseCommander{
	Property newProperty;
	
	public NewPropertyRegister(Property p) {
	this.newProperty = p;
}
	public boolean register(){
		String streetLine1 = this.newProperty.propertyAddress.streetLine1.trim().toLowerCase();
		String streetLine2 = this.newProperty.propertyAddress.streetLine2.trim().toLowerCase();
		String aptNumber = this.newProperty.propertyAddress.aptNumber.trim().toLowerCase();
		String city = this.newProperty.propertyAddress.city.trim().toLowerCase();
		String state = this.newProperty.propertyAddress.state.trim().toLowerCase();
		String country = this.newProperty.propertyAddress.country.trim().toLowerCase();
		String zipcode = this.newProperty.propertyAddress.zipcode.trim().toLowerCase();
		String propertyID = this.newProperty.propertyID.toString();
	
		 try{
				try {
					openConnection();
					int addNewProperty = st.executeUpdate("INSERT INTO roomies_property.property "+
		                                                    " (`PropertyID`,`Street Line 1`,`Street Line 2`,`Apt Number`,`City`,`State`,`Country`,`Zipcode`)  "+
							                                "  VALUES    "+
		                                                     "('"+propertyID+"','"+streetLine1+"','"+
							                                streetLine2+"','"+aptNumber+"','"+city+"','"+state+"','"+country+"','"+zipcode+"');");
				   String command = "INSERT INTO roomies_property.property_user_mapping "
							+ "(`propertyID`,`userID`) "
							+ "VALUES "
							+ "('"+propertyID+"','"+CurrentUser.getID()+"');";
				   System.out.println("commandmmm:" + command);
					int addNewBinding = st.executeUpdate(command);
					System.out.println(addNewProperty);	
					System.out.println("property flag"+addNewBinding);
					CurrentProperty.setID(propertyID);
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

}
