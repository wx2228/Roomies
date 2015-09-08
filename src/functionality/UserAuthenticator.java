package functionality;

import java.sql.ResultSet;

public class UserAuthenticator extends DatabaseCommander{
	String usernameInput;
	String passwordInput;
	
	public UserAuthenticator(String u, String p){
		this.usernameInput = u;
		this.passwordInput = p;
	}
	
	public boolean authenticate(){
	    try{
	    	try { 
				openConnection();
				ResultSet check;
				if(this.passwordInput ==null){
					 check = st.executeQuery("SELECT * FROM roomies_user.user WHERE username = '"+usernameInput+"'"); 
				}
				else{
					 check = st.executeQuery("SELECT * FROM roomies_user.user WHERE username = '"+usernameInput+"' AND password = '"+ passwordInput+"'"); 
				}
				
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

	class UserInfo{
		private String userID;
		private String propertyID;
		UserInfo(String user, String property){
			this.userID = user;
			this.propertyID = property;
		}
		
		public String getInfoUserID(){
			return userID;
		}
		public String getInfoPropertyID(){
			return propertyID;
		}
	}
	
	public UserInfo getUserInfo(){
		try{
			try {
				openConnection();
				ResultSet getUserIDResult;
				ResultSet getPropertyIDResult;
				String userIDString = null;
				String propertyIDString = null;
				getUserIDResult = st.executeQuery("SELECT userID FROM roomies_user.user WHERE username = '"
				+usernameInput+"' AND password = '"+ passwordInput+"'");		
				while(getUserIDResult.next()){
					userIDString = getUserIDResult.getString("userID");
				}
				getPropertyIDResult = st.executeQuery("SELECT PropertyID FROM roomies_property.property_user_mapping"
						+ " WHERE userID = '"+userIDString+"'");	
				while(getPropertyIDResult.next()){
					propertyIDString = getPropertyIDResult.getString("PropertyID");
				}
				return new UserInfo(userIDString,propertyIDString);
				} 
			finally{
				closeConnection();
			}
		}
			catch (Exception e) { 
				e.printStackTrace(); 
			}
			return null;
		} 

	public String getUserID(){
		UserInfo u = getUserInfo();
		return u.userID;
		} 

	public String getPropertyID(){
		UserInfo u = getUserInfo();
		return u.propertyID;
	}
	
	}

