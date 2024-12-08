/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author macairm1
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student student = new Student("Yoga","2311104023",90,90,100);
        
        student.printStudentInfo();
        
        student.changesStudentID("1234566");
        
        System.out.println("\n Setelah mengubah StudentID : ");
        student.printStudentInfo();
    }
    
}
