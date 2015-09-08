package database;

public class Contact {
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	private String userID;
	
	public Contact(){};
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

	public String getFirstName(){return this.firstName;}
	public String getMiddeleName(){return this.middleName;}
	public String getLastName(){return this.lastName;}
	public String getPhoneNumber(){return this.phoneNumber;}
	public String getEmailAddress(){return this.emailAddress;}
	public String getUserID(){return this.userID;}
}
