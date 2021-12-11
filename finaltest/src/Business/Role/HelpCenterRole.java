/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HelpCenterRole.HelpCenterWorkAreaJPanel;


public class HelpCenterRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        return new HelpCenterWorkAreaJPanel(userProcessContainer, account, ecosystem);
    }
 
}
