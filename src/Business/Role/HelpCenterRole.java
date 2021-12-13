/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HelpCenterAdminRole.HelpCenterAdminWorkAreaJPanel;


public class HelpCenterRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        return new HelpCenterAdminWorkAreaJPanel(userProcessContainer, account, ecosystem);
    }
 
}
