/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6.inheritance;

/**
 *
 * @author macairm1
 */
public class Manager extends Employee {
    private String alamat;
    
    public Manager(String nama, String s){
        super(nama);
        alamat = s;
    }
    
    public void tampilAlamat(){
        super.departemen = "Personalia";
        super.tampilNama();
        System.out.println("alamat : " + alamat);
        System.out.println("departement : " + departemen);
    }
    
    public static void main(String[]args){
        Manager adi = new Manager ("adi", "sukabirus");
        adi.tampilAlamat();
    }
}
