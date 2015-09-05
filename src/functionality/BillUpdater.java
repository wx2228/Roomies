package functionality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import database.Bill;
import database.CurrentBills;
import database.CurrentProperty;
import database.CurrentUser;
import database.NameList;

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

	public void editBill(Bill b){
		CurrentBills.edit(b,b.getBillID());
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "roomies_user";
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "root";
		String password = "Xuhang202";

		try { 
			Class.forName(driver).newInstance(); 
			Connection conn = DriverManager.getConnection(url+dbName,userName,password); 
			Statement st = conn.createStatement();
			String updateBill = "UPDATE roomies_bill.bill "
					+ "SET date = '"+b.getDate().toString()+"', amount = '"+b.getAmount()+"',"
							+ "description = '"+b.getDesc()+"' "
					+ "WHERE billID = '"+b.getBillID()+"';";
			int val = st.executeUpdate(updateBill);
			String findOriginalMapping= "SELECT name FROM roomies_bill.bill_user_mapping "
					+ "WHERE billID = '"+b.getBillID()+"';";
			ResultSet originalBillNames= st.executeQuery(findOriginalMapping);
			NameList oNames = new NameList();
			while(originalBillNames.next()){
				oNames.add(originalBillNames.getString("name"));
			}
			for(String oName : oNames){// Delete the original map which doesn't exist in new bill
				for(String s : b.getNames()){//try to find the name in new bill, if failed, delete the original mapping
					if(s.equals(oName)){
						b.getNames().remove(s);//if the name is found in original mapping, delete it in new mapping, reduce the time for finding mapping that doesn't exist before
						break;
					}
					st.execute("DELETE FROM roomies_bill.bill_user_mapping "
							+ "WHERE billID = '"+b.getBillID()+"' AND name = '"+oName+"';");
				}
			}
			if(b.getNames().size()!=0){//if there are new mapping needed to be added to database
				for(String s : b.getNames()){
					st.executeUpdate("INSERT INTO roomies_bill.bill_user_mapping "
							+ "VALUES ('"+b.getBillID()+"','"+s+"');");
				}
			}
			
			conn.close();
			} 
		catch (Exception e) { e.printStackTrace(); 
		}
	}
}
