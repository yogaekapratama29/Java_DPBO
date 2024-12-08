/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author macairm1
 */
public class DemoManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // buat array sepanjang 3 array
        Manusia arrMns[] = new Manusia[3];
       
        // 
        Manusia objMns1 = new Manusia(); 
        objMns1.setName("Markonah");
        objMns1.setUmur(76);
        
        Manusia objMns2 = new Manusia ("Mat Conan");
        Manusia objMns3 = new Manusia ("Bajuri", 13);
        
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;
        
        
        for (int i = 0; i < 3;i++){
            System.out.println("Nama : " + arrMns[i].getNama());
            System.out.println("Umur : " + arrMns[i].getUmur());
            System.out.println();
        }
        
    }
    
}
