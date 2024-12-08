/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author macairm1
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kendaraan a,z;
        
        a = new kendaraan("23131",10.0);
        z = new kendaraan("Porche 911","23131",10,20.5);
        
        double time = z.calcluateTravelTime(10);
        
        a.displayInfo();
        z.displayInfo();
        
        System.out.println("Waktu Perjalanan = " + time);
       
        
    }
    
}
