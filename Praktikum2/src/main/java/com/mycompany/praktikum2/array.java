/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum2;

/**
 *
 * @author macairm1
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Array 1 Dimensi  
      
      int[] variableArray3 = {5,3,23,99,22};
      
      //Array 2 Dimensi
       int m [][];
       m = new int [4][4];
       m[0][0] = 1;
       m[1][1] = 3;
       m[2][2] = 5;
       m[3][3] = 7;
       m[1][2] = 8;
       
       
       System.out.println(m[0][0] + " " + m[0][1] + " " + m[0][2] + " " +m[0][3]);
       System.out.println(m[1][0] + " " + m[1][1] + " " + m[1][2]+ " " + m[1][3]);
       System.out.println(m[2][0] + " " + m[2][1] + " " + m[2][2]+ " " + m[2][3]);
       System.out.println(m[3][0] + " " + m[3][1] + " " + m[3][2]+ " " + m[3][3]);
    }
    
}
