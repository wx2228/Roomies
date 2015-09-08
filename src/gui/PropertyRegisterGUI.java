/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;

import database.Address;
import database.Property;
import functionality.PropertySearcher;

/**
 *
 * @author Hang Xu
 */
public class PropertyRegisterGUI extends javax.swing.JFrame {
	static int MODE = 0; // when mode is 0, it means the GUI is in searching mode, when 1, means adding mode.

    /**
     * Creates new form NewProperty
     */
    public PropertyRegisterGUI() {
        initComponents();
    }
    
    public PropertyRegisterGUI(Property p){
    	initComponents();
    	this.streetLine1.setText(p.getPropertyAddress().getStreetLine1());
    	this.streetLine2.setText(p.getPropertyAddress().getStreetLine2());
    	this.aptNumber.setText(p.getPropertyAddress().getAptNumber());
    	this.city.setText(p.getPropertyAddress().getCity());
    	this.state.setText(p.getPropertyAddress().getState());
    	this.country.setText(p.getPropertyAddress().getCountry());
    	this.zipcode.setText(p.getPropertyAddress().getZipcode());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchAndAdd = new javax.swing.JButton();
        inforText1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        infoText2 = new javax.swing.JLabel();
        streetLine1 = new javax.swing.JTextField();
        streetLine2 = new javax.swing.JTextField();
        aptNumber = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        zipcode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        searchAndAdd.setText("Search");
        searchAndAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchAndAddMouseClicked(evt);
            }
        });

        inforText1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        inforText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inforText1.setText("Please type");

        cancelButton.setText("cancel");
        cancelButton.setEnabled(false);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        infoText2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        infoText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoText2.setText("property address");

        streetLine1.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        streetLine1.setForeground(new java.awt.Color(204, 204, 255));
        streetLine1.setText("Street Line 1");
        streetLine1.setAutoscrolls(false);
        streetLine1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                streetLine1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetLine1FocusLost(evt);
            }
        });

        streetLine2.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        streetLine2.setForeground(new java.awt.Color(204, 204, 255));
        streetLine2.setText("Street Line 2");
        streetLine2.setAutoscrolls(false);
        streetLine2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                streetLine2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetLine2FocusLost(evt);
            }
        });

        aptNumber.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        aptNumber.setForeground(new java.awt.Color(204, 204, 255));
        aptNumber.setText("Apt Number");
        aptNumber.setAutoscrolls(false);
        aptNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aptNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aptNumberFocusLost(evt);
            }
        });

        city.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        city.setForeground(new java.awt.Color(204, 204, 255));
        city.setText("City");
        city.setAutoscrolls(false);
        city.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityFocusLost(evt);
            }
        });

        state.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        state.setForeground(new java.awt.Color(204, 204, 255));
        state.setText("State");
        state.setAutoscrolls(false);
        state.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stateFocusLost(evt);
            }
        });

        country.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        country.setForeground(new java.awt.Color(204, 204, 255));
        country.setText("Country");
        country.setAutoscrolls(false);
        country.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                countryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryFocusLost(evt);
            }
        });

        zipcode.setFont(new java.awt.Font("Franklin Gothic Book", 2, 36)); // NOI18N
        zipcode.setForeground(new java.awt.Color(204, 204, 255));
        zipcode.setText("Zipcode");
        zipcode.setAutoscrolls(false);
        zipcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zipcodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipcodeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(streetLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aptNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inforText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchAndAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoText2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(streetLine1)
                        .addGap(0, 0, 0)
                        .addComponent(streetLine2)
                        .addGap(0, 0, 0)
                        .addComponent(aptNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inforText1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoText2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(searchAndAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


	private Property ProertyInformationCollector() {
		Property userInputTemp = new Property(this.streetLine1.getText(),this.streetLine2.getText(),
				this.aptNumber.getText(),this.city.getText(),this.state.getText(),this.country.getText(),
				this.zipcode.getText(), null);
		return userInputTemp;
	}

	private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
       this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void searchAndAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchAndAddMouseClicked
    	 Property userInputAddress = ProertyInformationCollector(); 
      	  PropertySearcher p = new PropertySearcher(userInputAddress);
      	  boolean propertyExists = p.PropertyExists();
      	  if(propertyExists){       
      		  MODE = 1; // property exists
      		  userInputAddress.setPropertyID(p.getPropertyID());
      		  PropertyConfirmPopUp PropertyFound = new PropertyConfirmPopUp(MODE, userInputAddress);
      		  PropertyFound.setVisible(true);
          	System.out.println("MODE IS "+MODE); 
      	  }
      	  else{ // no property found
      		  MODE = 0;
      		  if(userInputAddress.generatePropertyID()){
          		  PropertyConfirmPopUp PropertyNotFound = new PropertyConfirmPopUp(MODE,userInputAddress);
          		  PropertyNotFound.setVisible(true);   
              	System.out.println("MODE IS "+MODE); 
      		  }
      	  }
  		  this.dispose();
       	 
     
    }//GEN-LAST:event_searchAndAddMouseClicked

    private void streetLine1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetLine1FocusGained
        if(!streetLine1.getForeground().equals(Color.black)){
        	streetLine1.setForeground(Color.black);
        	streetLine1.setText(null);
        }
        
    }//GEN-LAST:event_streetLine1FocusGained

    private void streetLine2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetLine2FocusGained
    	if(!streetLine2.getForeground().equals(Color.black)){
        	streetLine2.setForeground(Color.black);
        	streetLine2.setText(null);
        }
    }//GEN-LAST:event_streetLine2FocusGained

    private void aptNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aptNumberFocusGained
    	if(!aptNumber.getForeground().equals(Color.black)){
    		aptNumber.setForeground(Color.black);
    		aptNumber.setText(null);
        }
    }//GEN-LAST:event_aptNumberFocusGained

    private void cityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusGained
    	if(!city.getForeground().equals(Color.black)){
    		city.setForeground(Color.black);
    		city.setText(null);
        }
    }//GEN-LAST:event_cityFocusGained

    private void streetLine1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetLine1FocusLost
        if(streetLine1.getText().trim().equals("")){
        	streetLine1.setText("Street Line 1");
        	 streetLine1.setForeground(new java.awt.Color(204, 204, 255));
        }
    }//GEN-LAST:event_streetLine1FocusLost

    private void streetLine2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetLine2FocusLost
        if(streetLine2.getText().trim().equals("")){
        	streetLine2.setText("Street Line 2");
        	 streetLine2.setForeground(new java.awt.Color(204, 204, 255));
        }
    }//GEN-LAST:event_streetLine2FocusLost

    private void aptNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aptNumberFocusLost
        if(aptNumber.getText().trim().equals("")){
        	aptNumber.setText("Apt Number");
        	 aptNumber.setForeground(new java.awt.Color(204, 204, 255));
        }
    }//GEN-LAST:event_aptNumberFocusLost

    private void cityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusLost
        if(city.getText().trim().equals("")){
        	city.setText("City");
        	 city.setForeground(new java.awt.Color(204, 204, 255));
        }
    }//GEN-LAST:event_cityFocusLost

    private void stateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateFocusGained
    	if(!state.getForeground().equals(Color.black)){
    		state.setForeground(Color.black);
    		state.setText(null);
        }
    }//GEN-LAST:event_stateFocusGained

    private void stateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateFocusLost
        if(state.getText().trim().equals("")){
        	state.setText("State");
        	 state.setForeground(new java.awt.Color(204, 204, 255));
        }
    }//GEN-LAST:event_stateFocusLost

    private void countryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryFocusGained
    	if(!country.getForeground().equals(Color.black)){
    		country.setForeground(Color.black);
    		country.setText(null);
        }
    }//GEN-LAST:event_countryFocusGained

    private void countryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryFocusLost
        if(country.getText().trim().equals("")){
        	country.setText("Country");
        	 country.setForeground(new java.awt.Color(204, 204, 255));
        }
    }//GEN-LAST:event_countryFocusLost

    private void zipcodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipcodeFocusGained
    	if(!zipcode.getForeground().equals(Color.black)){
    		zipcode.setForeground(Color.black);
    		zipcode.setText(null);
        }
    }//GEN-LAST:event_zipcodeFocusGained

    private void zipcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipcodeFocusLost
        if(zipcode.getText().trim().equals("")){
        	zipcode.setText("Zipcode");
        	 zipcode.setForeground(new java.awt.Color(204, 204, 255));
        }
    }//GEN-LAST:event_zipcodeFocusLost

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
            java.util.logging.Logger.getLogger(PropertyRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PropertyRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PropertyRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PropertyRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropertyRegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aptNumber;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField city;
    private javax.swing.JTextField country;
    private javax.swing.JLabel infoText2;
    private javax.swing.JLabel inforText1;
    private javax.swing.JButton searchAndAdd;
    private javax.swing.JTextField state;
    private javax.swing.JTextField streetLine1;
    private javax.swing.JTextField streetLine2;
    private javax.swing.JTextField zipcode;
    // End of variables declaration//GEN-END:variables
}
