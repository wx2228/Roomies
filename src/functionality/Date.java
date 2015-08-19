package functionality;

import java.util.Calendar;

public class Date {
	public int year;
	public int month;
	public int day;
	
	public Date(int Year, int Month, int Day){
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
