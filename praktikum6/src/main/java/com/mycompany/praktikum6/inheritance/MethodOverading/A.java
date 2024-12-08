/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6.inheritance.MethodOverading;

/**
 *
 * @author macairm1
 */
public class A {
    public void tampilkanKeLayar(){
        System.out.println("Method milik class A dipanggil....");
    }
}

class B extends A{
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar();
        System.out.println("Method miliki class B dipanggil....");
    }
}
