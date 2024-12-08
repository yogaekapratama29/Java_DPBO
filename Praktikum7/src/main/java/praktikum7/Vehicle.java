/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author macairm1
 */
public class Vehicle {
    private String brand;
    private int year;
    
    Vehicle(String brand, int year){
    this.brand = brand;
    this.year = year;
    }
    
    public void startEngine(){
        
    }
    
    @Override
    public String toString(){
        return ("Brand : " + brand + "Year : " + year );
    }
}
