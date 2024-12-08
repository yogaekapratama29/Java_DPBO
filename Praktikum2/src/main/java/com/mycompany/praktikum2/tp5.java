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
public class tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] bilangan = new int[11];
        
        System.out.println("Masukan 11 bilangan bulat : ");
        for(int i = 0;i < 11;i++){
            System.out.println("Masukan bilangan ke - " + (i + 1) + " : ");
            bilangan[i] = input.nextInt();
        }
        
        int bilanganTerakhir = bilangan [10];
        
        for (int i = 0; i < 10; i++){
            if(bilangan[i] < bilanganTerakhir){
                System.out.println(bilangan[i] + " Lebih Kecil dari " + bilanganTerakhir);
            }else if (bilangan[i] > bilanganTerakhir){
                System.out.println(bilangan[i] + " Lebih Besar dari  " + bilanganTerakhir);
            }else{
                System.out.println(bilangan[i] + " Sama Dengan " + bilanganTerakhir);
            }
            
        }
    }
    
}
