/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.RescueTeam.RescueTeam;
import Business.RescueTeam.RescueTeamDirectory;
import Business.EcoSystem;
import Business.HelpCenter.HelpCenter;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class RescueTeamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RescueTeamJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;
    public RescueTeamJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeliveryMan = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        createName = new javax.swing.JTextField();
        createPassword = new javax.swing.JTextField();
        createUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        createPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblDeliveryMan.setForeground(new java.awt.Color(56, 90, 174));
        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PHONE", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryMan.setGridColor(new java.awt.Color(56, 90, 174));
        tblDeliveryMan.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblDeliveryMan.setSelectionBackground(new java.awt.Color(240, 178, 62));
        jScrollPane1.setViewportView(tblDeliveryMan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 440, 165));

        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel4.setText("Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        btnDeliveryMan.setText("Create");
        btnDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryManActionPerformed(evt);
            }
        });
        add(btnDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 82, -1));

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 73, -1));
        add(createName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 246, -1));
        add(createPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 246, -1));

        createUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserNameActionPerformed(evt);
            }
        });
        add(createUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 246, -1));

        jLabel5.setText("Phone");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        add(createPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 246, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rescueteam_1.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, -10, -1, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryManActionPerformed
        // TODO add your handling code here:

        if( createUserName.getText().isEmpty()||createPassword.getText().isEmpty()|| createName.getText().isEmpty() ||  createPhone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(createUserName.getText())){
            RescueTeam RescueTeam = new RescueTeam(createUserName.getText(), createPassword.getText(), createName.getText(),  createPhone.getText());
            ecosystem.getUserAccountDirectory().addUserAccount(RescueTeam);
            ecosystem.getRescueTeamDirectory().addRescueTeam(RescueTeam);
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Username " + createUserName.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_btnDeliveryManActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        System.out.println("Update");

        int selectedRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow >= 0) {
            System.out.println("xyz" + selectedRow);
            System.out.println("2");
            RescueTeam RescueTeam = (RescueTeam) tblDeliveryMan.getValueAt(selectedRow, 0);
            System.out.println("item : " + RescueTeam);
            RescueTeam.setUsername(createUserName.getText());
            RescueTeam.setPassword(createPassword.getText());
            RescueTeam.setName(createName.getText());
            RescueTeam.setPhone(createPhone.getText());
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow >= 0) {
            RescueTeam RescueTeam = (RescueTeam) tblDeliveryMan.getValueAt(selectedRow, 0);
            RescueTeamDirectory RescueTeamDirectory = ecosystem.getRescueTeamDirectory();
            RescueTeamDirectory.removeRescueTeam(RescueTeam);
            JOptionPane.showMessageDialog(null, "Delivert Man  "  + createUserName.getText() + " deleted");
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createName.setText("");
            createPhone.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void createUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createUserNameActionPerformed
    private void populateTable() {
        RescueTeamDirectory RescueTeamDirectory = ecosystem.getRescueTeamDirectory();
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();

        model.setRowCount(0);
        for (RescueTeam RescueTeam : RescueTeamDirectory.getRescueTeamList()) {
                    Object[] row = new Object[4];
                    row[0] = RescueTeam;
                    row[1] = RescueTeam.getPhone();       
                    row[2] = RescueTeam.getUsername();
                    row[3] = RescueTeam.getPassword();
                    model.addRow(row);
                
            }
        
    }
    
      private void initListners() {
       tblDeliveryMan.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblDeliveryMan.getSelectedRow();
             if (selectedRow >= 0) {
                  RescueTeam  RescueTeam  = (RescueTeam) tblDeliveryMan.getValueAt(selectedRow, 0);
                 if(RescueTeam!=null){
                     display(RescueTeam);
                 }
             }
        }
    });
    }

    private void display(RescueTeam RescueTeam) {
        System.out.println("display");
        createUserName.setText(RescueTeam.getUsername());
        createPassword.setText(RescueTeam.getPassword());
        createName.setText(RescueTeam.getName());
        createPhone.setText(RescueTeam.getPhone());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeliveryMan;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField createName;
    private javax.swing.JTextField createPassword;
    private javax.swing.JTextField createPhone;
    private javax.swing.JTextField createUserName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryMan;
    // End of variables declaration//GEN-END:variables
}
