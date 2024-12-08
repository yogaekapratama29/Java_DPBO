/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jt9;

/**
 *
 * @author macairm1
 */
public abstract class Vehicle {
    protected String plateNumber;
    protected double capacity;
    
    
    public Vehicle(String plateNumber, double capacity){
        this.plateNumber = plateNumber;
        this.capacity = capacity;
    }
    
    public abstract double calculateOperationalCost();
    
    public void displayInfo(){
    double cost;
        cost = calculateOperationalCost();
    System.out.println("Vehicle Plate : " + plateNumber + "Capacity" + capacity + " kg, operational cost : " + cost);
    
    }
}
