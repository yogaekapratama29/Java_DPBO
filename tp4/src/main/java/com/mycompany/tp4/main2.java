/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 * @author macairm1
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Produk produk1 = new Produk("Laptop", 15000000.0, 10);
        Produk produk2 = new Produk("Mouse", 150000.0, 50);
        Produk produk3 = new Produk("Keyboard", 300000.0, 30);


        ProdukManager manager = new ProdukManager();

       
        manager.tampilkanInformasiProduk(produk1);
        manager.tampilkanInformasiProduk(produk2);
        manager.tampilkanInformasiProduk(produk3);
    }
    
}
