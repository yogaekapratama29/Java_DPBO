/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macairm1
 */
public class testPass {
    int i,j;
    
    testPass(int a, int b){
        i = a;
        j = b;
    }
    
    void calculate(int m, int n){
        m = m * 10;
        n = n / 2;
    }
    
    void calculate(testPass e){
        e.i = e.i * 10;
        e.j = e.j/2;
    }
}
