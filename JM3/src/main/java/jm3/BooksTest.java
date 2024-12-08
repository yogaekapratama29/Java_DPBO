/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jm3;
import java.util.Scanner;
/**
 *
 * @author macairm1
 */

public class BooksTest {
    public static void main(String[] args) {
        BookBiz bookBiz = new BookBiz();
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            printMenu();
            menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    bookBiz.printAllBooks();
                    break;
                case 2:
                    System.out.print("Masukkan nama penulis: ");
                    String author = scanner.nextLine();
                    bookBiz.searchNovelByAuthor(author);
                    break;
                case 3:
                    int minPrice = 0, maxPrice = 0;
                    boolean validInput = false;

                    // Validasi input harga
                    while (!validInput) {
                        System.out.print("Masukkan harga minimum: ");
                        minPrice = scanner.nextInt();
                        System.out.print("Masukkan harga maksimum: ");
                        maxPrice = scanner.nextInt();

                        if (minPrice < 0 || maxPrice < 0) {
                            System.out.println("[Error] Informasi harga tidak boleh berisi angka negatif. Silahkan masukan lagi");
                        } else if (minPrice > maxPrice) {
                            System.out.println("Nilai maksimum tidak boleh kurang dari nilai minimum. Silahkan masukan lagi");
                        } else {
                            validInput = true;
                        }
                    }

                    bookBiz.searchNovelByPrice(minPrice, maxPrice);
                    break;
                case 9:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        } while (menu != 9);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan semua buku");
        System.out.println("2. Cari novel berdasarkan penulis");
        System.out.println("3. Cari novel berdasarkan harga");
        System.out.println("9. Keluar");
        System.out.print("Pilih menu: ");
    }
}
