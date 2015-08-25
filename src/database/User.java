package database;

import java.util.UUID;

public class User {
	private UUID userID;
	private String username;
	private String password;
	
	public User(String aUsername, String aPassword){
		this.userID = java.util.UUID.randomUUID(); // searched online, UUID can generate unique userID
		this.username = aUsername;
		this.password = aPassword;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public UUID getUUID(){
		return this.userID;
	}
	
	public String getUsername(){
		return this.username;
	}

}
