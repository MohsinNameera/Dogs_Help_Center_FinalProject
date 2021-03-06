/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRegistration;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReporterPersonalOrganization;
import Business.WorkQueue.UserRegistrationRequest;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Utils.Validation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class UserRegistrationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
  
    private Validation validation;
    private ActionListener eventListener;
    private boolean emailValid;
    private boolean contactValid;
    private boolean userUnique;
    /**
     * Creates new form UserRegistrationJPanel
     */
    public UserRegistrationJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetworkComboBox();
        validation = new Validation();
        usernameExistsMessage.setVisible(false);
        emailValidateMessage.setVisible(false);
        emailSuccessLabel.setVisible(false);
        userNameSuccessLabel.setVisible(false);
        populateOrgTypes();

    }

    public void populateNetworkComboBox() {
        stateCombo.removeAllItems();
        for (Network network : system.getNetworkList()) {
            stateCombo.addItem(network);
        }
    }

    public void populateOrgTypes() {
        orgCombo.addItem(Organization.Type.Personal);
      
    }

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
        userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        uPass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        uCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        uContact = new javax.swing.JTextField();
        stateCombo = new javax.swing.JComboBox();
        orgCombo = new javax.swing.JComboBox();
        btnRegister = new javax.swing.JButton();
        usernameExistsMessage = new javax.swing.JLabel();
        emailValidateMessage = new javax.swing.JLabel();
        emailSuccessLabel = new javax.swing.JLabel();
        userNameSuccessLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1338, 900));
        setPreferredSize(new java.awt.Dimension(1338, 900));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTER REGISTRATION PAGE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        userName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        userName.setForeground(new java.awt.Color(25, 56, 82));
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameKeyTyped(evt);
            }
        });
        add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 250, 35));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Username");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        uName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        uName.setForeground(new java.awt.Color(25, 56, 82));
        uName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uNameKeyTyped(evt);
            }
        });
        add(uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 250, 35));

        uPass.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        uPass.setForeground(new java.awt.Color(25, 56, 82));
        uPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uPassKeyTyped(evt);
            }
        });
        add(uPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 253, 35));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 62, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 56, 82));
        jLabel5.setText("Email Id");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 20));

        uEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        uEmail.setForeground(new java.awt.Color(25, 56, 82));
        uEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(uEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 250, 35));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setText("State");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, 20));

        uCity.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        uCity.setForeground(new java.awt.Color(25, 56, 82));
        uCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uCityKeyTyped(evt);
            }
        });
        add(uCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 250, 35));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("City");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 56, 82));
        jLabel8.setText("Organization");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 56, 82));
        jLabel9.setText("Phone Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, 30));

        uContact.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        uContact.setForeground(new java.awt.Color(25, 56, 82));
        uContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uContactActionPerformed(evt);
            }
        });
        uContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uContactKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uContactKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uContactKeyReleased(evt);
            }
        });
        add(uContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 250, 35));

        stateCombo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stateCombo.setForeground(new java.awt.Color(25, 56, 82));
        stateCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stateComboItemStateChanged(evt);
            }
        });
        stateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboActionPerformed(evt);
            }
        });
        add(stateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 250, 35));

        orgCombo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        orgCombo.setForeground(new java.awt.Color(25, 56, 82));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });
        orgCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orgComboKeyTyped(evt);
            }
        });
        add(orgCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 250, 35));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(25, 56, 82));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, -1, -1));

        usernameExistsMessage.setForeground(new java.awt.Color(255, 0, 0));
        usernameExistsMessage.setText("Username already exists");
        add(usernameExistsMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        emailValidateMessage.setForeground(new java.awt.Color(255, 0, 0));
        emailValidateMessage.setText("Email format incorrect");
        add(emailValidateMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        emailSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick1.4.gif"))); // NOI18N
        add(emailSuccessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        userNameSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick1.4.gif"))); // NOI18N
        add(userNameSuccessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stray1.gif"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void stateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboActionPerformed
        
    }//GEN-LAST:event_stateComboActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Network network = (Network) stateCombo.getSelectedItem();
        Organization.Type type = (Organization.Type) orgCombo.getSelectedItem();

        if (network == null) {
            stateCombo.setBorder(BorderFactory.createLineBorder(Color.RED));
            stateCombo.setForeground(Color.red);

        }
        if (uName.getText().isEmpty()) {
            uName.setBorder(BorderFactory.createLineBorder(Color.RED));
            uName.setForeground(Color.red);

        }
        if (userName.getText().isEmpty()) {
            userName.setBorder(BorderFactory.createLineBorder(Color.RED));
            userName.setForeground(Color.red);

        }
        if (uPass.getText().isEmpty()) {
            uPass.setBorder(BorderFactory.createLineBorder(Color.RED));
            uPass.setForeground(Color.red);

        }
        if (uEmail.getText().isEmpty()) {
            uEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            uEmail.setForeground(Color.red);

        }
        if (uCity.getText().isEmpty()) {
            uCity.setBorder(BorderFactory.createLineBorder(Color.RED));
            uCity.setForeground(Color.red);

        }
        if (type == null) {
            orgCombo.setBorder(BorderFactory.createLineBorder(Color.RED));
            orgCombo.setForeground(Color.red);

        }
        if (uContact.getText().isEmpty()) {
            uContact.setBorder(BorderFactory.createLineBorder(Color.RED));
            uContact.setForeground(Color.red);

        }
  
        if (userName.getText().isEmpty()
                || uPass.getText().isEmpty()
                || uEmail.getText().isEmpty()
                || uCity.getText().isEmpty()
                || type == null
                || uContact.getText().isEmpty())
               
        {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } else if(!contactValidity(uContact.getText())){
            JOptionPane.showMessageDialog(null, "Phone format incorrect");
        } 
        else if (emailValid && userUnique) {
            UserRegistrationRequest registrationRequest = new UserRegistrationRequest();
            registrationRequest.setName(userName.getText());
            registrationRequest.setUserName(uName.getText());
            registrationRequest.setUserPassword(uPass.getText());
            registrationRequest.setUserEmailId(uEmail.getText());
            registrationRequest.setNetwork(network);
            registrationRequest.setUserCity(uCity.getText());
            registrationRequest.setOrgType(type);
            registrationRequest.setStatus("Requested");
            registrationRequest.setUserContact(uContact.getText());
        
            String contact = "";

            for (Network network1 : system.getNetworkList()) {
                for (Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.VoluntaryOperatingUnit) {
                        if (enterprise.getWorkQueue() == null) {
                            enterprise.setWorkQueue(new WorkQueue());
                        }
                        enterprise.getWorkQueue().getWorkRequestList().add(registrationRequest);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "You have been registered succesfully!");
            uName.setText("");
            userName.setText("");
            uPass.setText("");
            uEmail.setText("");
            uCity.setText("");
            uContact.setText("");
          //  uLocation.setText("");
        } else if (!emailValid || !contactValid || !userUnique) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameKeyPressed

    private void userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyTyped
        // TODO add your handling code here:
        userName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        userName.setForeground(Color.BLACK);
    }//GEN-LAST:event_userNameKeyTyped

    private void uNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameKeyTyped

    private void uPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uPassKeyTyped
        // TODO add your handling code here:
        uPass.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        uPass.setForeground(Color.BLACK);
    }//GEN-LAST:event_uPassKeyTyped

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
        if (!validation.emailValidator(uEmail.getText())) {
            emailValidateMessage.setVisible(true);
            emailValid = false;
        } else {
            uEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            uEmail.setForeground(Color.BLACK);
            emailValidateMessage.setVisible(false);
            emailSuccessLabel.setVisible(true);
            emailValid = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    emailSuccessLabel.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_uEmailKeyTyped

    private void stateComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stateComboItemStateChanged
        // TODO add your handling code here:
        stateCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        stateCombo.setForeground(Color.BLACK);
    }//GEN-LAST:event_stateComboItemStateChanged

    private void uCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uCityKeyTyped
        // TODO add your handling code here:
        uCity.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        uCity.setForeground(Color.BLACK);
    }//GEN-LAST:event_uCityKeyTyped

    private void orgComboKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orgComboKeyTyped
        // TODO add your handling code here:
        orgCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        orgCombo.setForeground(Color.BLACK);
    }//GEN-LAST:event_orgComboKeyTyped

    private void uContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uContactKeyTyped
        // TODO add your handling code here:          
    }//GEN-LAST:event_uContactKeyTyped

    private void uNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uNameKeyReleased
        // TODO add your handling code here:
        if (!system.checkIfUserIsUnique(uName.getText())) {
            usernameExistsMessage.setVisible(true);
            userNameSuccessLabel.setVisible(false);
            userUnique = false;
        } else {
            uName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            uName.setForeground(Color.BLACK);
            usernameExistsMessage.setVisible(false);
            userNameSuccessLabel.setVisible(true);
            userUnique = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    userNameSuccessLabel.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_uNameKeyReleased


    private void uContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uContactKeyPressed
        // TODO add your handling code here:         
    }//GEN-LAST:event_uContactKeyPressed

    private void uContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uContactKeyReleased
     
    }//GEN-LAST:event_uContactKeyReleased

    private void uContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uContactActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgComboActionPerformed



    public Boolean contactValidity(String custContact) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(custContact);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel emailSuccessLabel;
    private javax.swing.JLabel emailValidateMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox orgCombo;
    private javax.swing.JComboBox stateCombo;
    private javax.swing.JTextField uCity;
    private javax.swing.JTextField uContact;
    private javax.swing.JTextField uEmail;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uPass;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNameSuccessLabel;
    private javax.swing.JLabel usernameExistsMessage;
    // End of variables declaration//GEN-END:variables
}
