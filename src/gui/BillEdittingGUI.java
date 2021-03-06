/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import database.Bill;
import database.CurrentContacts;
import database.Date;
import database.NameList;
import functionality.BillUpdater;
/**
 *
 * @author Hang Xu
 */
public class BillEdittingGUI extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6259110670135386110L;
	static String billID;
	JCheckBox[] nameCheckBox;
    /**
     * Creates new form EditBillGUI
     */
    public BillEdittingGUI(Bill bill) {
        initComponents();       
        System.out.println("The loaded bill is "+bill.getBillID());
        int size = CurrentContacts.getContacts().size();
        nameCheckBox = new JCheckBox[size];
        namePane.setLayout(new GridLayout(size,1));
        for(int i = 0;i<nameCheckBox.length;i++){
        	JCheckBox j = new JCheckBox();
        	nameCheckBox[i] = j;
        	nameCheckBox[i].setText(CurrentContacts.getContacts().get(i).getFirstName()+" "
        +CurrentContacts.getContacts().get(i).getLastName());
        	namePane.add(nameCheckBox[i]);
        }
        loading(bill);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editBillButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        descriptionComboBox = new javax.swing.JComboBox<String>();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        amountText = new javax.swing.JTextField();
        yearComboBox = new javax.swing.JComboBox<String>();
        dayComboBox = new javax.swing.JComboBox<String>();
        monthComboBox = new javax.swing.JComboBox<String>();
        namePane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(875, 454));
        setMinimumSize(new java.awt.Dimension(875, 454));
        setResizable(false);

        editBillButton.setText("Edit");
        editBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBillButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        descriptionComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        descriptionComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Other", "Cable", "Electricity", "Food", "Gas", "Internet", "Rent", "Water" }));
        descriptionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionComboBoxActionPerformed(evt);
            }
        });

        descriptionText.setColumns(20);
        descriptionText.setRows(5);
        descriptionText.setText("Description");
        descriptionText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descriptionTextFocusGained(evt);
            }
        });
        descriptionScrollPane.setViewportView(descriptionText);

        amountText.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        amountText.setForeground(new java.awt.Color(204, 204, 255));
        amountText.setText("Amount");

        yearComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", " " }));

        dayComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        monthComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        namePane.setMaximumSize(new java.awt.Dimension(228, 253));
        namePane.setMinimumSize(new java.awt.Dimension(228, 253));
        namePane.setName(""); // NOI18N

        javax.swing.GroupLayout namePaneLayout = new javax.swing.GroupLayout(namePane);
        namePane.setLayout(namePaneLayout);
        namePaneLayout.setHorizontalGroup(
            namePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        namePaneLayout.setVerticalGroup(
            namePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(amountText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(namePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(descriptionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(namePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(descriptionScrollPane)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBillButtonActionPerformed
       if(!this.atLeastOneSelected()){
    	 WrongPopup noPersonSelected = new WrongPopup("No pessrson selected");
      	 noPersonSelected.setVisible(true);
      	 noPersonSelected.requestFocus();
       }
       else{
    	   Bill editedBill = this.generateUpdatedBill();
           BillUpdater BU = new BillUpdater();
           BU.edit(editedBill);
           BillGUI billGUI = new BillGUI();
           billGUI.setVisible(true);
           this.dispose();
       }
    	
 
    }//GEN-LAST:event_editBillButtonActionPerformed

    private boolean atLeastOneSelected() {
		boolean result = false;
		for(JCheckBox c: nameCheckBox){
			result = result || c.isSelected();
		}
		return result;
	}
	private void descriptionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyComboBoxActionPerformed
        // TODO add your handling code here:
    	 if(descriptionComboBox.getSelectedIndex()!=0)
         {   
    		 descriptionText.setText(this.descriptionComboBox.getSelectedItem().toString());
             descriptionText.setFont(new Font("Tahoma",Font.ITALIC,24));
             descriptionText.setForeground(Color.black);
         }
         else{
             descriptionText.setText("Type description here");
             descriptionText.setForeground(new Color(204,204,255));
             
         }
        
    }//GEN-LAST:event_currencyComboBoxActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed

    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        BillEdittingGUI.billID=null;
    	BillGUI billGUI = new BillGUI();
        billGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void descriptionTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descriptionTextFocusGained
        if(!this.descriptionText.getForeground().equals(Color.black)){
        	this.descriptionText.setText("");
        	this.descriptionText.setForeground(Color.black);
        }
    }//GEN-LAST:event_descriptionTextFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillEdittingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillEdittingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillEdittingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillEdittingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */

    }

    
    private Bill generateUpdatedBill() {
		Date newDate = this.getDate();
		double newAmount = this.getAmount();
		NameList newNames = this.getNames();
		String newDesc = this.getDesc();
		return new Bill(newDate, newAmount, newNames, newDesc, billID, newDesc);
	}

    private Date getDate(){
    	int year = yearComboBox.getSelectedIndex() + 2000;
    	int month = monthComboBox.getSelectedIndex() + 1;
    	int day = dayComboBox.getSelectedIndex() + 1;
    	return new Date(month, day, year);
    }
    private double getAmount(){
    	String s = amountText.getText();
    	double amount = Double.parseDouble(s);
    	return amount;
    }
    private NameList getNames(){
    	NameList names = new NameList();
    	for(JCheckBox c: nameCheckBox){
    		if(c.isSelected()){
    			names.add(c.getText());
    		}
    	}

         return names;
    }
    private String getDesc(){
    	if(descriptionText.getText().equals("Type description here")&&descriptionText.getForeground()!=Color.black){
    		descriptionText.setText("");
    		}
    	return descriptionText.getText();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JComboBox<String> descriptionComboBox;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JButton editBillButton;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JPanel namePane;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
	private void loading(Bill bill) {//loading the bill information to the GUI
		int size = this.descriptionComboBox.getItemCount();
		int i = 0;
		this.setDate(bill);
		this.setAmount(bill);
		this.setNames(bill);
		this.setDesc(bill);
		for(; i < size; i++){
			if(bill.getDesc().equals(this.descriptionComboBox.getItemAt(i).toString())){
				this.descriptionComboBox.setSelectedIndex(i);
				break;
			}
		}
        System.out.println("In loading:"+this.descriptionComboBox.getSelectedIndex());
		if (i == size){
			 this.descriptionComboBox.setSelectedIndex(0);
		}

		BillEdittingGUI.billID=bill.getBillID();
	}
	private void setDesc(Bill bill){
		System.out.println(bill.getDesc());
		descriptionText.setText(bill.getDesc());
	}
	private void setNames(Bill bill) {
		NameList names = bill.getNames();
		int size = nameCheckBox.length;
		for(int i = 0; i < size; i ++){
			if(names.contains(nameCheckBox[i].getText())){
				nameCheckBox[i].setSelected(true);
			}
		}
	
		
	}
	private void setAmount(Bill bill) {
		this.amountText.setText(Double.toString(bill.getAmount()));	
	}
	private void setDate(Bill bill) {
		this.dayComboBox.setSelectedIndex(bill.getDate().getDay() - 1);
		this.monthComboBox.setSelectedIndex(bill.getDate().getMonth() -1);
		this.yearComboBox.setSelectedIndex(bill.getDate().getYear() - 2000);
	}

}
