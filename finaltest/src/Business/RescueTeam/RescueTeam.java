/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RescueTeam;

import Business.Role.RescueTeamRole;
import Business.UserAccount.UserAccount;


public class RescueTeam extends UserAccount{
    private String name;
    private String phone;
 public RescueTeam(String userName, String password, String name,  String phone) {
        setUsername(userName);
        setPassword(password);
        setRole(new RescueTeamRole());
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        if(name == null){
            return "";
        }
        return this.name;
    }
    
}
