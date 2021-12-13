/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HelpCenterAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Shivi
 */
public class HelpCenterAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    public HelpCenterAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        //this.set
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount = userAccount;
        manageOrders();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        manageOrdersButtonPanel = new javax.swing.JPanel();
        manageOrdersButtonLabel = new javax.swing.JLabel();
        manageMenuButtonPanel = new javax.swing.JPanel();
        manageMenuButtonLabel = new javax.swing.JLabel();
        manageInfoButtonPanel = new javax.swing.JPanel();
        manageInfoButtonLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(31, 50, 97));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrdersButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageOrdersButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersButtonPanelMousePressed(evt);
            }
        });

        manageOrdersButtonLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        manageOrdersButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageOrdersButtonLabel.setText("Manage Reports");
        manageOrdersButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrdersButtonLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrdersButtonPanelLayout = new javax.swing.GroupLayout(manageOrdersButtonPanel);
        manageOrdersButtonPanel.setLayout(manageOrdersButtonPanelLayout);
        manageOrdersButtonPanelLayout.setHorizontalGroup(
            manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersButtonPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(manageOrdersButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        manageOrdersButtonPanelLayout.setVerticalGroup(
            manageOrdersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageOrdersButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(manageOrdersButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 60));

        manageMenuButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageMenuButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        manageMenuButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageMenuButtonPanelMousePressed(evt);
            }
        });

        manageMenuButtonLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        manageMenuButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageMenuButtonLabel.setText("Manage Services");
        manageMenuButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageMenuButtonLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageMenuButtonPanelLayout = new javax.swing.GroupLayout(manageMenuButtonPanel);
        manageMenuButtonPanel.setLayout(manageMenuButtonPanelLayout);
        manageMenuButtonPanelLayout.setHorizontalGroup(
            manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMenuButtonPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(manageMenuButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        manageMenuButtonPanelLayout.setVerticalGroup(
            manageMenuButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMenuButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageMenuButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(manageMenuButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 280, 50));

        manageInfoButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageInfoButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageInfoButtonPanelMousePressed(evt);
            }
        });

        manageInfoButtonLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        manageInfoButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageInfoButtonLabel.setText("Manage Info");

        javax.swing.GroupLayout manageInfoButtonPanelLayout = new javax.swing.GroupLayout(manageInfoButtonPanel);
        manageInfoButtonPanel.setLayout(manageInfoButtonPanelLayout);
        manageInfoButtonPanelLayout.setHorizontalGroup(
            manageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageInfoButtonPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(manageInfoButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        manageInfoButtonPanelLayout.setVerticalGroup(
            manageInfoButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageInfoButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(manageInfoButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainLogoNAN1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 230));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(940, 808));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrdersButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersButtonLabelMousePressed
        manageOrders();
    }//GEN-LAST:event_manageOrdersButtonLabelMousePressed

    private void manageOrders() {
        // TODO add your handling code here:
        manageOrdersButtonPanel.setBackground(new Color(255,255,255));
        manageMenuButtonPanel.setBackground(new Color(255,204,0));
        manageInfoButtonPanel.setBackground(new Color(255,204,0));
        ManageOrderJPanel manageOrderJPanel = new ManageOrderJPanel(rightSystemAdminPanel,ecosystem,userAccount);
        rightSystemAdminPanel.add("ManageOrderJPanel",manageOrderJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageOrdersButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrdersButtonPanelMousePressed
        // TODO add your handling code here:
        manageOrders();
    }//GEN-LAST:event_manageOrdersButtonPanelMousePressed

    private void manageMenuButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMenuButtonLabelMousePressed
        manageMenu();
    }//GEN-LAST:event_manageMenuButtonLabelMousePressed

    private void manageMenu() {
        // TODO add your handling code here:
        manageMenuButtonPanel.setBackground(new Color(255,255,255));
        manageOrdersButtonPanel.setBackground(new Color(255,204,0));
        manageInfoButtonPanel.setBackground(new Color(255,204,0));
        ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(rightSystemAdminPanel,userAccount,ecosystem);
        rightSystemAdminPanel.add("ManageMenuJPanel",manageMenuJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageMenuButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMenuButtonPanelMousePressed
        // TODO add your handling code here:
        manageMenu();
    }//GEN-LAST:event_manageMenuButtonPanelMousePressed

    private void manageInfoButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageInfoButtonPanelMousePressed
        manageInfo();
    }//GEN-LAST:event_manageInfoButtonPanelMousePressed

    private void manageInfo() {
        // TODO add your handling code here:
        manageInfoButtonPanel.setBackground(new Color(255,255,255));
        manageOrdersButtonPanel.setBackground(new Color(255,204,0));
        manageMenuButtonPanel.setBackground(new Color(255,204,0));
        ManageHelpCenterInformationJPanel manageRestaurantInformationJPanel = new ManageHelpCenterInformationJPanel(rightSystemAdminPanel,ecosystem, userAccount);
        rightSystemAdminPanel.add("ManageRestaurantInformationJPanel",manageRestaurantInformationJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manageInfoButtonLabel;
    private javax.swing.JPanel manageInfoButtonPanel;
    private javax.swing.JLabel manageMenuButtonLabel;
    private javax.swing.JPanel manageMenuButtonPanel;
    private javax.swing.JLabel manageOrdersButtonLabel;
    private javax.swing.JPanel manageOrdersButtonPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}