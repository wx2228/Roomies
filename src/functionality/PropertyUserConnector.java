package functionality;

import gui.MainGUI;
import database.CurrentProperty;
import database.CurrentUser;
import database.Property;

public class PropertyUserConnector extends DatabaseCommander{
	public void connect(Property p){
		try{
			try { 
				openConnection();
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
				} 
			finally{
				closeConnection();
			}
		}
		catch (Exception e) { e.printStackTrace(); 
		} 
	} 

}
