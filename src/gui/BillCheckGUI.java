/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.table.*;
import javax.swing.*;

import database.Bill;
import database.ExistingBill;
import functionality.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date; 
import java.util.Calendar; 
import java.text.SimpleDateFormat; 

/**
 *
 * @author Hang Xu
 */
public class BillCheckGUI extends javax.swing.JFrame {

    /**
     * Creates new form BillCheckGUI
     */
  DefaultTableModel model;
    public BillCheckGUI() {
       
        initComponents();
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(SwingConstants.LEADING);
       displayTable.getColumn("Time").setCellRenderer(render);
       displayTable.getColumn("People").setCellRenderer(render);
       displayTable.getColumn("Amount").setCellRenderer(render);
       displayTable.getColumn("Description").setCellRenderer(render);
    }
   public void billLoading()
    {    
       String[][] rowData = new String[ExistingBill.getSize()][4];
       for(int i=0;i<ExistingBill.getSize();i++)
       {
    	   Bill currentBill = ExistingBill.getBill(i);
           rowData[i][0]=currentBill.getDate().toString();
           rowData[i][1]=currentBill.getNames().toString();
           rowData[i][2]=Double.toString(currentBill.getAmount());
           rowData[i][3]=currentBill.getDesc();
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
        user1SubstotalLabel = new javax.swing.JLabel();
        user2SubstotalLabel = new javax.swing.JLabel();
        use3rSubstotalLabel = new javax.swing.JLabel();
        MarshallAmount = new javax.swing.JLabel();
        LilyAmount = new javax.swing.JLabel();
        TedAmount = new javax.swing.JLabel();
        thisMonthButton = new javax.swing.JButton();
        todayButton = new javax.swing.JButton();
        displayScrollPane = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();

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

        user1SubstotalLabel.setText("Ted Mosby should pay:");

        user2SubstotalLabel.setText("Marshall Eriksen should pay:");

        use3rSubstotalLabel.setText("Lily Aldrin should pay:");

        MarshallAmount.setText("0");

        LilyAmount.setText("0");

        TedAmount.setText("0");

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
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Long.class, java.lang.String.class
            };

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(use3rSubstotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user1SubstotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user2SubstotalLabel))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MarshallAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LilyAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(todayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(thisMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(splitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(splitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(todayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(thisMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(user1SubstotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(user2SubstotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MarshallAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(use3rSubstotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LilyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, 0))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {use3rSubstotalLabel, user1SubstotalLabel, user2SubstotalLabel});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainGUI mainGUI = new MainGUI();
        mainGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        BillAddingGUI addBillGUI = new BillAddingGUI();
        addBillGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(this.selectedRowCheck()){
        BillEdittingGUI editBillGUI = new BillEdittingGUI();
        editBillGUI.loading(this.getSelectedBill(),displayTable.getSelectedRow());
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
    	return ExistingBill.getBill(selectedRowIndex);
    }
    
    private void displayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseClicked
        
        
    }//GEN-LAST:event_displayTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
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
        DeleteConfirmPopup del = new DeleteConfirmPopup();
        DeleteConfirmPopup.setIndex(displayTable.getSelectedRow());
        del.setVisible(true);
       }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void splitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitButtonActionPerformed
        // TODO add your handling code here:
//           if(displayTable.getSelectedRow()<0)
//         {
//             WrongPopup noSelected = new WrongPopup("Choose a bill first");
//             noSelected.setVisible(true);
//             return;
//         }
//        int[] selectedIndexs = displayTable.getSelectedRows();
        double[] billForEveryone = ExistingBill.split(getSelctedRowIndex());
        showFinalResult(billForEveryone);
        
    }//GEN-LAST:event_splitButtonActionPerformed

    private void todayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayButtonActionPerformed
        // TODO add your handling code here:
    	double[] billForEveryone = ExistingBill.split("today");
    	showFinalResult(billForEveryone);
        
    }//GEN-LAST:event_todayButtonActionPerformed

    private void thisMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thisMonthButtonActionPerformed
    	double[] billForEveryone = ExistingBill.split("thismonth");
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
    private void showFinalResult(double[] finalResult){
        TedAmount.setText(String.valueOf(finalResult[0]));
        MarshallAmount.setText(String.valueOf(finalResult[1]));
        LilyAmount.setText(String.valueOf(finalResult[2]));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LilyAmount;
    private javax.swing.JLabel MarshallAmount;
    private javax.swing.JLabel TedAmount;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane displayScrollPane;
    private javax.swing.JTable displayTable;
    private javax.swing.JButton editButton;
    private javax.swing.JButton splitButton;
    private javax.swing.JButton thisMonthButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton todayButton;
    private javax.swing.JLabel use3rSubstotalLabel;
    private javax.swing.JLabel user1SubstotalLabel;
    private javax.swing.JLabel user2SubstotalLabel;
    // End of variables declaration//GEN-END:variables
}
