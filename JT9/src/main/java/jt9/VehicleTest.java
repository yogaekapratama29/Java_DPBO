/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jt9;

/**
 *
 * @author macairm1
 */
public class VehicleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Truck ("B1234CD " , 10000,0.2,500),
            new Van("D5678EF " , 2000,10.0,15),
            new Motorcycle("G12345 ", 100,2.0,10),
            new HeavyDutyTruck("G67891 ", 250,1.0,20),
    };
        
        for (Vehicle vehicle : vehicles){
        vehicle.displayInfo();
        }
    }
    
}
