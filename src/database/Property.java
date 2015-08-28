package database;

import java.util.UUID;

import functionality.NameList;

public class Property {
	public Address propertyAddress;
	UUID propertyID;
	NameList renters;

	
	public Property(String st1, String st2, String apt, String city, String state, String country, String zipcode,NameList renters, UUID id){
		propertyAddress = new Address(st1, st2, apt, city, state, country, zipcode);
		this.renters = renters;
		this.propertyID = id;

	}

}
