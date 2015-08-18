package functionality;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(int aYear, int aMonth, int aDay){
		this.year = aYear;
		this.month = aMonth;
		this.day = aDay;
	}
	
	public String toString(){
		return Integer.toString(this.month)+","+Integer.toString(this.day)+","+Integer.toString(this.year);
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getDay(){
		return this.day;
	}

}
