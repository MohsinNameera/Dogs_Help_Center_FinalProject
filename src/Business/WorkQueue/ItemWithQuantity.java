/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.HelpCenter.Services;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shivibhatt
 */
public class ItemWithQuantity {
    
    Services item;
    
    int quantilty;

    public ItemWithQuantity(Services item, int quantilty) {
        this.item = item;
        this.quantilty = quantilty;
    }

    public Services getItem() {
        return item;
    }

    public void setItem(Services item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantilty;
    }

    public void setQuantilty(int quantilty) {
        this.quantilty = quantilty;
    }
    
    public String toString(){
        if(item != null){
            return item.getName();
        }else{
          return "No Name";  
        } 
    }
   
}
