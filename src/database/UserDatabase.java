package database;

import java.util.Hashtable;

import functionality.CurrentUUID;

public class UserDatabase {
	//use hashtable to store user login info, key is the username, use value in the hastable to store User object
	private static  Hashtable<String, User> user = new Hashtable<String, User>();  
	
	public UserDatabase(){
		UserDatabase.addUser("ted", "1");
		UserDatabase.addUser("marshall", "202");
		UserDatabase.addUser("lily", "333");
	}
	
	//adding new user to the database
	public static boolean addUser(String username, String password){
		if(UserDatabase.userExist(username))
			return false;
		else {
			User newUser = new User(username,password);
			user.put(username, newUser);
			return true;
		}
	}
	
	//the method decide whether the user is already existed
	public static boolean userExist(String username){
		return user.containsKey(username);
	}
	//authenticate a user, if success, set the current UUID for future use.
	public static boolean userAuthentication (String username, String password){
		if(UserDatabase.userExist(username)){
			if( user.get(username).getPassword().equals(password)){
				CurrentUUID.setID(user.get(username).getUUID());
				return true;
			}
			else
				return false;
		}
		else
			return false;	
	}
	

}
