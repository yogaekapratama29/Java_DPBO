/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicBinding;

/**
 *
 * @author macairm1
 */
public abstract class Binatang {
    public String jenis;
    
    Binatang(String jenis){
        this.jenis = jenis;
    }
    
    protected abstract void suara();
    
    public String toString(){
    return "Seekor " + jenis;
    }
}
