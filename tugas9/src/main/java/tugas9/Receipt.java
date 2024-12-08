/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author macairm1
 */
public class Receipt {
    private double tarifPajak;
    private double diskon;

    public Receipt(double tarifPajak, double diskon) {
        this.tarifPajak = tarifPajak;
        this.diskon = diskon;
    }

    public double hitungJumlahAkhir(double total) {
        double pajak = total * tarifPajak;
        double jumlahDiskon = total * diskon;
        return total + pajak - jumlahDiskon;
    }
}


