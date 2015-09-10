package functionality;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;

import database.CurrentUser;

public class unreadNoteChecker extends DatabaseCommander{

	public int getUnreadNotesNumber() {
		int count=0;
		try{
			try{
				openConnection();
				ResultSet lastLoginTimeResult;
				LocalDate lastLoginDate;
				LocalTime lastLoginTime;
				String getLastLoginTimeCmd = "SELECT date,time "
						+ "FROM roomies_note.note "
						+ "WHERE userID = '"+CurrentUser.getID()+"';";
				lastLoginTimeResult = st.executeQuery(getLastLoginTimeCmd);
				if(lastLoginTimeResult.next()){
					lastLoginDate = lastLoginTimeResult.getDate("date").toLocalDate();
					lastLoginTime = lastLoginTimeResult.getTime("time").toLocalTime();
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

}
