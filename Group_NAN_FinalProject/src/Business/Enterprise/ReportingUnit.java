/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.PersonalAdmin;
import Business.Role.Role;
import java.util.ArrayList;


public class ReportingUnit extends Enterprise{

    public ReportingUnit(String name) {
        super(name, Enterprise.EnterpriseType.VoluntaryOperatingUnit);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new PersonalAdmin());
       return roles;
    }
    
}
