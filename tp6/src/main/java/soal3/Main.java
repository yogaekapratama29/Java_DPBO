/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

/**
 *
 * @author macairm1
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Cat
        Cat cat = new Cat(3, "Persian", "Yaongi");
        System.out.println("Nama: " + cat.getName());
        System.out.println("Umur: " + cat.getAge() + " tahun");
        System.out.println("Tipe: " + cat.getKind());
        cat.run();
        cat.hunt();
        cat.play();
        
        System.out.println();
        
        // Membuat objek Dog
        Dog dog = new Dog(2, "Siberian Husky", "Mongmongi");
        System.out.println("Nama: " + dog.getName());
        System.out.println("Umur: " + dog.getAge() + " tahun");
        System.out.println("Tipe: " + dog.getKind());
        dog.run();
        dog.hunt();
    }
}