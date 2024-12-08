/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jm9;

import java.util.ArrayList;

/**
 *
 * @author macairm1
 */
public class TravelTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(new IndividualTravel("TRV001", "Munich  ", "German Airlines", 10));
        travels.add(new IndividualTravel("TRV002", "Praha   ", "AirFrance", 20));
        travels.add(new PackageTravel("TRV003", "LA   ", " Delta Airlines", 0));
        travels.add(new IndividualTravel("TRV004", "Osaka   ", "Korean Air", 15));
        travels.add(new PackageTravel("TRV005", "Shanghai", "Southern Airlines", 0));

        int menu;
        do {
            printMenu();
            System.out.println("Input Menu : ");
            menu = DataUtil.getIntegerInput();
            switch (menu) {
                case 1:
                    printHeader();
                    for (Travel travel : travels) {
                        System.out.println(travel.toString());
                    }
                    break;
                case 2:
                    printHeader();
                    for (Travel travel : travels) {
                        if (travel.getTravelType().equals("Individual Travel")) {
                            System.out.println(travel.toString());
                        }
                    }
                    break;
                case 3:
                    printHeader();
                    for (Travel travel : travels) {
                        if (travel.getTravelType().equals("Paket Travel")) {
                            System.out.println(travel);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan kode travel: ");
                    String code = DataUtil.getStringInput();
                    System.out.print("Masukkan jumlah orang: ");
                    int reserved = DataUtil.getIntegerInput();
                    boolean found = false;
                    for (Travel travel : travels) {
                        if (travel.getTravelCode().equals(code)) {
                            found = true;
                            travel.setReserved(reserved);
                        }
                    }
                    if (!found) {
                        System.out.println("Error: Kode travel tidak ditemukan!");
                    }
                    break;
                case 9:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Silahkan Input Kembali!!");
            }
        } while (menu != 9);
    }

    public static void printMenu() {
        System.out.println("======== < Menu > ========");
        System.out.println("1. Periksa semua produk travel");
        System.out.println("2. Periksa produk Individual");
        System.out.println("3. Permintaan produk paket travel");
        System.out.println("4. Reservasi produk travel");
        System.out.println("9. End");
        System.out.println("===========================");
    }

    public static void printHeader() {
        System.out.printf("%-8s %-10s %-20s %-20s %-15s %-15s %-15s%n",
                "Kode", "Nama", "Penerbangan", "JenisTravel", "JumlahMinOrang", "JumlahMaxOrang", "JumlahReservasiOrang");
    }
}
