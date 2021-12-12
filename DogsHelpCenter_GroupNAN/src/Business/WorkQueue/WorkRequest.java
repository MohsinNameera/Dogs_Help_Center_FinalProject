/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Reporter.Reporter;
import Business.RescueTeam.RescueTeam;
import Business.HelpCenter.HelpCenter;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private Reporter customer;
    private HelpCenter restaurant;
    private RescueTeam deliverMan;
    private String status;
    private Date requestDate;
    private Date resolveDate;
  
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Reporter getCustomer() {
        return customer;
    }

    public void setCustomer(Reporter customer) {
        this.customer = customer;
    }

    public HelpCenter getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(HelpCenter restaurant) {
        this.restaurant = restaurant;
    }

    public RescueTeam getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(RescueTeam deliverMan) {
        this.deliverMan = deliverMan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public String toString(){
        return this.message;
    }
}
