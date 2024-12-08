/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igcns.mission.management;

/**
 *
 * @author macairm1
 */
public class Department {
    
    private String id;
    private String name;
    private int maxNum;
    private Employee[] employeeList;
    private int employeeCount; 
    
    
    public Department(String id, String name, int maxNum) {
        this.id = id;
        this.name = name;
        this.maxNum = maxNum;
        this.employeeList = new Employee[maxNum];  
        this.employeeCount = 0;  
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNum() {
        return maxNum;
    }


    public int getEmployeeCount() {
        return employeeCount;
    }


    public void printEmployeeList() {
        System.out.println("Department: " + name + " (Total Employees: " + employeeCount + ")");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println((i + 1) + ". " + employeeList[i]);
        }
    }


    public boolean canAddEmployee() {
        return employeeCount < maxNum;
    }

    public boolean addEmployee(Employee employee) {
        if (canAddEmployee()) {
            employeeList[employeeCount] = employee;
            employeeCount++;
            return true;
        } else {
            System.out.println("Departemen " + name + " sudah penuh.");
            return false;
        }
    }


    public boolean deleteEmployee(Employee employee) {
        for (int i = 0; i < employeeCount; i++) {
            if (employeeList[i].getId().equals(employee.getId())) {
                for (int j = i; j < employeeCount - 1; j++) {
                    employeeList[j] = employeeList[j + 1];
                }
                employeeList[employeeCount - 1] = null;  
                employeeCount--;
                return true;
            }
        }
        System.out.println("Karyawan tidak ditemukan di departemen " + name);
        return false;
    }
}
    
