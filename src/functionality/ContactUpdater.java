package functionality;

import java.sql.SQLException;
import database.Contact;
import database.CurrentContacts;
import database.CurrentUser;

public class ContactUpdater extends DatabaseCommander {
	private Contact c ;
	public ContactUpdater(Contact collectedContact) {
		 c = collectedContact;
	}

	public void update() {
		try{
			try { 
				openConnection();
				String command = "UPDATE roomies_user.user "
						+ "SET first_name = '"+c.getFirstName()+"', middle_name = '"+c.getMiddeleName()+"',"
								+ "last_name = '"+c.getLastName()+"',phone_number = '"+c.getPhoneNumber()+"',"
										+ "email = '"+c.getEmailAddress()+"'"
						+ "WHERE userID = '"+CurrentUser.getID()+"';";
				System.out.println(command);
				int val = st.executeUpdate(command);
				if(val == 1) {
					ContactLoader CL = new  ContactLoader();
					CurrentContacts.reset();
					CL.load();
					}
				} 
			finally{
				closeConnection();
			}
		}
		catch (SQLException e) { e.getMessage();
		}
	}
}
