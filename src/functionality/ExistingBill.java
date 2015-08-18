/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionality;

/**
 *
 * @author Hang Xu
 */
public class ExistingBill {
  
   static BillData[] existingBills =new BillData[100];

   public static void addBill(BillData bill)
   {  
      for(int existingBillIndex=0;existingBillIndex<existingBills.length;existingBillIndex++)
      {
          if (existingBills[existingBillIndex]==null)
          {
              existingBills[existingBillIndex]=bill;
             
              break;
          }
         
      }
       
   }
   
   public static void editBill(BillData bill,int i)
   {
       existingBills[i]=bill;
   }
   
   public static void deleteBill(int toBeDeletedIndex)
   {
       for (int existingBillIndex=toBeDeletedIndex;existingBillIndex<ExistingBill.existingBills.length-1;existingBillIndex++)
       {
           existingBills[existingBillIndex]=existingBills[existingBillIndex+1];
       }
   }
   
   public static BillData[] getExistingBills()
   {
       return existingBills;
   }
   
   public static int totalBillCount()
   {   int count=0;
       for(int existingBillIndex=0;existingBillIndex<existingBills.length;existingBillIndex++)
       {
           if (existingBills[existingBillIndex]==null)
           { count=existingBillIndex;
               break;}
       }
       return count;
   }
    
   public static double[] split(int[] selectedBillIndexs)
   {   double[] individualAmount=new double[3];
       BillData[] tmps =ExistingBill.getExistingBills();
       
       for(int index=0;index<selectedBillIndexs.length;index++)
       {
           if (selectedBillIndexs[index]>=0)
           {
               BillData tmp = tmps[selectedBillIndexs[index]];
          
           switch(tmp.nameToRoommateIndex(tmp.getPeople()))
           {
            case 1: individualAmount[2]=individualAmount[2]+tmp.getAmountNumber();
                break;
            case 2: individualAmount[1]=individualAmount[1]+tmp.getAmountNumber();
                break;
            case 3: individualAmount[1]=individualAmount[1]+0.5*tmp.getAmountNumber();
                        individualAmount[2]=individualAmount[2]+0.5*tmp.getAmountNumber();
                break;
            case 4: individualAmount[0]=individualAmount[0]+tmp.getAmountNumber();
                break;
            case 5: individualAmount[0]=individualAmount[0]+0.5*tmp.getAmountNumber();
                        individualAmount[2]=individualAmount[2]+0.5*tmp.getAmountNumber();
                break;
            case 6: individualAmount[0]=individualAmount[0]+0.5*tmp.getAmountNumber();
                        individualAmount[1]=individualAmount[1]+0.5*tmp.getAmountNumber();
                break;
            case 7: individualAmount[0]=individualAmount[0]+tmp.getAmountNumber()/3;
                        individualAmount[1]=individualAmount[1]+tmp.getAmountNumber()/3;
                        individualAmount[2]=individualAmount[2]+tmp.getAmountNumber()/3;
                break;
           }
           }
           else break;
           
       }
       return individualAmount;
   }
}
