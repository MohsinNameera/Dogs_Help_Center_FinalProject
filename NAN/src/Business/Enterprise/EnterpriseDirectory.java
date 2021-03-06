/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;


public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
       
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if (type == Enterprise.EnterpriseType.EmergencyOperatingUnit) {
            enterprise = new HelpCenterUnit(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.IncidentOperatingUnit) {
            enterprise = new RescueManagementUnit(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.VoluntaryOperatingUnit) {
            enterprise = new ReportingUnit(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
