package functionality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserAuthenticator {
	String usernameInput;
	String passwordInput;
	
	public UserAuthenticator(String u, String p){
		this.usernameInput = u;
		this.passwordInput = p;
	}
	
	public boolean authenticate(){
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String databaseUSN = "root";
		String databasePWD = "Xuhang202";
	
		try {
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD); 
			Statement st = conn.createStatement();  
			ResultSet check;
			if(this.passwordInput ==null){
				 check = st.executeQuery("SELECT * FROM roomies_user.user WHERE username = '"+usernameInput+"'"); 
			}
			else{
				 check = st.executeQuery("SELECT * FROM roomies_user.user WHERE username = '"+usernameInput+"' AND password = '"+ passwordInput+"'"); 
			}
			
			if(check.absolute(1)){
				conn.close();
				return true;
			}
			else{
				conn.close();
				return false;
				} 
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return false; 
	} 

	
	public String getUserID(){
			String url = "jdbc:mysql://localhost:3306/"; 
			String dbName = "roomies_user";
			String driver = "com.mysql.jdbc.Driver"; 
			String databaseUSN = "root";
			String databasePWD = "Xuhang202";
		
			try {
				Class.forName(driver).newInstance(); 
				Connection conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD); 
				Statement st = conn.createStatement();  
				ResultSet check;
				check = st.executeQuery("SELECT userID FROM roomies_user.user WHERE username = '"+usernameInput+"' AND password = '"+ passwordInput+"'");				String result ="";
				while(check.next()){
					result = check.getString("userID");
				}
				return result;
				} 
			catch (Exception e) { 
				e.printStackTrace(); 
			}
			return "";
		} 

	public String getPropertyID(){
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String databaseUSN = "root";
		String databasePWD = "Xuhang202";
	
		try {
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD); 
			Statement st = conn.createStatement();  
			ResultSet check;
			check = st.executeQuery("SELECT PropertyID FROM roomies_property.property_user_mapping"
					+ " WHERE userID = '"+getUserID()+"'");				
			String result ="";
			while(check.next()){
				result = check.getString("propertyID");
			}
			return result;
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		return "";
	}
	
	}

