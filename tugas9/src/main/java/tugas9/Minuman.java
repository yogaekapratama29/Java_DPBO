/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author macairm1
 */
public class Minuman implements ItemMenu {
    private String nama;
    private double harga;

    public Minuman(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public void printDetails() {
        System.out.println("item Minuman: " + nama + " - Rp. " + harga);
    }
}

