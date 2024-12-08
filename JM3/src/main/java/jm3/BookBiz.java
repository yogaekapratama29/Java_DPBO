/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm3;
/**
 *
 * @author macairm1
 */

public class BookBiz implements IBookBiz {
    private Book[] books;

    public BookBiz() {
        books = new Book[]{
            new Magazine("Cooking Light", 15000, "living, cooking", "America Cooking"),
            new Magazine("Auto Bild", 16000, "science, car", "Germany Car"),
            new Novel("The Confession", 10500, "Grisham, John"),
            new Novel("Les Miserables", 17500, "Hugo, Victor"),
            new Novel("Breakthrough", 47200, "Ifill, Gwen"),
            new Novel("The Racketeer", 38000, "Grisham, John")
        };
    }

    @Override
    public void printAllBooks() {
        printHeader();
        for (Book book : books) {
            System.out.println(book.toString());
        }
        printTail();
    }

    @Override
    public void searchNovelByAuthor(String author) {
        printHeader();
        for (Book book : books) {
            if (book instanceof Novel) {
                Novel novel = (Novel) book;
                if (novel.getAuthor().equalsIgnoreCase(author)) {
                    System.out.println(novel.toString());
                }
            }
        }
        printTail();
    }

    @Override
    public void searchNovelByPrice(int minPrice, int maxPrice) {
        // Validasi input harga
        if (minPrice < 0 || maxPrice < 0) {
            System.out.println("Error: Harga tidak boleh negatif.");
            return;
        }
        if (minPrice > maxPrice) {
            System.out.println("Error: Harga minimum tidak boleh lebih besar dari maksimum.");
            return;
        }

        // Jika valid, lakukan pencarian
        printHeader();
        boolean found = false;
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                System.out.println(book.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada novel dengan rentang harga tersebut.");
        }
        printTail();
    }

    public void printHeader() {
        System.out.println("---Informasi Buku---");
    }

    public void printTail() {
        System.out.println("--------------------");
    }
}
