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
public class BillData {
    String time,name, amount,desciption;
    int day,month,year,roommateIndex;
    public BillData(int month, int day, int year, int peopleIndex, String amount,String description)
    {
        this.time= Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year);
        switch (peopleIndex)
        {
            case 1: this.name="Lily";
                break;
            case 2: this.name="Marshall";
                break;
            case 3: this.name="Marshall,Lily";
                break;
            case 4: this.name="Ted";
                break;
            case 5: this.name="Ted,Lily";
                break;
            case 6: this.name="Ted,Marshall";
                break;
            case 7: this.name="Ted,Marshall,Lily";
        }
               
       this.amount=amount;
       this.desciption=description;
 
    }
    
    public BillData(String time,String people,String amount,String descr)
    {
        String[] tmp = time.split("/");
        this.month=Integer.parseInt(tmp[0]);
        this.day=Integer.parseInt(tmp[1]);
        this.year=Integer.parseInt(tmp[2]);
        switch(people)
        {
            case "Lily": this.roommateIndex=1;
                break;
            case "Marshall": this.roommateIndex=2;
                break;
            case "Marshall,Lily": this.roommateIndex=3;
                break;
            case "Ted": this.roommateIndex=4;
                break;
            case "Ted,Lily": this.roommateIndex=5;
                break;
            case "Ted,Marshall": this.roommateIndex=6;
                break;
            case "Ted,Marshall,Lily": this.roommateIndex=7;
                break;
        }
        
        this.amount=amount;
        this.desciption=descr;
    }
 
    public Object[] getBillDataValue()
    {
        Object[] billDataValue = {month,day,year,roommateIndex,amount,desciption};
        return billDataValue;
    }
    
    public String getTime()
    {
        return this.time;
    }
    
    public String getPeople()
    {
        return this.name;
    }
    
    public String getAmount()
    {
        return this.amount;
    }
    
    public String getDescr()
    {
        return this.desciption;
    }
    
    public int getRoommateIndex()
    {
        return this.roommateIndex;
    }
    
    public double getAmountNumber()
    {
        return Double.parseDouble(this.getAmount());
    }
    
    public int nameToRoommateIndex(String people)
    {
      switch(people)
        {
            case "Lily": return 1;
            case "Marshall":return 2;
            case "Marshall,Lily": return 3;
            case "Ted": return 4;
            case "Ted,Lily":return 5;
            case "Ted,Marshall": return 6;
            case "Ted,Marshall,Lily":return 7;
        }  
      return 0;
    }
}
