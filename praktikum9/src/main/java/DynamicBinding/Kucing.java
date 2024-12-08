/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicBinding;

/**
 *
 * @author macairm1
 */
public class Kucing extends Binatang {
    private String nama;
    
    Kucing(String nama){
    super("Kucing");
    this.nama = nama;
    }
    
    @Override
    public void suara()
    {
        System.out.println("Meow Meow Meow");
    }
    
    @Override 
    public String toString(){
        return super.toString() + " " + nama;
    }
}

