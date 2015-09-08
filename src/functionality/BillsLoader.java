package functionality;

import java.sql.ResultSet;
import java.util.HashMap;

import database.Bill;
import database.CurrentBills;
import database.CurrentProperty;
import database.Date;
import database.NameList;

public class BillsLoader extends DatabaseCommander {
	public void load() {
		CurrentBills.clear();
		openConnection();
		try {
			try{
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
			}
			finally{
				closeConnection();
			}
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
	}

}
