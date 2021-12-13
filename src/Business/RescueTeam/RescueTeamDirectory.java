/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RescueTeam;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RescueTeamDirectory {
   
    ArrayList<RescueTeam> deliveryManList = new ArrayList<RescueTeam>();

    public ArrayList<RescueTeam> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<RescueTeam> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    public void addDeliveryMan(RescueTeam deliveryMan){
        deliveryManList.add(deliveryMan);
    }
    public void removeDeliveryMan(RescueTeam deliveryMan){
        deliveryManList.remove(deliveryMan);
    }
    
}
