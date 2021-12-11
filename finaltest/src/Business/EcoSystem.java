/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Reporter.ReporterDirectory;
import Business.RescueTeam.RescueTeamDirectory;
import Business.HelpCenter.HelpCenterDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private HelpCenterDirectory HelpCenterDirectory;
    private ReporterDirectory ReporterDirectory;
    private RescueTeamDirectory RescueTeamDirectory;
    private WorkQueue workQueue;

    public EcoSystem(HelpCenterDirectory HelpCenterDirectory, ReporterDirectory ReporterDirectory, RescueTeamDirectory RescueTeamDirectory, WorkQueue workQueue) {
        this.HelpCenterDirectory = HelpCenterDirectory;
        this.ReporterDirectory = ReporterDirectory;
        this.RescueTeamDirectory = RescueTeamDirectory;
        this.workQueue = workQueue;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        //networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
