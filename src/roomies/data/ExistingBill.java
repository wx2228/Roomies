/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomies.data;

/**
 *
 * @author Hang Xu
 */
public class ExistingBill {
  
   static BillData[] existingBills =new BillData[100];

   public static void addBill(BillData bill)
   {  
      for(int i=0;i<existingBills.length;i++)
      {
          if (existingBills[i]==null)
          {
              existingBills[i]=bill;
             
              break;
          }
         
      }
       
   }
   
   public static void editBill(BillData bill,int i)
   {
       existingBills[i]=bill;
   }
   
   public static void deleteBill(int j)
   {
       for (int i=j;i<ExistingBill.existingBills.length-1;i++)
       {
           existingBills[i]=existingBills[i+1];
       }
   }
   
   public static BillData[] getExistingBills()
   {
       return existingBills;
   }
   
   public static int count()
   {   int count=0;
       for(int i=0;i<existingBills.length;i++)
       {
           if (existingBills[i]==null)
           { count=i;
               break;}
       }
       return count;
   }
    
   public static double[] split(int[] selectedIndexs)
   {   double[] indiAmount=new double[3];
       BillData[] tmps =ExistingBill.getExistingBills();
       
       for(int i=0;i<selectedIndexs.length;i++)
       {
           if (selectedIndexs[i]>=0)
           {
               BillData tmp = tmps[selectedIndexs[i]];
          
           switch(tmp.people2Index(tmp.getPeople()))
           {
            case 1: indiAmount[2]=indiAmount[2]+tmp.getAmountNumber();
                break;
            case 2: indiAmount[1]=indiAmount[1]+tmp.getAmountNumber();
                break;
            case 3: indiAmount[1]=indiAmount[1]+0.5*tmp.getAmountNumber();indiAmount[2]=indiAmount[2]+0.5*tmp.getAmountNumber();
                break;
            case 4: indiAmount[0]=indiAmount[0]+tmp.getAmountNumber();
                break;
            case 5: indiAmount[0]=indiAmount[0]+0.5*tmp.getAmountNumber();indiAmount[2]=indiAmount[2]+0.5*tmp.getAmountNumber();
                break;
            case 6: indiAmount[0]=indiAmount[0]+0.5*tmp.getAmountNumber();indiAmount[1]=indiAmount[1]+0.5*tmp.getAmountNumber();
                break;
            case 7: indiAmount[0]=indiAmount[0]+tmp.getAmountNumber()/3;indiAmount[1]=indiAmount[1]+tmp.getAmountNumber()/3;indiAmount[2]=indiAmount[2]+tmp.getAmountNumber()/3;
                break;
           }
           }
           else break;
           
       }
       return indiAmount;
   }
}
