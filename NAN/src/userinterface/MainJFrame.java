/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.VoluntaryHead;
import Business.Role.HelpCenterAdmin;
import Business.Role.FoodServicesAdmin;
import Business.Role.RescueTeamManager;
import Business.Role.VetSupervisor;
import Business.Role.PersonalAdmin;
import Business.Role.AdoptionCenterHead;
import Business.Role.ReporterAdmin;
import Business.Role.VoluntaryMember;
import Business.Role.UnitReportingAdmin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import userinterface.UserRegistration.UserRegistrationJPanel;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    Enterprise inEnterprise;
    Organization inOrganization;
    Network networkEmergency;


    public MainJFrame() {
        this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    }

    private void changePanel1() {

        if (userAccount != null && userAccount.getRole() != null) {
            String greetings = "Welcome";
            if (userAccount.getRole() instanceof VoluntaryHead) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system));
            } else if (userAccount.getRole() instanceof HelpCenterAdmin) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system));
            } else if (userAccount.getRole() instanceof FoodServicesAdmin) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system));
            }
            else if (userAccount.getRole() instanceof RescueTeamManager) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system)); 
            }else if (userAccount.getRole() instanceof VetSupervisor) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system)); 
            }
            else if (userAccount.getRole() instanceof PersonalAdmin) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system)); 
            }else if (userAccount.getRole() instanceof AdoptionCenterHead) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system)); 
            }else if (userAccount.getRole() instanceof ReporterAdmin) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system)); 
            }else if (userAccount.getRole() instanceof VoluntaryMember) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system)); 
            }else if (userAccount.getRole() instanceof UnitReportingAdmin) {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system)); 
            }else {
                greetings = greetings + " " + userAccount.getUsername();
                container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, networkEmergency, system));
            }
            greetingUserLabel.setText(greetings + " !");
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        btnLogoutLabel = new javax.swing.JLabel();
        greetingUserLabel = new javax.swing.JLabel();
        btnBackLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 23, 1338, 900));
        setMinimumSize(new java.awt.Dimension(1338, 1000));
        setPreferredSize(new java.awt.Dimension(1338, 900));
        setSize(new java.awt.Dimension(1338, 840));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(255, 255, 204));
        leftPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        leftPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-shutdown-30.png"))); // NOI18N
        btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMousePressed(evt);
            }
        });
        leftPanel.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 70, 60));

        greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        leftPanel.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 60));

        btnBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackLabelMousePressed(evt);
            }
        });
        leftPanel.add(btnBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 60, 60));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setForeground(new java.awt.Color(255, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(1338, 1300));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1338, 1048));

        loginJPanel.setBackground(new java.awt.Color(255, 255, 204));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 1300));
        loginJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(554, 1300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainLogoNAN1_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d1.gif"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        loginJPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1250));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(302, 34));

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lk1_1.gif"))); // NOI18N

        userNameJTextField.setBackground(new java.awt.Color(255, 204, 0));
        userNameJTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        userNameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        userNameJTextField.setToolTipText("");
        userNameJTextField.setBorder(null);
        userNameJTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        userNameJTextField.setDisabledTextColor(new java.awt.Color(16, 10, 55));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        loginJPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 374, 304, 37));

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(236, 113, 107)));
        jPanel4.setPreferredSize(new java.awt.Dimension(302, 34));

        jLabel4.setBackground(new java.awt.Color(25, 56, 82));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/k13.png"))); // NOI18N

        passwordField.setBackground(new java.awt.Color(255, 204, 0));
        passwordField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(passwordField)
        );

        loginJPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 436, 304, -1));

        loginButton.setBackground(new java.awt.Color(236, 113, 107));
        loginButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(236, 113, 107));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(236, 113, 107)));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });
        loginJPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 498, 304, 33));

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });
        loginJPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 6, -1, 35));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main3_1.png"))); // NOI18N
        loginJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 213, 161, 143));

        btnRegister.setBackground(new java.awt.Color(236, 113, 107));
        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(236, 113, 107));
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(236, 113, 107)));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });
        loginJPanel.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 559, 304, 33));

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMousePressed
        logout();
    }//GEN-LAST:event_btnLogoutLabelMousePressed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        inEnterprise = null;
        inOrganization = null;
        networkEmergency = null;

        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                System.out.println("Network name --->> " + network.getName());
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    System.out.println("Enterprise name --->> " + enterprise.getName());
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    networkEmergency = network;
                    if (userAccount == null) {
                        //Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                networkEmergency = network;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
              
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            btnLogoutLabel.setVisible(true);
            btnBackLabel.setVisible(false);
            userNameJTextField.setText("");
            passwordField.setText("");
            changePanel1();
        }

    }//GEN-LAST:event_loginButtonMousePressed

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelButtonMousePressed

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        // TODO add your handling code here:

     // TODO add your handling code here:
        UserRegistrationJPanel panel = new UserRegistrationJPanel(container, system);
        greetingUserLabel.setText( "WELCOME NEW REPORTER REGISTRATION PAGE");
        
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            btnLogoutLabel.setVisible(false);
            btnBackLabel.setVisible(true);
            userNameJTextField.setText("");
            passwordField.setText("");
      
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
            
    }//GEN-LAST:event_btnRegisterMousePressed

    private void btnBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLabelMousePressed
        // TODO add your handling code here:
      logout();
    }//GEN-LAST:event_btnBackLabelMousePressed

    private void logout() {
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBackLabel;
    private javax.swing.JLabel btnLogoutLabel;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel greetingUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

}
