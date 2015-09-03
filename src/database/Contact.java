package database;

import java.util.UUID;

public class Contact {
	public String firstName;
	public String middleName;
	public String lastName;
	public String phoneNumber;
	public String emailAddress;
	public String userID;
	
	public Contact(	String firstName,
	String middleName,
	String lastName,
	String phoneNumber,
	String emailAddress,
	String userID){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.userID = userID;
	}

}
