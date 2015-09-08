/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Hang Xu
 */
public class CurrentBills {
  
   private static ArrayList<Bill> existingBills =new ArrayList<Bill>();
   public enum SplitRules{TODAY,THISMONTH}
//   final static String TODAY = "today";
//   final static String THISMONTH = "thismonth";
//   private static Hashtable<String, Double> splitTable;
   
   public static void clear(){
	   existingBills.clear();
   }
   
   public static void add(Bill bill){
	   existingBills.add(bill);
   }
  
   public static void delete(Bill b){
	   existingBills.remove(b);
   }
   public static void edit(Bill bill,String billID){
      for(Bill b: existingBills){
    	  if(b.getBillID().equals(billID)){
    		  existingBills.set(existingBills.indexOf(b), bill);
    	  }
      }
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
   
    
   public static  HashMap<String, Double> split(ArrayList<Integer> selectedBillIndexs){   
	   HashMap<String, Double> userPayment = new HashMap<String, Double>();//use a HashMap to record everyone's share	   
	   int l = selectedBillIndexs.size();
	   for(int i = 0; i < l; i ++){
		  NameList people = CurrentBills.getBill(selectedBillIndexs.get(i)).getNames(); // ge the names of people who should pay for this bill i
		  int peopleNum = people.size();//for bill i, get the number of people who should pay for this bill i.
		  double amount = CurrentBills.getBill(selectedBillIndexs.get(i)).getAmount();//get the amount for bill i
		  double share = amount/peopleNum;//calculate everyone's share
		  for(String s : people){//now put the share into the HashMap.
			  if(userPayment.containsKey(s)){//if the name is already in HashMap, just add it to the original data
				  double newShare = userPayment.get(s)+share;
				  userPayment.put(s, newShare);
			  }
			  else userPayment.put(s, share);//if the name never appear before, then add the name to HashMap now.
		  }
	   }
	   return userPayment;
   }
   
   public static HashMap<String,Double> split(SplitRules r){
	   ArrayList<Integer> billIndex = new ArrayList<Integer>();
	   int allBillSize = CurrentBills.getSize();
	   if (r == SplitRules.TODAY){//collect the index of the bill whose date is today.
		   for(int i = 0; i <allBillSize; i ++ ){
		       	if(CurrentBills.getBill(i).getDate().isToday())
		       		billIndex.add(i);	
		       }	   
	   }
	   if(r == SplitRules.THISMONTH){//collect the index of the bill whose date is in this month.
		   for(int i = 0; i <allBillSize; i ++ ){
		       	if(CurrentBills.getBill(i).getDate().isThisMonth())
		       		billIndex.add(i);	
		       }
	   }
       return CurrentBills.split(billIndex);
   }
}
