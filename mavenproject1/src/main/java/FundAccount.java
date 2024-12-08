/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macairm1
 */
public class FundAccount extends Account {
    private double earningRate;
    
    public FundAccount(String number, String name, int balance, double earningRate){
        super(number,name,balance);
        this.earningRate = earningRate;
    }
    
    public double getEarningRate(){
        return earningRate;
    }
    public void earnMoney(){
        System.out.println("Keuntungan telah diperoleh");
    }
    
    public void openAccount(){
        System.out.println("Buka Akun");
    }
    
    public void printAccountDetails(){
    openAccount();
     System.out.println("Nomor Rekening : " + getNumber());
     System.out.println("Pemilik Akun : " + getName());
     System.out.println("Saldo : " + getBalance());
     System.out.println("Tingkat pengembalian : " + getEarningRate() + " %");
     earnMoney();
    }
}
