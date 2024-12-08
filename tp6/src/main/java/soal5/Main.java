/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal5;

/**
 *
 * @author macairm1
 */
public class Main {
    public static void main(String[] args) {
        FundAccount fundAccount = new FundAccount("111-2222", "Hong Gil-Dong", 5000000, 4.7);

        fundAccount.openAccount();
        System.out.println("Nomor rekening: " + fundAccount.getNumber());
        System.out.println("Pemilik akun: " + fundAccount.getName());
        System.out.println("Saldo: " + fundAccount.getBalance() + " won");
        System.out.println("Tingkat pengembalian: " + fundAccount.getEarningRate() + "%");
        fundAccount.earnMoney();
    }
}
