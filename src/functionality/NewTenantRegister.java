package functionality;

import gui.TenantRegisterSucceedPopUp;
import database.Contact;
import database.CurrentUser;

public class NewTenantRegister extends DatabaseCommander{
	public boolean register(Contact toBeRegister){
		String registerUserID = CurrentUser.getID().toString();
		try{
			try {
				openConnection();
				String command = "UPDATE roomies_user.user "
						+ "SET first_name = '"+toBeRegister.firstName+"',middle_name='"+toBeRegister.middleName+""
						+ "',last_name='"+toBeRegister.lastName+"',phone_number='"+toBeRegister.phoneNumber+""
								+ "',email='"+toBeRegister.emailAddress+""
										+ "' WHERE userID = '"+registerUserID+"';";
				System.out.println(command);
				int val = st.executeUpdate(command);
						
				if(val == 1){
					TenantRegisterSucceedPopUp TRSPU = new TenantRegisterSucceedPopUp();
					TRSPU.setVisible(true);
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
}
