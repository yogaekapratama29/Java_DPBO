/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DynamicBinding;

import java.util.Random;

/**
 *
 * @author macairm1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Binatang[] peliharaanku = {
           new Burung("Perkutut"),
           new Kucing("Oren")
       };
       
     Binatang kesayangan;
     Random binatangku = new Random();
     kesayangan = peliharaanku[binatangku.nextInt(peliharaanku.length)];
     
     System.out.println("Binatangan Kesayangan teman- teman : " + kesayangan);
     System.out.println("Suaranya : ");
     kesayangan.suara();
     
    }
    
}
