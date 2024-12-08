/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author macairm1
 */
public class passedByValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x,y;
       testPass z;
       z = new testPass(50,100);
       x = 10;
       y = 20;
       
       System.out.println("Nilai sebelum passed by value : ");
       System.out.println(" x = " + x);
       System.out.println(" y = " + y);
       
       //passed by value
       z.calculate(x,y);
       System.out.println("Nilai sesudah passed by value : ");
       System.out.println("x = " + x);
       System.out.println("y = " + y);
       System.out.println("Nilai sebelum passed by refrence : ");
       System.out.println("z.i = " + z.i);
       System.out.println("z.j = " + z.j);
       
       // passed by reference
       z.calculate(z);
       
       System.out.println("Nilai sebelum references : ");
       System.out.println("z.i = " + z.i);
       System.out.println("z.j = " + z.j);

    
    }
}
