/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author My Asus
 */
public class Main {
    public static int checkExist(List <ThanhVien> ds, String name, String teamName){
        for (int i = 0; i < ds.size(); i++) {
            if(name.equals(ds.get(i).getName()) && teamName.equals(ds.get(i).getTeamName())){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fin = new FileInputStream("D:\\textin.txt");
        Scanner sc = new Scanner(fin);
        String name, teamName, workFor;
        List <ThanhVien> ds = new ArrayList<>();
        while (sc.hasNext()) {
            name = sc.nextLine();
            teamName = sc.nextLine();
            workFor = sc.nextLine();
            int existIndex = checkExist(ds, name, teamName);
            if(existIndex == -1){
                if(workFor.equals("CLB")){
                    ds.add(new ThanhVien(name,teamName, 1, 0));
                }
                if(workFor.equals("Đoàn")){
                    ds.add(new ThanhVien(name,teamName, 0, 1));
                }
            }
            else{
                if(workFor.equals("CLB")){
                    ds.get(existIndex).setTimesWorkCLB(ds.get(existIndex).getTimesWorkCLB() + 1);
                }
                if(workFor.equals("Đoàn")){
                    ds.get(existIndex).setTimesWorkGroup(ds.get(existIndex).getTimesWorkGroup() + 1);
                }
            }
        }
        ds.sort((o1, o2) -> {
            int allTime1 = o1.getTimesWorkCLB() + o1. getTimesWorkGroup();
            int allTime2 = o2.getTimesWorkCLB() + o2. getTimesWorkGroup();
            return allTime2 - allTime1;
        });
        
        FileOutputStream fout = new FileOutputStream("D:\\textout.txt");
        for (ThanhVien d : ds) {
            byte b[] = d.toString().getBytes();
            fout.write(b);
        }
        System.out.println("Done!");
    }
    
}
