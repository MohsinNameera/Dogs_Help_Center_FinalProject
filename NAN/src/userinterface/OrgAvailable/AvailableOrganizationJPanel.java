/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OrgAvailable;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodServicesOrganization;
import Business.Organization.VetOrganization;
import Business.Organization.Organization;
import Business.Organization.AdoptionOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.RescueUnitRequest;
import Business.WorkQueue.RescueAdminReportRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class AvailableOrganizationJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Organization recieverOrganization;
    WorkRequest workRequest;
    Enterprise enterprise;
    Network network;
    Network senderNetwork;
    EcoSystem business;
    private String orgType;


    public AvailableOrganizationJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, WorkRequest workRequest, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.workRequest = workRequest;
        this.enterprise = enterprise;
        this.network = network;
        this.senderNetwork = network;
        this.business = business;
        populateNetwork();
        this.orgType = "";
        
        nearestOrgTable.getTableHeader().setDefaultRenderer(new HeaderColors());
    }

    private void populateNetwork() {
        networkJComboBox.removeAllItems();

        for (Network network : business.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
        networkJComboBox.setSelectedItem(network);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        policeOrg = new javax.swing.JButton();
        fireOrg = new javax.swing.JButton();
        medicineOrg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nearestOrgTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        policeOrg.setBackground(new java.awt.Color(255, 255, 255));
        policeOrg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        policeOrg.setForeground(new java.awt.Color(25, 56, 82));
        policeOrg.setText("Adoption Organization");
        policeOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeOrgActionPerformed(evt);
            }
        });
        add(policeOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 200, -1));

        fireOrg.setBackground(new java.awt.Color(255, 255, 255));
        fireOrg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        fireOrg.setForeground(new java.awt.Color(25, 56, 82));
        fireOrg.setText("Food Services Organization");
        fireOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireOrgActionPerformed(evt);
            }
        });
        add(fireOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 240, -1));

        medicineOrg.setBackground(new java.awt.Color(255, 255, 255));
        medicineOrg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        medicineOrg.setForeground(new java.awt.Color(25, 56, 82));
        medicineOrg.setText("Veterinary Organization");
        medicineOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineOrgActionPerformed(evt);
            }
        });
        add(medicineOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 210, -1));

        nearestOrgTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nearestOrgTable.setForeground(new java.awt.Color(25, 56, 82));
        nearestOrgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Id", "Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nearestOrgTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(nearestOrgTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 730, 104));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 56, 82));
        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 133, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Select Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(25, 56, 82));
        jButton3.setText("Place Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("FIND NEAREST ORGANIZATION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fireOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireOrgActionPerformed
        // TODO add your handling code here:
        orgType = "Food Services";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        System.out.println("network1 ---===--->> " + network);
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("network2 ---===--->> " + network);
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("network3 ---===--->> " + network);
                if (org instanceof FoodServicesOrganization) {
                    recieverOrganization = org;
                    System.out.println("network4 ---===--->> " + network);
                  orgList.add(org);
                }
            }

        }

       
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Food Services Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
          
            model.addRow(row);
        }


    }//GEN-LAST:event_fireOrgActionPerformed

    private void policeOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeOrgActionPerformed
        // TODO add your handling code here:
        orgType = "Adoption Center";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof AdoptionOrganization) {
                    recieverOrganization = org;
                 orgList.add(org);
                  
                }
            }

        }
        
      
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Adoption Center Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
         
            model.addRow(row);
        }
    }//GEN-LAST:event_policeOrgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void medicineOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineOrgActionPerformed
        // TODO add your handling code here:
        orgType = "Veterinary Services";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof VetOrganization) {
                    recieverOrganization = org;
         
                    orgList.add(org);
                
                }
            }

        }
       
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Veterinary Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
         //   row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
    }//GEN-LAST:event_medicineOrgActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        this.network = (Network) networkJComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //int count = nearestOrgTable.getSelectedRowCount();
        int selectedRow = nearestOrgTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row!");
        } else {
            int orgId = (int) nearestOrgTable.getValueAt(selectedRow, 0);
            for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) { 
                if(wr instanceof RescueUnitRequest) {
                    if(((RescueUnitRequest)wr).getRecieverOrganization().getOrganizationID() ==  orgId && !((RescueUnitRequest)wr).getStatus().equals("Completed") && !((RescueUnitRequest)wr).getStatus().equals("Cancelled") && !((RescueUnitRequest)wr).getStatus().equals("Rejected")) {
                        JOptionPane.showMessageDialog(null, "Request to this organization is already sent!");
                        return;
                    }
                }
            }
            

            if (orgType.equalsIgnoreCase("Vet")) {
                String requirements = JOptionPane.showInputDialog(userProcessContainer, "Any Special Requirements");
                createWorkRequest(orgId, requirements);
            } else {
                createWorkRequest(orgId, null);
            }
            JOptionPane.showMessageDialog(null, "The request has been sent to the selected organization");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void createWorkRequest(int orgId,String requirements){
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org.getOrganizationID() == orgId) {
                        System.out.println(org);
                      
                        String msg = JOptionPane.showInputDialog("Additional Message");
                        RescueUnitRequest sceneReq = new RescueUnitRequest();
                        
                        sceneReq.setSceneName(((RescueAdminReportRequest) workRequest).getSceneName());
                        sceneReq.setSceneZipcode(((RescueAdminReportRequest) workRequest).getSceneZipcode());
                        sceneReq.setNoOfVictims(((RescueAdminReportRequest) workRequest).getNoOfVictims());
                        sceneReq.setEstimatedLoss(((RescueAdminReportRequest) workRequest).getEstimatedLoss());
                 
                        sceneReq.setStatus("Requested");
                       
                        sceneReq.setSender(account);
                        sceneReq.setRequestDate(new Date());
                        sceneReq.setSceneId(((RescueAdminReportRequest) workRequest).getSceneId());
                        if(requirements != null){
                            sceneReq.setRequirements(requirements);
                        }
                        sceneReq.setSceneManager(((RescueAdminReportRequest) workRequest).getSceneManager());
                        
                        sceneReq.setMessage(msg);
                        sceneReq.setSenderNetwork(senderNetwork);
                        sceneReq.setSenderOrganization(organization);
                        sceneReq.setRecieverOrganization(org);
                        sceneReq.setRecieverNetwork(network);
                        org.getWorkQueue().getWorkRequestList().add(sceneReq);
                        account.getWorkQueue().getWorkRequestList().add(sceneReq);
                    }
                }
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fireOrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton medicineOrg;
    private javax.swing.JTable nearestOrgTable;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton policeOrg;
    // End of variables declaration//GEN-END:variables
}
