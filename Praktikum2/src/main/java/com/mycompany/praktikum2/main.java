/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum2;

/**
 *
 * @author macairm1
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Manusia [] Manusia = new Manusia[4];
       for(int i = 0;i < Manusia.length;i++){
           Manusia [i] = new Manusia();
       }
       
       Manusia[0].setInfo("Hermawan",180);
       Manusia[1].setInfo("Suciati",160);
       Manusia[2].setInfo("Boy",170);
       Manusia[3].setInfo("Neneng",165);
       
       
       Manusia[0].info();
       Manusia[1].info();
       Manusia[2].info();
       Manusia[3].info();
    }
    
}
