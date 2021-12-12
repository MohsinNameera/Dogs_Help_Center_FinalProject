/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Reporter.ReporterDirectory;
import Business.RescueTeam.RescueTeamDirectory;
import Business.Employee.EmployeeDirectory;
import Business.HelpCenter.ServicesList;
import Business.HelpCenter.HelpCenterDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ReporterDirectory customerDirectory;
    private RescueTeamDirectory deliveryManDirectory;
    private HelpCenterDirectory restaurantDirectory;
    private ServicesList itemList;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerDirectory = new ReporterDirectory();
        deliveryManDirectory = new RescueTeamDirectory();
        restaurantDirectory = new HelpCenterDirectory();
        itemList = new ServicesList();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public ReporterDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ReporterDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public RescueTeamDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(RescueTeamDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public HelpCenterDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(HelpCenterDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public ServicesList getItemList() {
        return itemList;
    }

    public void setItemList(ServicesList itemList) {
        this.itemList = itemList;
    }
    
    
}
