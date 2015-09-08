package functionality;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public abstract class DatabaseCommander {
	String url = "jdbc:mysql://localhost:3306/"; 
	String dbName = "roomies_user";
	String driver = "com.mysql.jdbc.Driver"; 
	String databaseUSN = "root";
	String databasePWD = "Xuhang202";
	Connection conn;
	Statement st;
	protected void openConnection(){
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD);
			st = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace(); //connection fails
		} 
	}
	protected void closeConnection(){
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();//connection close fails
		}
	}
}
