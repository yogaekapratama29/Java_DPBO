/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

/**
 *
 * @author macairm1
 */
public class Driver {
    public static void main(String[] args) {
        // Membuat objek Electronic
        Electronic electronic = new Electronic("Smartphone", 2, 18000000.0, "iPhone 14");
        // Memanggil method displayDetail()
        electronic.displayDetail();
        System.out.println();

        // Membuat objek Food
        Food food = new Food("Lamington", 4, 75.0, 350.0);
        // Memanggil method displayDetail()
        food.displayDetail();
        System.out.println();

        // Membuat objek Cigarette
        Cigarette cigarette = new Cigarette("Dunhill Blue", 30, 60000.0, 20);
        // Memanggil method displayDetail()
        cigarette.displayDetail();
}
}
