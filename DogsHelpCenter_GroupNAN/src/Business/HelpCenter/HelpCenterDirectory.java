/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpCenter;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class HelpCenterDirectory {
    
    ArrayList<HelpCenter> restaurantList = new ArrayList<HelpCenter>();
    
    public void addRestaurant(HelpCenter restaurant){
        restaurantList.add(restaurant);
    }

    public ArrayList<HelpCenter> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<HelpCenter> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public void removeRestaurant(HelpCenter restaurant){
        restaurantList.remove(restaurant);
    }
}
