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


public abstract class WorkRequest {

    private String message;
    private Reporter Reporter;
    private HelpCenter HelpCenter;
    private RescueTeam RescueTeam;
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

    public Reporter getReporter() {
        return Reporter;
    }

    public void setReporter(Reporter Reporter) {
        this.Reporter = Reporter;
    }

    public HelpCenter getHelpCenter() {
        return HelpCenter;
    }

    public void setHelpCenter(HelpCenter HelpCenter) {
        this.HelpCenter = HelpCenter;
    }

    public RescueTeam getRescueTeam() {
        return RescueTeam;
    }

    public void setRescueTeam(RescueTeam RescueTeam) {
        this.RescueTeam = RescueTeam;
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
