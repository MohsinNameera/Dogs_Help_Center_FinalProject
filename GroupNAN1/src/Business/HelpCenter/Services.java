/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpCenter;

/**
 *
 * @author shivibhatt
 */
public class Services {
    private String name;
    private double price;
   
    public Services(String name) {
        this.name = name;
        this.price = price;
        
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
