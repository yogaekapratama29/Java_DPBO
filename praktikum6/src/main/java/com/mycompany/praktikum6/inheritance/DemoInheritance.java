/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum6.inheritance;

/**
 *
 * @author macairm1
 */
public class DemoInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    A superclass = new A();
    B subclass = new B();
    System.out.println("Superclass : ");
    
    superclass.x = 3;
    superclass.y = 4;
    superclass.tampilXY();
    System.out.println("Subclass : ");
    
    // member superclass dapat diakses dari subclass nya
    subclass.x = 1;
    subclass.y = 2;
    subclass.tampilXY();
    
    // member tambahan hanya ada di subclass
    subclass.z = 5;
    subclass.jumlahXY();
    
    }
    
}
