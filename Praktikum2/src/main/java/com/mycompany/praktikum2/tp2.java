/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum2;
import java.util.Scanner;

/**
 *
 * @author macairm1
 */
public class tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Jumlah Mile : ");
        double mil = input.nextDouble();
        double km = 1.60934;
        double konversi = mil * km;
        
        System.out.println("Setara dengan : ");
        System.out.println( konversi + " Km ");
        
    }
    
}
