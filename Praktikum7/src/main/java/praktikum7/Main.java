/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum7;

/**
 *
 * @author macairm1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle mobil = new Car("Suzuki", 2008, 5);
        Vehicle motor = new Motorcycle("Honda", 2005, "cruiser");
        System.out.println(mobil.toString());
        System.out.println(motor.toString());
    }
    }
    
