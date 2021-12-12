/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reporter;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class ReporterDirectory {
    ArrayList<Reporter> customerList = new ArrayList<Reporter>();

    public ArrayList<Reporter> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Reporter> customerList) {
        this.customerList = customerList;
    }
    public void addCustomer(Reporter customer){
        customerList.add(customer);
    }
    public void removeCustomer(Reporter customer){
        customerList.remove(customer);
    }
}
