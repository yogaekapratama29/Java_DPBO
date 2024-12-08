/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macairm1
 */
public class Account {
    private String name;
    private String number;
    private int balance;
    
    public Account(String number, String name, int balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public int getBalance(){
        return balance;
    }
        
}
