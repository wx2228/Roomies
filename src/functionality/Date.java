package functionality;

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

}
