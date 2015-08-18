package functionality;

import java.util.ArrayList;

public class NameList extends ArrayList<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<String> nameArray;
	
	public String toString(){
		String s = nameArray.toString();
		s = s.substring(1, nameArray.size() - 2);
		return s;
	}

}
