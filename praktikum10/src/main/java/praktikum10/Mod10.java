/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

/**
 *
 * @author macairm1
 */
public class Mod10 {

    public static void main(String[] args) {
        // Electronic example
        Electronic electronic = new Electronic("iPhone 14", 2, 15000000, "Smartphone");
        electronic.displayDetail();
        System.out.println();

        // Food example
        Food food = new Food("Lamington", 1, 30000, 3.5);
        food.displayDetail();
        System.out.println();

        // Cigarette example
        Cigarette cigarette = new Cigarette("Marlboro", 20, 135000, 20);
        cigarette.displayDetail();
    }
}
