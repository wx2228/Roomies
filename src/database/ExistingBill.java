/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Hang Xu
 */
public class ExistingBill {
  
   private static ArrayList<Bill> existingBills =new ArrayList<Bill>();
   final static String TODAY = "today";
   final static String THISMONTH = "thismonth";
//   private static Hashtable<String, Double> splitTable;
   
   public static void add(Bill bill){
	   existingBills.add(bill);
   }
  
   public static void edit(Bill bill,int i){
       existingBills.set(i, bill);
   }
   
   public static void delete(int toBeDeletedIndex){
       existingBills.remove(toBeDeletedIndex);
   }
   
   public static Bill getBill(int index){
	   return existingBills.get(index);
   }
   
   public static int getSize(){
	   return existingBills.size();
   }
   
    
   public static double[] split(ArrayList<Integer> selectedBillIndexs){   
	   Hashtable<String, Double> splitTable = new Hashtable<String, Double>();
	   double[] result = new double[3];
	   splitTable.put("Ted Mosby", 0.0);
	   splitTable.put("Marshall Eriksen", 0.0);
	   splitTable.put("Lily Aldrin", 0.0);
	   int l = selectedBillIndexs.size();
	   for(int i = 0; i < l; i ++){
		   split(selectedBillIndexs.get(i),splitTable);
	   }
	   
	   result[0] = splitTable.get("Ted Mosby");
	   result[1] = splitTable.get("Marshall Eriksen");
	   result[2] = splitTable.get("Lily Aldrin");
	   return result;
   }
   
   private static void split(int billIndex,Hashtable<String, Double> splitTable){
	   Bill bill = ExistingBill.getBill(billIndex); 
	   double totalAmount = bill.getAmount();
	   NameList names = bill.getNames();
	   int numberOfPerson = names.size();
	   double perAmount = totalAmount / numberOfPerson;
	   for(int i = 0; i < numberOfPerson; i ++){	   
		   double originalAmount = splitTable.get(names.get(i));		   
		   double updatedAmount = originalAmount + perAmount;	   
		   splitTable.replace(names.get(i), updatedAmount);
	   }
	   
   } 


   
   public static double[] split(String rules){
	   ArrayList<Integer> billIndex = new ArrayList<Integer>();
	   int allBillSize = ExistingBill.getSize();
	   if (rules == TODAY){
		   for(int i = 0; i <allBillSize; i ++ ){
		       	if(ExistingBill.getBill(i).getDate().isToday())
		       		billIndex.add(i);	
		       }	   
	   }
	   if(rules == THISMONTH){
		   for(int i = 0; i <allBillSize; i ++ ){
		       	if(ExistingBill.getBill(i).getDate().isThisMonth())
		       		billIndex.add(i);	
		       }
	   }
       return ExistingBill.split(billIndex);
   }
}
