/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author macairm1
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(3, "Persian", "Yaongi");
        
        System.out.println("Nama: " + cat.getName());
        System.out.println("Umur: " + cat.getAge() + " tahun");
        System.out.println("Tipe: " + cat.getKind());
        cat.run();
        cat.hunt();
        cat.play();
    }
}
