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
public class tp3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Angka Pertama : ");
        int angka1 = input.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        int angka2 = input.nextInt();
        System.out.println("Masukan Angka Ketiga : ");
        int angka3 = input.nextInt();
        
        int awal = 0, tengah = 0, akhir = 0;
        
        if(angka1 <= angka2 && angka1 <= angka3){
            awal = angka1;
        if(angka2 <= angka3){
            tengah = angka2;
            akhir = angka3;
        }else{
            tengah = angka3;
            akhir = angka2;
        }
        }
        
        if(angka2 <= angka1 && angka2 <= angka3){
            awal = angka2;
        if(angka1 <= angka3){
            tengah = angka1;
            akhir = angka3;
        }else{
            tengah = angka3;
            akhir = angka1;
        }
        }
        
        if(angka3 <= angka1 && angka3 <= angka2){
            awal = angka3;
        if(angka1 <= angka2){
            tengah = angka1;
            akhir = angka2;
        }else{
            tengah = angka2;
            akhir = angka1;
        }
        }
        System.out.println("Hasil Pengurutan :");
        System.out.println( awal + " " + tengah + " " + akhir );
    }    
}
