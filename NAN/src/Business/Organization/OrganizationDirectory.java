/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import static Business.Role.Role.RoleType.FireSafetyHead;
import java.util.ArrayList;

public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Type.IncidentReportingAgency.getValue())) {
            organization = new RescueTeamOrganization(name);
    
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PoliceHead.getValue())) {
            organization = new AdoptionOrganization(name);
            AdoptionOrganization police = (AdoptionOrganization) organization;
            police.setPolice(name);
          
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Type.Personal.getValue())) {
            organization = new ReporterPersonalOrganization(name);
            ReporterPersonalOrganization personal = (ReporterPersonalOrganization) organization;
            personal.setVolunteerPersonal(name);
           
            organizationList.add(organization);
        } 
else if (type.getValue().equals(Type.FireSafety.getValue())) {
            organization = new FoodServicesOrganization(name);
            FoodServicesOrganization fireSafety = (FoodServicesOrganization) organization;
            fireSafety.setFireSafety(name);
           
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DisasterManagementTeam.getValue())) {
            organization = new RescueVerifyingOrganization(name);
            RescueVerifyingOrganization disaster = (RescueVerifyingOrganization) organization;
            disaster.setDisasterName(name);
           
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Medicines.getValue())) {
            organization = new VetOrganization(name);
            VetOrganization medical = (VetOrganization) organization;
            medical.setMedicenes(name);
          
            organizationList.add(organization);
        } 

        return organization;
    }
}
