/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerManagementWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.RescueVerifyingOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.VoluntaryMember;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class VolunteerAdminManageUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerAdminManageUserJPanel
     */
    JPanel container;
    Enterprise enterprise;
    EcoSystem system;
    
    public VolunteerAdminManageUserJPanel(JPanel container, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.system = system;
         userJTable.getTableHeader().setDefaultRenderer(new HeaderColors());
        populateOrganizationComboBox();
        populateTable();
        jButton2.setBackground(new Color(255,255,255));
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
        userJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        organizationComboBox1 = new javax.swing.JComboBox();
        employeeComboBox2 = new javax.swing.JComboBox();
        roleComboBox3 = new javax.swing.JComboBox();
        username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        passwordText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        userJTable.setForeground(new java.awt.Color(25, 56, 82));
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username ", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 550, 120));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 122, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Employee");
        jLabel2.setPreferredSize(new java.awt.Dimension(81, 16));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 92, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Role");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 60, 20));

        Username.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Username.setForeground(new java.awt.Color(25, 56, 82));
        Username.setText("Username");
        add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 56, 82));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 70, 20));

        organizationComboBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationComboBox1.setForeground(new java.awt.Color(25, 56, 82));
        organizationComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBox1ActionPerformed(evt);
            }
        });
        add(organizationComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 189, -1));

        employeeComboBox2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        employeeComboBox2.setForeground(new java.awt.Color(25, 56, 82));
        employeeComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeComboBox2ActionPerformed(evt);
            }
        });
        add(employeeComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 189, -1));

        roleComboBox3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        roleComboBox3.setForeground(new java.awt.Color(25, 56, 82));
        roleComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 189, -1));

        username.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(25, 56, 82));
        add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 189, -1));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(25, 56, 82));
        jButton2.setText("Add User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 469, -1, 30));

        passwordText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        passwordText.setForeground(new java.awt.Color(25, 56, 82));
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 189, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE VOLUNTEER UNIT USERS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 540, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String userName = username.getText();
        String password = passwordText.getText();
        if("".equals(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter username");
        }else if(!system.checkIfUserIsUnique(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter unique username");
        }else if("".equals(password)) {
            JOptionPane.showMessageDialog(null, "Please enter password");
        }else {
            Organization organization = (Organization) organizationComboBox1.getSelectedItem();
            Employee employee = (Employee) employeeComboBox2.getSelectedItem();
            Role.RoleType role = (Role.RoleType) roleComboBox3.getSelectedItem();
            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, new VoluntaryMember());
            populateTable();
            JOptionPane.showMessageDialog(null, "User is created successfully");
            username.setText("");
            passwordText.setText("");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void resetFields() {
        username.setText("");
        passwordText.setText("");
    }
    private void organizationComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBox1ActionPerformed
        // TODO add your handling code here:
         Organization organization = (Organization) organizationComboBox1.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_organizationComboBox1ActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void employeeComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Username;
    private javax.swing.JComboBox employeeComboBox2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationComboBox1;
    private javax.swing.JTextField passwordText;
    private javax.swing.JComboBox roleComboBox3;
    private javax.swing.JTable userJTable;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void populateOrganizationComboBox() {
        organizationComboBox1.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof RescueVerifyingOrganization) {
                organizationComboBox1.addItem(organization);
            }
        }
    }

    private void populateTable() {
        userJTable.getTableHeader().setDefaultRenderer(new HeaderColors());
        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof RescueVerifyingOrganization){
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                    Object row[] = new Object[2];
                    row[0] = ua;
                    row[1] = ua.getRole();
                    ((DefaultTableModel) userJTable.getModel()).addRow(row);
                }
            }
        }
    }

    private void populateEmployeeComboBox(Organization organization) {
        employeeComboBox2.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeComboBox2.addItem(employee);
        }
    }

    private void populateRoleComboBox(Enterprise e) {
        roleComboBox3.removeAllItems();
 
            roleComboBox3.addItem(Role.RoleType.SceneManager);
        
    }
    
}
