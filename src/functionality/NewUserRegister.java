package functionality;

import database.CurrentUser;
import database.User;
import gui.UserRegisterSucceedPopUp;
import java.sql.*;

public class NewUserRegister extends DatabaseCommander{
	User newUser;
	
	public void register(User u){
		String registerUsername = u.getUsername();
		String registerPassword = u.getPassword();
		String registerUserID = u.getUUID().toString();
		try{
			try { 
				openConnection();
				int val = st.executeUpdate("INSERT INTO roomies_user.user (`username`, `password`,`userID`) VALUES ('"+registerUsername+"', '"+registerPassword+"','"+registerUserID+"');");
				if(val == 1){
					UserRegisterSucceedPopUp n = new UserRegisterSucceedPopUp();
	                n.setVisible(true);
	                CurrentUser.setID(u.getUUID());
	                }
					
				ResultSet res = st.executeQuery("SELECT * FROM roomies_user.user"); 
				while (res.next()) {
					String id = res.getString("userID"); 
					String usn = res.getString("username"); 
					String pwd = res.getString("password");
					System.out.println(id + "\t" + usn+"\t"+pwd);
					}
				} 
			finally{
				closeConnection();
			}
		}
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}

}
