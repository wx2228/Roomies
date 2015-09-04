package functionality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import database.Bill;
import database.CurrentBills;
import database.CurrentProperty;
import database.CurrentUser;

public class BillUpdater { // this will update the CurrentBill and the database at the same time.

	public void addNewBill(Bill b) {
		  CurrentBills.add(b);// add the new bill the currentbills. 
		  String url = "jdbc:mysql://localhost:3306/"; 
			String dbName = "roomies_user";
			String driver = "com.mysql.jdbc.Driver"; 
			String userName = "root";
			String password = "Xuhang202";

			try { 
				Class.forName(driver).newInstance(); 
				Connection conn = DriverManager.getConnection(url+dbName,userName,password); 
				Statement st = conn.createStatement();
				String command1 = "INSERT INTO roomies_bill.bill "
						+ "VALUES ('"+b.getBillID()+"','"+CurrentProperty.getID()+"','"+b.getDate().toString()+"',"
								+ "'"+b.getAmount()+"','"+b.getDesc()+"');";
				System.out.println(command1);
				int val = st.executeUpdate(command1);
				for(String s : b.getNames()){
					st.executeUpdate( "INSERT INTO roomies_bill.bill_user_mapping "
							+ "VALUES ('"+b.getBillID()+"','"+s+"');");
				}
				conn.close();
				} 
			catch (Exception e) { e.printStackTrace(); 
			}

		
	}

}
