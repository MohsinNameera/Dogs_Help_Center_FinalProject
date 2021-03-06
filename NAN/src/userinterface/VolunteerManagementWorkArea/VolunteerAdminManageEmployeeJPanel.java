/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerManagementWorkArea;

import Business.Employee.Employee;
import Business.Organization.RescueVerifyingOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class VolunteerAdminManageEmployeeJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    UserAccount account;
    Organization organization;

    public VolunteerAdminManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory,  UserAccount account, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.account = account;
        this.organization = organization;
        employeeJTable.getTableHeader().setDefaultRenderer(new HeaderColors());
        populateOrganizationComboBox();
        populateTable(organization);
        jButton2.setBackground(new Color(255,255,255));
        //populateEmployeeComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        organizationEmployeeJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        employeeNameTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationEmployeeJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationEmployeeJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        organizationEmployeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmployeeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmployeeJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmployeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 306, 233, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Oragnization Name ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 311, -1, -1));

        employeeJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        employeeJTable.setForeground(new java.awt.Color(25, 56, 82));
        employeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee Id", "Employee Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(employeeJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 480, 180));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 339, -1, -1));

        employeeNameTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        employeeNameTextField.setForeground(new java.awt.Color(25, 56, 82));
        add(employeeNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 339, 233, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(25, 56, 82));
        jButton2.setText("Add Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 376, 158, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("MANAGE VOLUNTEER UNIT EMPLOYEE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rescuemag.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!employeeNameTextField.getText().equals("")) {
            Organization organization = (Organization) organizationEmployeeJComboBox.getSelectedItem();
            String name = employeeNameTextField.getText();
            organization.getEmployeeDirectory().createEmployee(name);
            populateTable(organization);
            JOptionPane.showMessageDialog(null, "Employee created successfully");
            employeeNameTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void resetFields() {
        employeeNameTextField.setText("");
    }
    private void organizationEmployeeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmployeeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmployeeJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable employeeJTable;
    private javax.swing.JTextField employeeNameTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationEmployeeJComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateOrganizationComboBox() {
        organizationEmployeeJComboBox.removeAllItems();

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            if(organization instanceof RescueVerifyingOrganization) {
                organizationEmployeeJComboBox.addItem(organization);
            }
        }
    }


    private void populateTable(Organization organization) {
        employeeJTable.getTableHeader().setDefaultRenderer(new HeaderColors());
        DefaultTableModel model = (DefaultTableModel) employeeJTable.getModel();
        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }
}
