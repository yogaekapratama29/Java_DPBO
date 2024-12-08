/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;
import java.text.DecimalFormat;
/**
 *
 * @author macairm1
 */

public class Cigarette extends PassengerGoods implements Taxable {
    private int piecesPerPack;

    public Cigarette(String name, int quantity, double price, int piecesPerPack) {
        super(name, quantity, price);
        this.piecesPerPack = piecesPerPack;
    }

    @Override
    protected double calculatePrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * TAX_RATE;
    }

    @Override
    public void displayDetail() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Nama Barang     : " + getName());
        System.out.println("Jumlah          : " + getQuantity());
        System.out.println("Harga Total     : Rp " + df.format(calculatePrice()));
        System.out.println("Pieces per Pack : " + piecesPerPack);
        System.out.println("Pajak           : Rp " + df.format(calculateTax()));
    }
}