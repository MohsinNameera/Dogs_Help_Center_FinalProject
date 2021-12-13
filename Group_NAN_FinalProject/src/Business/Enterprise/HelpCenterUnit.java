/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.FoodServicesAdmin;
import Business.Role.AdoptionCenterHead;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;


public class HelpCenterUnit extends Enterprise{

    public HelpCenterUnit(String name) {
        super(name, Enterprise.EnterpriseType.EmergencyOperatingUnit);
    }

    @Override
    
         public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FoodServicesAdmin());
        roles.add(new AdoptionCenterHead());
        return roles;
    }
    
}
