/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macairm1
 */
public class kendaraan {
    private String vehicleType;
    private String plateNumber;
    private int numWheels;
    private double speed;
    
    public kendaraan(String plateNumber, double speed){
        this.plateNumber = plateNumber;
        this.speed = speed;
    }
    
    public kendaraan(String vehicleType, String plateNumber, int numWheels, double speed){
        this.vehicleType = vehicleType;
        this.plateNumber = plateNumber;
        this.numWheels = numWheels;
        this.speed = speed;
    }
    
    public double calcluateTravelTime(double distance){
        
        return speed/distance;
    }
    
    public double calcluateTravelTime(double distance,double customSpeed){
        
        return customSpeed/distance;
    }
    
    public void displayInfo(){
    System.out.println("Plate Number : " + plateNumber );
    System.out.println("Plate Speed : " + speed );
    System.out.println("Plate Num Wheels : " + numWheels );
    System.out.println("Plate Vehicle Type : " + vehicleType );
    }
    
//    void calculateTravelTime(double speed, double jarak, double perjalanan){
//    
//    perjalanan = speed/jarak;
//    
//    }
}

