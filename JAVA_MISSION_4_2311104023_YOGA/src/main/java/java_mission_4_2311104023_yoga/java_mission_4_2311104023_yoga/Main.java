/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_mission_4_2311104023_yoga.java_mission_4_2311104023_yoga;

/**
 *
 * @author macairm1
 */
public class Main {
    public static void main(String[] args) {
        // Create array of Book and SecondBook objects
        Book[] books = {
            new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15),
            new Book("Street of Dark Shops", "Patrick Modiano", 25000, 10),
            new Book("Pistol, Kuman dan Besi", "Jared Diamond", 40000, 8),
            new Book("Perjalanan Mr. Cuffe", "David Lodge", 30000, 6)
        };

        SecondBook[] secondBooks = {
            new SecondBook("Cerita Pendek Tolstoy", "Leo Tolstoy", 12000, 5, "Bekas"),
            new SecondBook("Seni Berpikir Jernih", "Rolf Dobelli", 20000, 2, "Bekas")
        };

        // Create customers
        Customer customer1 = new Customer("Na Gong-Bu");
        Customer customer2 = new Customer("Kim Sin-ip");

        // Buy books
        customer1.buyBook(books[1], 3);
        customer1.buyBook(books[2], 0);
        customer1.buyBook(secondBooks[0], 1);
        customer1.buyBook(books[0], 1);

        customer2.buyBook(secondBooks[0], 1);
        customer2.buyBook(books[3], 2);
        customer2.buyBook(books[2], 3);

        // Print book information
        System.out.println("Informasi Buku:");
        for (Book book : books) {
            System.out.println(book);
        }
        for (SecondBook secondBook : secondBooks) {
            System.out.println(secondBook);
        }

        // Print customer information
        System.out.println("\nInformasi Pelanggan:");
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
