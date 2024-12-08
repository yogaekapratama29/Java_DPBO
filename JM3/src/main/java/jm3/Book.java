/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm3;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author macairm1
 */
public class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(new Locale("kr", "KR"));
        return "[Judul]" + title + " [Harga] " + moneyFormat.format(price) + " Won";
    }
}
