/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpCenter;

import java.util.ArrayList;


public class HelpCenterDirectory {
    
    ArrayList<HelpCenter> HelpCenterList = new ArrayList<HelpCenter>();
    
    public void addHelpCenter(HelpCenter HelpCenter){
        HelpCenterList.add(HelpCenter);
    }

    public ArrayList<HelpCenter> getHelpCenterList() {
        return HelpCenterList;
    }

    public void setHelpCenterList(ArrayList<HelpCenter> HelpCenterList) {
        this.HelpCenterList = HelpCenterList;
    }
    
    public void removeHelpCenter(HelpCenter HelpCenter){
        HelpCenterList.remove(HelpCenter);
    }
}
