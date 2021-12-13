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
import Business.Adoption.AdoptionDirectory;
import Business.FoodServices.FoodServicesDirectory;
import Business.Vet.VetDirectory;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private HelpCenterDirectory restaurantDirectory;
    private ReporterDirectory customerDirectory;
    private RescueTeamDirectory deliveryManDirectory;
    private AdoptionDirectory adoptionDirectory;
    private VetDirectory vetDirectory;
    private FoodServicesDirectory foodServicesDirectory;
    private WorkQueue workQueue;

    public EcoSystem(HelpCenterDirectory restaurantDirectory, ReporterDirectory customerDirectory, RescueTeamDirectory deliveryManDirectory,AdoptionDirectory adoptionDirectory,FoodServicesDirectory foodServicesDirectory,VetDirectory vetDirectory, WorkQueue workQueue) {
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.adoptionDirectory = adoptionDirectory;
        this.foodServicesDirectory = foodServicesDirectory;
        this.vetDirectory = vetDirectory;
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
