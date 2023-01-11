/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage3;

/**
 *
 * @author My Asus
 */
public class ThanhVien {
    private String name, teamName;
    private int timesWorkCLB, timesWorkGroup;

    public ThanhVien() {
    }

    public ThanhVien(String name, String teamName, int timesWorkCLB, int timesWorkGroup) {
        this.name = name;
        this.teamName = teamName;
        this.timesWorkCLB = timesWorkCLB;
        this.timesWorkGroup = timesWorkGroup;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTimesWorkCLB() {
        return timesWorkCLB;
    }

    public void setTimesWorkCLB(int timesWorkCLB) {
        this.timesWorkCLB = timesWorkCLB;
    }

    public int getTimesWorkGroup() {
        return timesWorkGroup;
    }

    public void setTimesWorkGroup(int timesWorkGroup) {
        this.timesWorkGroup = timesWorkGroup;
    }

    @Override
    public String toString() {
        return name + " " + teamName + " tham gia sự kiện CLB: " + timesWorkCLB + " lần , tham gia sự kiện đoàn: "  + timesWorkGroup + " lần \n";
    }
    
    
    
}
