/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author macairm1
 */
public class Manusia {
    private String nama;
    private int umur;
    
    // Constructor
    public Manusia(){}
    public Manusia(String a ) {
        nama = a;
    }
    public Manusia(String a, int b){
        nama = a;
        umur = b;
    }
    
    
    public void setName(String a){
        nama = a;
    }
    public String getNama(){
        return nama;
    }
    public void setUmur(int a){
        umur = a;
    }
    public int getUmur(){
        return umur;
    }
}
