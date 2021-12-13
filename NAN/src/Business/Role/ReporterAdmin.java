/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VerificationAdminWorkArea.VerificationAdminWorkAreaJPanel;


public class ReporterAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new VerificationAdminWorkAreaJPanel(userProcessContainer, enterprise, business, organization, network,account); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return (RoleType.ReportingAdmin.getValue());
    }
}
