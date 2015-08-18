package functionality;

public class Date {
	int year;
	int month;
	int day;
	
	public Date(int Year, int Month, int Day){
		this.year = Year;
		this.month = Month;
		this.day = Day;
	}
	
	public String toString(){
		return Integer.toString(month)+","+Integer.toString(day)+","+Integer.toString(year);
	}

}
