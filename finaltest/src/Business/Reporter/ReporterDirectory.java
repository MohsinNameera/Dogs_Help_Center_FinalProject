/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reporter;

import java.util.ArrayList;


public class ReporterDirectory {
    ArrayList<Reporter> ReporterList = new ArrayList<Reporter>();

    public ArrayList<Reporter> getReporterList() {
        return ReporterList;
    }

    public void setReporterList(ArrayList<Reporter> ReporterList) {
        this.ReporterList = ReporterList;
    }
    public void addReporter(Reporter Reporter){
        ReporterList.add(Reporter);
    }
    public void removeReporter(Reporter Reporter){
        ReporterList.remove(Reporter);
    }
}
