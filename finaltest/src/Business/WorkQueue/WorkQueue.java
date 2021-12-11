/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

public class WorkQueue {
    
    private List<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public List<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public List<WorkRequest> getWorkRequestListReporter(UserAccount account){
        List<WorkRequest> workRequestListReporter = new ArrayList<>();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getReporter() != null){
                UserAccount ReporterAccount = workRequest.getReporter();
                if(ReporterAccount.getUsername().equals(account.getUsername())){
                    workRequestListReporter.add(workRequest);
                }
            }
        }
        return workRequestListReporter;
    }
    
    public List<WorkRequest> getWorkRequestListHelpCenter(UserAccount account){
        List<WorkRequest> workRequestListHelpCenter = new ArrayList<>();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getHelpCenter() != null){
                UserAccount HelpCenterAccount = workRequest.getHelpCenter();
                if(HelpCenterAccount.getUsername().equals(account.getUsername())){
                    workRequestListHelpCenter.add(workRequest);
                }
            }
        }
        return workRequestListHelpCenter;
    }
    
    public List<WorkRequest> getWorkRequestListRescueTeam(UserAccount account){
        List<WorkRequest> workRequestListRescueTeam = new ArrayList<>();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getRescueTeam()!= null){
                UserAccount RescueTeamAccount = workRequest.getRescueTeam();
                if(RescueTeamAccount.getUsername().equals(account.getUsername())){
                    workRequestListRescueTeam.add(workRequest);
                }
            }
        }
        return workRequestListRescueTeam;
    }
    
    public void addWorkRequest(WorkRequest workRequest){
       workRequestList.add(workRequest); 
    }
    
}