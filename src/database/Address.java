package database;

public class Address {
	private String streetLine1;
	private String streetLine2;
	private String aptNumber;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	
	public Address(String streetLine1,String streetLine2, String aptNumber, String city, String state, String country, String zipcode){
		this.streetLine1= streetLine1;
		this.streetLine2 = streetLine2;
		this.aptNumber = aptNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String getStreetLine1(){return this.streetLine1;}
	public String getStreetLine2(){return this.streetLine2;}
	public String getAptNumber(){return this.aptNumber;}
	public String getCity(){return this.city;}
	public String getState(){return this.state;}
	public String getCountry(){return this.country;}
	public String getZipcode(){return this.zipcode;}
}
