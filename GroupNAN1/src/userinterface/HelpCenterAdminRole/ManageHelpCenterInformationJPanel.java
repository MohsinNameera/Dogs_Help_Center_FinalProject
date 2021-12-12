/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HelpCenterAdminRole;

import Business.EcoSystem;
import Business.HelpCenter.HelpCenter;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivibhatt
 */
public class ManageHelpCenterInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHelpCenterInformationJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    HelpCenter restaurant;

    public ManageHelpCenterInformationJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        //getRestaurantObjectFromList();
        restaurant = (HelpCenter)userAccount;
        initComponents();
        display(restaurant);
        //populateTable();
//        initListners();
       confirmButton.setVisible(false);
       resetButton.setVisible(false);
    }
    
//    private void getRestaurantObjectFromList() {
//        for (HelpCenter restaurantInstance : ecosystem.getRestaurantDirectory().getRestaurantList()) {
//            if (userAccount.getUsername().equals(restaurantInstance.getUsername())) {
//                restaurant =  restaurantInstance;
//            }
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restaurantName = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        restaurantAddress = new javax.swing.JTextField();
        restaurantPhone = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE HELP CENTER INFORMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 50, 705, -1));

        jLabel2.setText("Help Center Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 113, 122, -1));
        add(restaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 110, 309, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 223, -1, -1));

        jLabel3.setText("Help Center Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 146, 122, -1));

        jLabel4.setText("Help Center Phone");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 186, 122, -1));
        add(restaurantAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 143, 309, -1));

        restaurantPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantPhoneActionPerformed(evt);
            }
        });
        add(restaurantPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 183, 309, -1));

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 223, -1, -1));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 223, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        confirmButton.setVisible(true);
       resetButton.setVisible(true);
       setVisibleEditable(true);
        
        //populateTable();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void restaurantPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaurantPhoneActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        restaurant.setName(restaurantName.getText());
        restaurant.setAddress(restaurantAddress.getText());
        restaurant.setPhone(restaurantPhone.getText());
        setVisibleEditable(false);
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
          restaurantName.setText("");
        restaurantAddress.setText("");
        restaurantPhone.setText("");
        
    }//GEN-LAST:event_resetButtonActionPerformed
    private void setVisibleEditable(boolean value) {
        restaurantName.setEditable(value);
        restaurantAddress.setEditable(value);
        restaurantPhone.setEditable(value);
       restaurantName.setEnabled(value);
       restaurantAddress.setEnabled(value);
       restaurantPhone.setEnabled(value);
        
    }

    private void display(HelpCenter restaurant) {
        System.out.println("Shivi");
        setVisibleEditable(false);
        restaurantName.setText(restaurant.getName());
        restaurantAddress.setText(restaurant.getAddress());
        restaurantPhone.setText(restaurant.getPhone());
        
    }

//    private void initListners() {
//        tblRestaurantInfo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//            public void valueChanged(ListSelectionEvent event) {
//                int selectedRow = tblRestaurantInfo.getSelectedRow();
//                if (selectedRow >= 0) {
//                    HelpCenter restaurant = (HelpCenter) tblRestaurantInfo.getValueAt(selectedRow, 0);
//                    if (restaurant != null) {
//                        display(restaurant);
//                    }
//                }
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField restaurantAddress;
    private javax.swing.JTextField restaurantName;
    private javax.swing.JTextField restaurantPhone;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    
}
