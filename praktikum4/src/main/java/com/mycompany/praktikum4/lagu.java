/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author macairm1
 */
 
public class lagu {
        String pencipta;
        String judul;
    

    void isiParam(String param1){
    judul = param1;
    pencipta = "Tidak dikenal";
    
    }
    
    void isiParam(String param1,String param2){
     judul = param1;
     pencipta = param2;
    
    }
    
    void cetakKeLayar(){
        System.out.println("Judul : " + judul + ", pencipta : " + pencipta);
    }
}

class DemoOver2{
    public static void main(String[] args){
    lagu d,e;
    
    d = new lagu();
    e = new lagu();
    
    d.isiParam("Lagu 1");
    e.isiParam("Kepastian yang kutunggu", "GIGI");
    
    
    d.cetakKeLayar();
    e.cetakKeLayar();
    }

}
