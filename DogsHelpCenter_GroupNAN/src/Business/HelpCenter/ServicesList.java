/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpCenter;

import java.util.ArrayList;


public class ServicesList {
    ArrayList<Services> itemList = new ArrayList<Services>();

    public ArrayList<Services> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Services> itemList) {
        this.itemList = itemList;
    }
    
    public void addItem(Services item){
        itemList.add(item);
    }
    
    public void removeItem(Services item){
        itemList.remove(item);
    }
}
