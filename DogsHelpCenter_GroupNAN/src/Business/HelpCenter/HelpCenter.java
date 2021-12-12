/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpCenter;

import Business.Role.HelpCenterRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class HelpCenter extends UserAccount{
    private String name;
    private String address;
    private String phone;
    private ServicesList servicesList;

    public HelpCenter(String userName, String password,String name, String address, String phone) {
        setUsername(userName);
        setPassword(password);
        setRole(new HelpCenterRole());
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.servicesList = new ServicesList();
    }

    public HelpCenter(){
    
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ServicesList getServicesList() {
        return servicesList;
    }

    public void setServicesList(ServicesList servicesList) {
        this.servicesList = servicesList;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
