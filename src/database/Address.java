package database;

public class Address {
	public String streetLine1;
	public String streetLine2;
	public String aptNumber;
	public String city;
	public String state;
	public String country;
	public String zipcode;
	
	
	public Address(String streetLine1,String streetLine2, String aptNumber, String city, String state, String country, String zipcode){
		this.streetLine1= streetLine1;
		this.streetLine2 = streetLine2;
		this.aptNumber = aptNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

}
