/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionality;

import java.util.ArrayList;

/**
 *
 * @author Hang Xu
 */
public class Bill {
	Date date;
	double amout;
	ArrayList<String> names;
	String desc;

    public Bill(Date date, double amount, ArrayList<String> names, String desc) {
        this.date = date;
        this.amout = amount;
        this.names = names;
        this.desc = desc;
    }

    

}
