package database;

public class Property {
	private Address propertyAddress;
	private String propertyID;

	
	public Property(String st1, String st2, String apt, String city, 
			String state, String country, String zipcode, String id){
		propertyAddress = new Address(st1, st2, apt, city, state, country, zipcode);
	}
	
	public boolean generatePropertyID(){
		if(this.propertyID==null){
			System.out.println("YPOYOYOYOYOY");
			this.propertyID= java.util.UUID.randomUUID().toString(); 
			return true;
		}
		else return false;

	}

	public Address getPropertyAddress(){return this.propertyAddress;}
	public String getPropertyID(){return this.propertyID;}
	public void setPropertyID(String id){this.propertyID=id;}
}
