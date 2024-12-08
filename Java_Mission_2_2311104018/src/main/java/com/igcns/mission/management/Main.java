/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.igcns.mission.management;

/**
 *
 * @author macairm1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nameList = {"Skye Heredia", "Lucille Waltz", "Nichol Sutphin", "Vernia Caraway", 
                            "Rita Rangel", "Waldo Ontiveros", "Milton Grantham", "Loura Swilley", 
                            "Lola Duropan", "Kandis Mcnary", "Milford Kirts", "Denita Taniguchi", 
                            "Talia Fenderson", "Truman Daoust", "Alfonso Chaloux", "Fernanda Overby", 
                            "Cristy Yearby", "Daniell Pabst", "Bradley Newson", "Renda Maffei"};

        Employee[] employees = new Employee[nameList.length];

        Department technicalTeam = new Department("D001", "Tim Teknis", 20);
        Department hrTeam = new Department("D002", "Tim SDM", 8);
        Department securityTeam = new Department("D003", "Tim Keamanan", 4);

        for (int i = 0; i < nameList.length; i++) {
            String id = String.format("EMP%02d", i + 1);
            employees[i] = new Employee(id, nameList[i]);
            employees[i].setDepartment(technicalTeam);  
        }

        System.out.println("Status Penetapan Awal:");
        technicalTeam.printEmployeeList();
        hrTeam.printEmployeeList();
        securityTeam.printEmployeeList();

        for (int i = 0; i < employees.length; i++) {
            if ((i + 1) % 5 == 0) {
                employees[i].setDepartment(securityTeam);  
            } else if ((i + 1) % 2 == 0) {
                employees[i].setDepartment(hrTeam);  
            }
        }

        System.out.println("\nStatus Setelah Transfer:");
        technicalTeam.printEmployeeList();
        hrTeam.printEmployeeList();
        securityTeam.printEmployeeList();
       
    }
}
    
