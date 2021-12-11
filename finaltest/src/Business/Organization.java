/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Reporter.ReporterDirectory;
import Business.RescueTeam.RescueTeamDirectory;
import Business.Employee.EmployeeDirectory;
import Business.HelpCenter.Menu;
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
    private ReporterDirectory ReporterDirectory;
    private RescueTeamDirectory RescueTeamDirectory;
    private HelpCenterDirectory HelpCenterDirectory;
    private Menu itemList;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        HelpCenter("HelpCenter"),
        Reporter("Reporter"),
        RescueTeam("RescueTeam"),
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
        ReporterDirectory = new ReporterDirectory();
        RescueTeamDirectory = new RescueTeamDirectory();
        HelpCenterDirectory = new HelpCenterDirectory();
        itemList = new Menu();
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

    public ReporterDirectory getReporterDirectory() {
        return ReporterDirectory;
    }

    public void setReporterDirectory(ReporterDirectory ReporterDirectory) {
        this.ReporterDirectory = ReporterDirectory;
    }

    public RescueTeamDirectory getRescueTeamDirectory() {
        return RescueTeamDirectory;
    }

    public void setRescueTeamDirectory(RescueTeamDirectory RescueTeamDirectory) {
        this.RescueTeamDirectory = RescueTeamDirectory;
    }

    public HelpCenterDirectory getHelpCenterDirectory() {
        return HelpCenterDirectory;
    }

    public void setHelpCenterDirectory(HelpCenterDirectory HelpCenterDirectory) {
        this.HelpCenterDirectory = HelpCenterDirectory;
    }

    public Menu getItemList() {
        return itemList;
    }

    public void setItemList(Menu itemList) {
        this.itemList = itemList;
    }
    
    
}
