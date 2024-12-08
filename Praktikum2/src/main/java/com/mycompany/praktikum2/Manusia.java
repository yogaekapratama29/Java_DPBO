/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum2;

/**
 *
 * @author macairm1
 */
public class Manusia {

   private String nama;
   private int tinggi;
   
   void setInfo(String nama, int tinggi){
       this.nama = nama;
       this.tinggi = tinggi;
   }
   void info(){
       System.out.println(this.nama + " Memiliki Tinggi" + this.tinggi + "cm");
   }
}
