/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import database.Bill;
import database.Date;
import database.ExistingBill;
import database.NameList;
/**
 *
 * @author Hang Xu
 */
public class BillEdittingGUI extends javax.swing.JFrame {
	static int selectedEditedIndex;
    /**
     * Creates new form EditBillGUI
     */
    public BillEdittingGUI() {
        initComponents();       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editBillButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        descriptionComboBox = new javax.swing.JComboBox();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        amountText = new javax.swing.JTextField();
        roommate2Label = new javax.swing.JCheckBox();
        roommate1Label = new javax.swing.JCheckBox();
        roommate3Label = new javax.swing.JCheckBox();
        yearComboBox = new javax.swing.JComboBox();
        dayComboBox = new javax.swing.JComboBox();
        monthComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        descriptionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        descriptionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionComboBoxActionPerformed(evt);
            }
        });

        descriptionText.setColumns(20);
        descriptionText.setRows(5);
        descriptionText.setText("Description");
        descriptionScrollPane.setViewportView(descriptionText);

        amountText.setText("Amount");

        roommate2Label.setText("Marshall Eriksen");
        roommate2Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roommate2LabelActionPerformed(evt);
            }
        });

        roommate1Label.setText("Ted Mosby");

        roommate3Label.setText("Lily Aldrin");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", " " }));

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amountText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthComboBox, 0, 187, Short.MAX_VALUE)
                                    .addComponent(roommate1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roommate2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roommate3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addComponent(descriptionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yearComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(descriptionScrollPane))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(editBillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roommate2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roommate1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roommate3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountText)
                    .addComponent(descriptionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(descriptionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBillButtonActionPerformed
//         int peopleIndex=0;
//        if(roommate1Label.isSelected())
//            peopleIndex=peopleIndex+4;
//        if(roommate2Label.isSelected())
//            peopleIndex=peopleIndex+2;
//        if(roommate3Label.isSelected())
//            peopleIndex=peopleIndex+1;  
//        Bill editedBill = new Bill(monthComboBox.getSelectedIndex()+1,dayComboBox.getSelectedIndex()+1,yearComboBox.getSelectedIndex()+2000,peopleIndex,amountText.getText(),descriptionText.getText()); 
    	Bill  editedBill = this.generateBill();
    	ExistingBill.edit(editedBill, selectedEditedIndex);
        BillCheckGUI billGUI = new BillCheckGUI();
        billGUI.billLoading();
        billGUI.setVisible(true);
        this.dispose();
        
       
    }//GEN-LAST:event_editBillButtonActionPerformed

    private void descriptionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyComboBoxActionPerformed
        // TODO add your handling code here:
    	 if(descriptionComboBox.getSelectedIndex()!=0)
         {
             descriptionText.setFont(new Font("Tahoma",Font.ITALIC,24));
             descriptionText.setForeground(Color.black);
         }
         else{
             descriptionText.setText("Type description here");
             descriptionText.setForeground(new Color(204,204,255));
             
         }
         descriptionText.setText(descriptionComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_currencyComboBoxActionPerformed

    private void roommate2LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roommate2LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roommate2LabelActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
          BillCheckGUI billGUI = new BillCheckGUI();
        billGUI.billLoading();
        billGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillEdittingGUI().setVisible(true);
            }
        });
    }

    
    private Bill generateBill() {
		Date newDate = this.getDate();
		double newAmount = this.getAmount();
		NameList newNames = this.getNames();
		String newDesc = this.getDesc();
		return new Bill(newDate, newAmount, newNames, newDesc);
	}

    private Date getDate(){
    	int year = yearComboBox.getSelectedIndex() + 2000;
    	int month = monthComboBox.getSelectedIndex() + 1;
    	int day = dayComboBox.getSelectedIndex() + 1;
    	return new Date(year, month, day);
    }
    private double getAmount(){
    	String s = amountText.getText();
    	double amount = Double.parseDouble(s);
    	return amount;
    }
    private NameList getNames(){
    	NameList names = new NameList();
    	 if(roommate1Label.isSelected())
             names.add(roommate1Label.getText());
         if(roommate2Label.isSelected())
        	 names.add(roommate2Label.getText());
         if(roommate3Label.isSelected())
        	 names.add(roommate3Label.getText());
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
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JComboBox descriptionComboBox;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JButton editBillButton;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JCheckBox roommate1Label;
    private javax.swing.JCheckBox roommate2Label;
    private javax.swing.JCheckBox roommate3Label;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
	public void loading(Bill bill, int selectedRow) {
		BillEdittingGUI.setBillIndex(selectedRow);
		this.setDate(bill);
		this.setAmount(bill);
		this.setNames(bill);
		this.setDesc(bill);
	}
	private void setDesc(Bill bill){
		descriptionText.setText(bill.getDesc());
	}
	private void setNames(Bill bill) {
		NameList names = bill.getNames();
		JCheckBox[] nameLabels = {roommate1Label,roommate2Label,roommate3Label};
		int l = nameLabels.length;
		for(int i = 0; i < l; i ++){
			if(names.contains(nameLabels[i].getText())){
				nameLabels[i].setSelected(true);
			}
		}
	
		
		
	}
	private void setAmount(Bill bill) {
		this.amountText.setText(Double.toString(bill.getAmount()));	
	}
	private void setDate(Bill bill) {
		this.dayComboBox.setSelectedIndex(bill.getDate().day - 1);
		this.monthComboBox.setSelectedIndex(bill.getDate().month -1);
		this.yearComboBox.setSelectedIndex(bill.getDate().year - 2000);
	}
	static private void setBillIndex(int i)
	{
	    selectedEditedIndex =i;
	}
	static public int getIndex()
	{
	    return selectedEditedIndex;
	}
}
