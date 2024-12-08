/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author macairm1
 */
import java.text.DecimalFormat;

public class Food extends PassengerGoods implements Taxable {
    private double weight;

    public Food(String name, int quantity, double price, double weight) {
        super(name, quantity, price);
        this.weight = weight;
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
        System.out.println("Berat           : " + weight + " kg");
        System.out.println("Pajak           : Rp " + df.format(calculateTax()));
}
}
