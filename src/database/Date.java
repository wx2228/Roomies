package database;

import java.util.Calendar;

public class Date {
	public int year;
	public int month;
	public int day;
	static public Date StringtoDate(String s){
		String[] dateString = s.split(",");
		int year = Integer.parseInt(dateString[2]);
		int month = Integer.parseInt(dateString[0]);
		int day = Integer.parseInt(dateString[1]);
		return new Date(month,day,year);
	}
	public Date(int Month, int Day, int Year){
		this.year = Year;
		this.month = Month;
		this.day = Day;
	}
	
	public String toString(){
		return Integer.toString(month)+","+Integer.toString(day)+","+Integer.toString(year);
	}
	
	
	public boolean isThisMonth(){
		Calendar c = Calendar.getInstance();
        int yearNow = c.get(Calendar.YEAR); 
        int monthNow = c.get(Calendar.MONTH)+1; 
        if(year == yearNow && month == monthNow)
        	return true;
        else return false;
	}
	
	public boolean isToday(){
        Calendar c = Calendar.getInstance();
        int dateNow = c.get(Calendar.DATE); 
        if(isThisMonth() && day == dateNow)
        	return true;
        else return false;
	}


}
