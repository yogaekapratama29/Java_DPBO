/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tp4;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author macairm1
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
        Publication threeKingdom = new Publication("Three Kingdom", 5000, 300);
        Publication pie = new Publication("a Pie", 8400, 120);

        
        threeKingdom.printHeader();

        
        threeKingdom.printPriceList();
        pie.printPriceList();

        System.out.println("========================");

       
        threeKingdom.printBookVolume(67);
        pie.printBookVolume(82);

        System.out.println("========================");


        int totalCost = threeKingdom.calculateTotalPrice(67) + pie.calculateTotalPrice(82);

        Locale myIndonesianLocale = new Locale("in", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(myIndonesianLocale);

        System.out.println("Jumlah Total Pembelian: " + currencyFormatter.format(totalCost));
    }
}

   
