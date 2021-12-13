/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdoptionCenterHead;
import Business.Role.Role;

import java.util.ArrayList;


public class AdoptionOrganization extends Organization{
    
    private String police;
    
    public AdoptionOrganization(String name) {
        super(name);
        police = name;

    }

    public String getPolice() {
        return police;
    }

    public void setPolice(String police) {
        this.police = police;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdoptionCenterHead());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.PoliceHead;
    } 
    
}
