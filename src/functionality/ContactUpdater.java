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
						+ "SET first_name = '"+c.firstName+"', middle_name = '"+c.middleName+"',"
								+ "last_name = '"+c.lastName+"',phone_number = '"+c.phoneNumber+"',"
										+ "email = '"+c.emailAddress+"'"
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
