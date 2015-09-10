package database;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Note {
  private LocalDate date;
  private LocalTime time;
  private String userID;
  private String note;

  public Note(LocalDate date, LocalTime time, String note,String userID){
	  this.date=date;
	  this.time=time;
	  this.note=note;
	  this.userID=userID;
  }
  public LocalDate getDate(){return this.date;}
  public LocalTime getTime(){return this.time;}
  public String getUserID(){return this.userID;}
  public String getNote(){return this.note;}
 

public String toString(){
	  String name = CurrentContacts.getUserRealName(userID);
	  DateTimeFormatter showingFormat = new DateTimeFormatterBuilder().appendPattern("H:mm:ss").toFormatter();
	  return this.date.toString()+" "+this.time.format(showingFormat)+" "+name+" says: "+this.note;
  }
}
