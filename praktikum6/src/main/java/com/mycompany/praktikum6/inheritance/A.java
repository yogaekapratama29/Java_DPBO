/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6.inheritance;

/**
 *
 * @author macairm1
 */
public class A {
    int x;
    int y;
    void tampilXY(){
        System.out.println("nilai x : " + x + " nilai y : " + y);
    }
}
class B extends A{
    int z;
    void jumlahXY (){
        System.out.println("Jumlah : " + (x+y+z));
    }
}

