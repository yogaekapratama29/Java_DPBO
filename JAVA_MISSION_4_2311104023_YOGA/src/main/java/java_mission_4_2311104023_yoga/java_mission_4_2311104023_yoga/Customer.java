/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_mission_4_2311104023_yoga.java_mission_4_2311104023_yoga;

/**
 *
 * @author macairm1
 */
public class Customer {
    private String name;
    private double totalPurchase;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.totalPurchase = 0;
    }

    // Buy a book (overloading for Book and SecondBook)
    public void buyBook(Book book, int quantity) {
        if (book.getStock() >= quantity) {
            book.setStock(book.getStock() - quantity);
            totalPurchase += book.getPrice() * quantity;
        }
    }

    public void buyBook(SecondBook book, int quantity) {
        if (book.getStock() >= quantity) {
            book.setStock(book.getStock() - quantity);
            totalPurchase += book.getPrice() * quantity;
        }
    }

    // toString method to return customer details
    @Override
    public String toString() {
        return "Nama Pelanggan: " + name + " Jumlah total: Rp. " + totalPurchase;
    }
}
