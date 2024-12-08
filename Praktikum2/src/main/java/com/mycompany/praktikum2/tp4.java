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
public class tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Masukan Sampel Buah yang akan Diambil :");
       
       int n = input.nextInt();
       input.nextLine();
       
       int jumlahApel = 0;
       int jumlahJeruk = 0;
       int jumlahMangga = 0;
       
       System.out.println("Masukan Jenis Buah (apel, jeruk, mangga) : ");
       for(int i = 0; i < n; i++){
           String buah = input.nextLine().toLowerCase();
           
        if (buah.equals("apel")){
            jumlahApel++;
        }else if(buah.equals("jeruk")){
            jumlahJeruk++;
        }else if(buah.equals("mangga")){
            jumlahMangga++;
        }
       }
       System.out.println(jumlahApel + " " + jumlahJeruk + " " + jumlahMangga);
    }
    
}
