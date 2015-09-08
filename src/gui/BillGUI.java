/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.table.*;
import javax.swing.*;

import database.Bill;
import database.Contact;
import database.CurrentBills;
import database.CurrentContacts;
import functionality.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
/**
 *
 * @author Hang Xu
 */
public class BillGUI extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5103079923299795580L;
	ArrayList<JLabel> finalResultLabels;
    /**
     * Creates new form BillCheckGUI
     */
  DefaultTableModel model;
    public BillGUI() {
        finalResultLabels = new ArrayList<JLabel>();
        initComponents();
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(SwingConstants.LEADING);
       displayTable.getColumn("Time").setCellRenderer(render);
       displayTable.getColumn("People").setCellRenderer(render);
       displayTable.getColumn("Amount").setCellRenderer(render);
       displayTable.getColumn("Description").setCellRenderer(render);
       BillsLoader BL = new BillsLoader();
       BL.load();
       billLoadingfromExistingBill();
       int size = CurrentContacts.getContacts().size();
       finalResultPane.setLayout(new GridLayout(1,size));
       for(Contact s : CurrentContacts.getContacts()){
    	   JLabel l = new JLabel();
    	   l.setVerticalTextPosition(SwingConstants.TOP);
    	   l.setText(s.firstName+" "+s.lastName);
    	   l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    	   finalResultLabels.add(l);
    	   finalResultPane.add(l);
       }
    }
   private void billLoadingfromExistingBill()
    {    
       String[][] rowData = new String[CurrentBills.getSize()][4];
       for(int i=0;i<CurrentBills.getSize();i++)
       {
    	   Bill b = CurrentBills.getBill(i);
           rowData[i][0]=b.getDate().toString();
           rowData[i][1]=b.getNames().toString();
           rowData[i][2]=Double.toString(b.getAmount());
           rowData[i][3]=b.getDesc();
           model=(DefaultTableModel)displayTable.getModel();
           model.insertRow(model.getRowCount(), rowData[i]);
       }
       
       
      // DefaultTableModel tableModel = new DefaultTableModel(rowData,userTitle);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        splitButton = new javax.swing.JButton();
        thisMonthButton = new javax.swing.JButton();
        todayButton = new javax.swing.JButton();
        displayScrollPane = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        finalResultPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Bill Check");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        splitButton.setText("Split");
        splitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitButtonActionPerformed(evt);
            }
        });

        thisMonthButton.setText("This Month");
        thisMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thisMonthButtonActionPerformed(evt);
            }
        });

        todayButton.setText("Today");
        todayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayButtonActionPerformed(evt);
            }
        });

        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "People", "Amount", "Description"
            }
        ) {
            /**
			 * 
			 */
			private static final long serialVersionUID = -2520729546561062734L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Long.class, java.lang.String.class
            };

            @SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        displayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayTableMouseClicked(evt);
            }
        });
        displayScrollPane.setViewportView(displayTable);

        finalResultPane.setMaximumSize(new java.awt.Dimension(436, 144));
        finalResultPane.setMinimumSize(new java.awt.Dimension(436, 144));
        finalResultPane.setPreferredSize(new java.awt.Dimension(436, 144));

        javax.swing.GroupLayout finalResultPaneLayout = new javax.swing.GroupLayout(finalResultPane);
        finalResultPane.setLayout(finalResultPaneLayout);
        finalResultPaneLayout.setHorizontalGroup(
            finalResultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        finalResultPaneLayout.setVerticalGroup(
            finalResultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finalResultPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(todayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(thisMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(splitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(splitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(thisMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(todayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(finalResultPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainGUI mainGUI = new MainGUI();
        mainGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        BillAddingGUI addBillGUI = new BillAddingGUI();
        addBillGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(this.selectedRowCheck()){
        BillEdittingGUI editBillGUI = new BillEdittingGUI(this.getSelectedBill());
        editBillGUI.setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_editButtonActionPerformed
    
    private boolean selectedRowCheck(){
        int[] selectedRows=displayTable.getSelectedRows(); 
    	if(displayTable.getSelectedRow()<0){
            WrongPopup nonSelected = new WrongPopup("Choose a bill first");
            nonSelected.setVisible(true);
            nonSelected.setAlwaysOnTop(true);
            return false;
        }
       if(selectedRows.length>1){
           WrongPopup multDeletes = new WrongPopup("One at a time,please");
           multDeletes.setVisible(true);
           multDeletes.setAlwaysOnTop(true);
           return false;
       }
       return true;
    }

    private Bill getSelectedBill(){
    	int selectedRowIndex = displayTable.getSelectedRow();
    	return CurrentBills.getBill(selectedRowIndex);
    }
    
    private void displayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseClicked
        
        
    }//GEN-LAST:event_displayTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
          if(displayTable.getSelectedRow()<0)
         {
             WrongPopup noSelected = new WrongPopup("Choose a bill first");
             noSelected.setVisible(true);
             return;
         }
          
        int[] a ;
        a=displayTable.getSelectedRows();
        if(a.length>1)
        {
            WrongPopup mutdelete = new WrongPopup("Once at a time,please");
            mutdelete.setVisible(true);
            mutdelete.setAlwaysOnTop(true);
            
            
        }
        else{
        DeleteConfirmPopup del = new DeleteConfirmPopup(this);
        DeleteConfirmPopup.setIndex(displayTable.getSelectedRow());
        del.setVisible(true);
       }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void splitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitButtonActionPerformed
    	for(int i = 0; i < CurrentContacts.getContacts().size();i++){
    		Contact c = CurrentContacts.getContacts().get(i);
    		this.finalResultLabels.get(i).setText(c.firstName+" "+c.lastName);
    	}
    	HashMap<String,Double>billForEveryone = CurrentBills.split(getSelctedRowIndex());
        showFinalResult(billForEveryone);
        
    }//GEN-LAST:event_splitButtonActionPerformed

    private void todayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayButtonActionPerformed
    	for(int i = 0; i < CurrentContacts.getContacts().size();i++){
    		Contact c = CurrentContacts.getContacts().get(i);
    		this.finalResultLabels.get(i).setText(c.firstName+" "+c.lastName);
    	}
    	HashMap<String,Double> billForEveryone = CurrentBills.split("today");
    	showFinalResult(billForEveryone);
        
    }//GEN-LAST:event_todayButtonActionPerformed

    private void thisMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thisMonthButtonActionPerformed
    	for(int i = 0; i < CurrentContacts.getContacts().size();i++){
    		Contact c = CurrentContacts.getContacts().get(i);
    		this.finalResultLabels.get(i).setText(c.firstName+" "+c.lastName);
    	}
    	HashMap<String,Double> billForEveryone = CurrentBills.split("thismonth");
    	showFinalResult(billForEveryone);
    }//GEN-LAST:event_thisMonthButtonActionPerformed
    private ArrayList<Integer> getSelctedRowIndex(){
    	
    	if(displayTable.getSelectedRow()<0)
        {
            WrongPopup noSelected = new WrongPopup("Choose a bill first");
            noSelected.setVisible(true);
        }
      int[] s = displayTable.getSelectedRows();
      ArrayList<Integer> selectedIndexs = new ArrayList<Integer>();
      for(int i = 0; i < s.length; i ++){
    	  selectedIndexs.add(s[i]);
      }
      return selectedIndexs;
    }
    private void showFinalResult(HashMap<String,Double> finalResult){
        for(JLabel l : finalResultLabels){
        	if(finalResult.containsKey(l.getText())){
        		String name = l.getText();
        		l.setText("<html><p>"+name+"</p><p>should pay</p><p>"+finalResult.get(name)+"</p></html>");
        	}
        	else 	l.setText("<html><p>"+l.getText()+"</p><p>should pay</p><p>"+0.0+"</p></html>");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane displayScrollPane;
    private javax.swing.JTable displayTable;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel finalResultPane;
    private javax.swing.JButton splitButton;
    private javax.swing.JButton thisMonthButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton todayButton;
    // End of variables declaration//GEN-END:variables
}
