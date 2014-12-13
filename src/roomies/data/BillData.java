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
public class BillData {
    String time,people, amount,descr;
    int day,month,year,peopleIndex;
    public BillData(int month, int day, int year, int peopleIndex, String amount,String description)
    {
        this.time= Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year);
        switch (peopleIndex)
        {
            case 1: this.people="Lily";
                break;
            case 2: this.people="Marshall";
                break;
            case 3: this.people="Marshall,Lily";
                break;
            case 4: this.people="Ted";
                break;
            case 5: this.people="Ted,Lily";
                break;
            case 6: this.people="Ted,Marshall";
                break;
            case 7: this.people="Ted,Marshall,Lily";
        }
               
       this.amount=amount;
       this.descr=description;
 
    }
    
    public BillData(String time,String people,String amount,String descr)
    {
        String[] tmp = time.split("/");
        this.month=Integer.parseInt(tmp[0]);
        this.day=Integer.parseInt(tmp[1]);
        this.year=Integer.parseInt(tmp[2]);
        switch(people)
        {
            case "Lily": this.peopleIndex=1;
                break;
            case "Marshall": this.peopleIndex=2;
                break;
            case "Marshall,Lily": this.peopleIndex=3;
                break;
            case "Ted": this.peopleIndex=4;
                break;
            case "Ted,Lily": this.peopleIndex=5;
                break;
            case "Ted,Marshall": this.peopleIndex=6;
                break;
            case "Ted,Marshall,Lily": this.peopleIndex=7;
                break;
        }
        
        this.amount=amount;
        this.descr=descr;
    }
 
    public Object[] getValue()
    {
        Object[] a = {month,day,year,peopleIndex,amount,descr};
        return a;
    }
    
    public String getTime()
    {
        return this.time;
    }
    
    public String getPeople()
    {
        return this.people;
    }
    
    public String getAmount()
    {
        return this.amount;
    }
    
    public String getDescr()
    {
        return this.descr;
    }
    
    public int getPeopleIndex()
    {
        return this.peopleIndex;
    }
    
    public double getAmountNumber()
    {
        return Double.parseDouble(this.getAmount());
    }
    
    public int people2Index(String people)
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
