package database;

import java.util.ArrayList;

public class NameList extends ArrayList<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString(){
		int size = this.size();
		String s = "";
		for (int i = 0; i < size -1; i ++){
			s = s + this.get(i)+",";
		}
		s = s + this.get(size - 1);
		return s;
	}

}
