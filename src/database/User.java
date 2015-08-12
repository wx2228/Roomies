package database;

import java.util.UUID;

public class User {
	private UUID userID;
	private String password;
	
	User(String aUsername, String aPassword){
		this.userID = java.util.UUID.randomUUID(); // searched online, UUID can generate unique userID
		this.password = aPassword;
	}
	
	protected String getPassword(){
		return this.password;
	}
	
	protected UUID getUUID(){
		return this.userID;
	}

}
