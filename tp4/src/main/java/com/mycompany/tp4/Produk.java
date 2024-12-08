/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;
/**
 *
 * @author macairm1
 */
class Produk {
    private String namaProduk;
    private double harga;
    private int stok;
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void printProductInfo() {
        System.out.println("--- Informasi Produk ---");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok + " unit");
        System.out.println();
    }
}

