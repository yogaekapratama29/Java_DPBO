/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6.inheritance;

/**
 *
 * @author macairm1
 */
public class Employee {
    private String name;
    String departemen;
    public Employee (String s){
        name = s;
    }
    public void tampilNama(){
        System.out.println("nama : " + name);
    }
}
