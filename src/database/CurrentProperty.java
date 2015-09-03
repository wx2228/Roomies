package database;

public class CurrentProperty {
	static String currentPropertyID;
	static public void setID(String ID){
		currentPropertyID=ID;
	}

	static public String getID(){
		return currentPropertyID;
	}
}
