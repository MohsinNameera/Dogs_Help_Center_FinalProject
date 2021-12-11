/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RescueTeam;

import java.util.ArrayList;


public class RescueTeamDirectory {
   
    ArrayList<RescueTeam> RescueTeamList = new ArrayList<RescueTeam>();

    public ArrayList<RescueTeam> getRescueTeamList() {
        return RescueTeamList;
    }

    public void setRescueTeamList(ArrayList<RescueTeam> RescueTeamList) {
        this.RescueTeamList = RescueTeamList;
    }
    
    public void addRescueTeam(RescueTeam RescueTeam){
        RescueTeamList.add(RescueTeam);
    }
    public void removeRescueTeam(RescueTeam RescueTeam){
        RescueTeamList.remove(RescueTeam);
    }
    
}
