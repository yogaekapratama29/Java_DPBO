/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_mission_4_2311104023_yoga.java_mission_4_2311104023_yoga;

/**
 *
 * @author macairm1
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    // Constructor
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public String getTitle() { 
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    // toString method to return book details
    @Override
    public String toString() {
        return "Judul: " + title + " Penulis: " + author + " Harga: Rp. " + price + " Persediaan: " + stock + " Jilid";
    }
}