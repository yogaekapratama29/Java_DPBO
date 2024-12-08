/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicBinding;

/**
 *
 * @author macairm1
 */
public class Burung extends Binatang {
    private String nama;
    
    Burung(String nama){
        super("Burung");
        this.nama = nama;
    }
    
    @Override
    public void suara(){
    System.out.println("Cukurukuk");
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + nama;
    }
}
