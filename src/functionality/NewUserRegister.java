package functionality;

import database.User;
import gui.NewUserRegisterSucceed;
import gui.WrongPopup;

import java.sql.*;

public class NewUserRegister {
	User newUser;
	
	public void register(User u){
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "root";
		String password = "Xuhang202";
		String registerUsername = u.getUsername();
		String registerPassword = u.getPassword();
		String registerUserID = u.getUUID().toString();
		
		try { 
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,userName,password); 
			Statement st = conn.createStatement();
			int val = st.executeUpdate("INSERT INTO roomies_user.user (`username`, `password`,`userID`) VALUES ('"+registerUsername+"', '"+registerPassword+"','"+registerUserID+"');");
			if(val == 1){
				NewUserRegisterSucceed n = new NewUserRegisterSucceed();
                n.setVisible(true);
                }
				
			ResultSet res = st.executeQuery("SELECT * FROM roomies_user.user"); 
			while (res.next()) {
				String id = res.getString("userID"); 
				String usn = res.getString("username"); 
				String pwd = res.getString("password");
				System.out.println(id + "\t" + usn+"\t"+pwd);
				}
			conn.close();
			} 
		catch (Exception e) { e.printStackTrace(); 
		} 
	}

}
