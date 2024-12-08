/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.igcns.mission.management;


/**
 *
 * @author macairm1
 */
public class Employee {
    
    private String id;
    private String name;
    private Department department;
    
   
    
    public Employee(String id, String name){
    this.id = id;
    this.name = name;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Department getDepartment(){
        return department;
    }
    
   public void setDepartment(Department newDepartment) {
        if (newDepartment.canAddEmployee()) {
           
            if (this.department != null) {
                this.department.deleteEmployee(this);  
            }
           
            newDepartment.addEmployee(this);
            this.department = newDepartment;  
        } else {
            System.out.println("Departemen " + newDepartment.getName() + " sudah penuh.");
        }
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
