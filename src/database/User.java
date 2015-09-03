package database;

public class User {
	private String userID;
	private String username;
	private String password;
	
	public User(String aUsername, String aPassword){
		this.userID = java.util.UUID.randomUUID().toString(); // searched online, UUID can generate unique userID
		this.username = aUsername;
		this.password = aPassword;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public String getUUID(){
		return this.userID;
	}
	
	public String getUsername(){
		return this.username;
	}

}
