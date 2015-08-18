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
public class Bill {
	private Date date;
	private double amout;
	private NameList names;
	private String desc;

    public Bill(Date date, double amount, NameList names, String desc) {
        this.date = date;
        this.amout = amount;
        this.names = names;
        this.desc = desc;
    }
    
    public Date getDate(){
    	return this.date;
    }
    
    public double getAmount(){
    	return this.amout;
    }
    
    public NameList getNames(){
    	return this.names;
    }
    
    public String getDesc(){
    	return this.desc;
    }

}
