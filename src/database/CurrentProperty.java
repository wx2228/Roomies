package database;

public class CurrentProperty {
	static private String currentPropertyID;
	static public void setID(String ID){
		currentPropertyID=ID;
	}

	static public String getID(){
		return currentPropertyID;
	}
}
