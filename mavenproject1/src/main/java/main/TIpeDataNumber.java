/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author macairm1
 */
public class TIpeDataNumber {
    public static void main(String [] args){
        byte iniByte = 100;
        short iniShort = 1000;
        int iniINT = 100000;
        long iniLong = 1000000000;
        
        // float dan double
        float iniFLoat=10.10F;
        double iniDouble = 10.10;
        
        // angka unik
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;
        
        // underscore
        int amount = 1_000_000_000;
        
        // konversi tipe data number
        short iniShortKonversi = iniByte;
        int iniINTKonversi = iniShortKonversi;
        // konversi paksa karena byte lebih kecil dari int daya tampung numbernya
        byte iniByteForce = (byte) iniINTKonversi;//terjadi number overflow
        
        
    }
}
