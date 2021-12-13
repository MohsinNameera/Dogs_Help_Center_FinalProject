/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodServicesAdmin;
import Business.Role.Role;
import java.util.ArrayList;

public class FoodServicesOrganization extends Organization{
    
    private String fireSafety;
    
    public FoodServicesOrganization(String name) {
        super(name);
        fireSafety = name;
       
    }

    public String getFireSafety() {
        return fireSafety;
    }

    public void setFireSafety(String fireSafety) {
        this.fireSafety = fireSafety;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodServicesAdmin());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.FireSafety;
    }  
}
