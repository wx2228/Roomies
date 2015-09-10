package functionality;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;

import database.CurrentContacts;
import database.CurrentProperty;
import database.CurrentUser;
import database.Note;

public class NoteConnector extends DatabaseCommander {
	JTextPane fridgeText; // this is the pane that will showing the notes
	StyledDocument notesShowDoc;
	public NoteConnector(JTextPane fridgeText) {
		this.fridgeText = fridgeText;
		this.notesShowDoc = this.fridgeText.getStyledDocument();
	}

	public void load() {
		try{
			try{
				openConnection();
				updateLatestLoginTime();
				ResultSet existingNotes;
				ArrayList<Note> noteToLoad = new ArrayList<Note>();
				String loadCmd = "SELECT date,time,userID,note "
						+ "FROM roomies_note.note "
						+ "WHERE propertyID = '"+CurrentProperty.getID()+"'"
								+ " ORDER BY date,time;";
				existingNotes = st.executeQuery(loadCmd);//execute the SQL command.
				while(existingNotes.next()){
					LocalDate javaDate = existingNotes.getDate("date").toLocalDate();
					LocalTime javaTime = existingNotes.getTime("time").toLocalTime();
					Note nt = new Note(javaDate, // getting the message date
							javaTime,//get the message time
							existingNotes.getString("note"),// getting the message 
							existingNotes.getString("userID"));//get the userID then searching for the user's real name
					noteToLoad.add(nt);
				}
				//now the messages are retrieved, put the messages to the GUI
				
				for(Note n : noteToLoad){//put the notes on GUI
					notesShowDoc.insertString(notesShowDoc.getLength(), n.toString()+"\n", null);
				}
			}
			finally{
				closeConnection();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void add(Note newNote) {
		try{
			try{
				openConnection();
				String addCmd= "INSERT INTO roomies_note.note "
						+ "VALUES('"+Date.valueOf(newNote.getDate())+"',"//convert the LocalDate to sql.date
								+ "'"+Time.valueOf(newNote.getTime())+"',"//convert the LocalTime to sql.time
										+ "'"+CurrentProperty.getID()+"',"//we need the property ID information to store in database
												+ "'"+newNote.getUserID()+"',"
														+ "'"+newNote.getNote()+"')";
	            
				st.executeUpdate(addCmd);//execute the SQL command that store the new note
			    updateLatestLoginTime();
			    notesShowDoc.insertString(notesShowDoc.getLength(), newNote.toString()+"\n", null);// put the new note on GUI
			}
			finally{
				closeConnection();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void updateLatestLoginTime() {
		String latestTimeUpdateCmd = "INSERT INTO roomies_note.lasttimelogin "
				+ "SET date = '"+Date.valueOf(LocalDate.now())+"',"
						+ " time='"+Time.valueOf(LocalTime.now())+"', "
								+ "userID = '"+CurrentUser.getID()+"' "
								+ "ON DUPLICATE KEY UPDATE "
								+ "date = '"+Date.valueOf(LocalDate.now())+"',"
						+ " time='"+Time.valueOf(LocalTime.now())+"';";
		try {
			st.executeUpdate(latestTimeUpdateCmd);
			//Execute the SQL command that update the latest active time of this user
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


}
