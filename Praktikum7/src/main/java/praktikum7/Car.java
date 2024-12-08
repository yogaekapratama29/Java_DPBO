/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author macairm1
 */
public class Car extends Vehicle{
    private int numDoors;
    public Car(String brand, int year, int numDoors){
        super(brand,year);
        this.numDoors = numDoors;
    }
    
    public void startEgine(){
    System.out.println("Car engine started with button.");
    }
    
    @Override
    public String toString(){
        return super.toString() + "Doors : " + numDoors;
    }
}
