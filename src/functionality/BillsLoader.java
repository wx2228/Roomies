package functionality;

import gui.MainGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import database.Bill;
import database.CurrentBills;
import database.CurrentProperty;
import database.CurrentUser;
import database.Date;
import database.NameList;

public class BillsLoader {

	public BillsLoader() {
		
	}

	public void loadingBillsToCurrentBills() {
		CurrentBills.clear();
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String databaseUSN = "root";
		String databasePWD = "Xuhang202";
	
		try { 
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,databaseUSN,databasePWD); 
			Statement st = conn.createStatement();
			String command ="SELECT m.billID,name,date,amount,description  "
					+ "FROM roomies_bill.bill as b "
					+ "INNER JOIN roomies_bill.bill_user_mapping as m "
					+ "ON b.billID = m.billID "
					+ "ORDER BY date;";
			System.out.println(command);
			ResultSet bills= st.executeQuery(command);
			String propertyID = CurrentProperty.getID();
			HashMap<String,NameList> billUserMap = new HashMap<String, NameList>();
			while(bills.next()){
				String billID = bills.getString("billID");
				String name = bills.getString("name");
				String dateString = bills.getString("date");
				Date date = Date.StringtoDate(dateString);
				Double amount = Double.parseDouble(bills.getString("amount"));
				String des = bills.getString("description");
				if(billUserMap.containsKey(billID)){
					billUserMap.get(billID).add(name);
					CurrentBills.edit(new Bill(date, amount, billUserMap.get(billID), des, billID, propertyID), billID);
				}
				else{
					NameList names = new NameList();
					names.add(name);
					billUserMap.put(billID, names);
					CurrentBills.add(new Bill(date, amount, billUserMap.get(billID), des, billID, propertyID));
				}
				
			}

			conn.close();
			} 
		catch (Exception e) { e.printStackTrace(); 
		} 
		
	}

}
