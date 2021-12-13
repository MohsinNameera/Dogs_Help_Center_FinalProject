/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.VoluntaryHead;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

public class RescueVerifyingOrganization extends Organization {
    private String name;

    public RescueVerifyingOrganization(String name) {
        super(name);
        this.name = name;
        disasterName = name;
       

    }

    private String disasterName;

    public String getDisasterName() {
        return disasterName;
    }

    public void setDisasterName(String disasterName) {
        this.disasterName = disasterName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VoluntaryHead());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Type getType() {
        return Organization.Type.DisasterManagementTeam;
    } 

}
