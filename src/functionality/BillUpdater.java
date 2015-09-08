package functionality;

import java.sql.ResultSet;
import database.Bill;
import database.CurrentBills;
import database.CurrentProperty;
import database.NameList;

public class BillUpdater extends DatabaseCommander{ // this will update the CurrentBill and the database at the same time.
	public void add(Bill b) {
		  CurrentBills.add(b);// add the new bill the currentbills. 
		  try{
				try { 
					openConnection();
					String command1 = "INSERT INTO roomies_bill.bill "
							+ "VALUES ('"+b.getBillID()+"','"+CurrentProperty.getID()+"','"+b.getDate().toString()+"',"
									+ "'"+b.getAmount()+"','"+b.getDesc()+"');";
					System.out.println(command1);
					st.executeUpdate(command1);
					for(String s : b.getNames()){
						st.executeUpdate( "INSERT INTO roomies_bill.bill_user_mapping "
								+ "VALUES ('"+b.getBillID()+"','"+s+"');");
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

	public void edit(Bill b){
		CurrentBills.edit(b,b.getBillID());
		try{
			try { 
				openConnection();
				String updateBill = "UPDATE roomies_bill.bill "
						+ "SET date = '"+b.getDate().toString()+"', amount = '"+b.getAmount()+"',"
								+ "description = '"+b.getDesc()+"' "
						+ "WHERE billID = '"+b.getBillID()+"';";
				st.executeUpdate(updateBill);
				String findOriginalMapping= "SELECT name FROM roomies_bill.bill_user_mapping "
						+ "WHERE billID = '"+b.getBillID()+"';";
				ResultSet originalBillNames= st.executeQuery(findOriginalMapping);
				NameList oriNames = new NameList();
				NameList newNames = b.getNames();
				while(originalBillNames.next()){
					oriNames.add(originalBillNames.getString("name"));
					System.out.println("The Os are :"+originalBillNames.getString("name"));
				}
				for(String oName : oriNames){
					if(newNames.contains(oName)){//if the old name is in new list
						newNames.remove(oName);
					}
					else{
						st.execute("DELETE FROM roomies_bill.bill_user_mapping "
								+ "WHERE billID = '"+b.getBillID()+"' AND name = '"+oName+"';");
					   System.out.println("the difference has been deleted "+oName);
					}
				}
				for(String s : b.getNames()){
					System.out.println("After deleting same name and removing old mapping, now there are:"+s);
				}
				if(b.getNames().size()!=0){//if there are new mapping needed to be added to database
					for(String s : b.getNames()){
						st.executeUpdate("INSERT INTO roomies_bill.bill_user_mapping "
								+ "VALUES ('"+b.getBillID()+"','"+s+"');");
						}
					}
				}
			finally{
				closeConnection();
			}
		}
		catch (Exception e) { e.printStackTrace(); 
		}
	}

	public void delete(Bill b){
		String billID = b.getBillID();//get the bill ID so we can delete it from database
		CurrentBills.delete(b);//remove the bill from CurrentBills.
		try{
			try { 
				openConnection();
				String deleteMapping= "DELETE  FROM roomies_bill.bill_user_mapping "
						+ "WHERE billID = '"+billID+"';";
			    st.executeUpdate(deleteMapping);
			    String deleteRecord = "DELETE FROM roomies_bill.bill WHERE billID = '"+billID+"';";
			    st.executeUpdate(deleteRecord);
				} 
			finally{
				closeConnection();
			}
		}
		catch (Exception e) { e.printStackTrace(); 
		}
	}


}

