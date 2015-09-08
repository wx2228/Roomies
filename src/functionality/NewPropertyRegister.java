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
		String streetLine1 = this.newProperty.getPropertyAddress().getStreetLine1().trim().toLowerCase();
		String streetLine2 = this.newProperty.getPropertyAddress().getStreetLine2().trim().toLowerCase();
		String aptNumber = this.newProperty.getPropertyAddress().getAptNumber().trim().toLowerCase();
		String city = this.newProperty.getPropertyAddress().getCity().trim().toLowerCase();
		String state = this.newProperty.getPropertyAddress().getState().trim().toLowerCase();
		String country = this.newProperty.getPropertyAddress().getCountry().trim().toLowerCase();
		String zipcode = this.newProperty.getPropertyAddress().getZipcode().trim().toLowerCase();
		String propertyID = this.newProperty.getPropertyID().toString();
	
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
