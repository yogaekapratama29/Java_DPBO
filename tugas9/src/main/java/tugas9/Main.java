/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas9;

/**
 *
 * @author macairm1
 */
public class Main {
    public static void main(String[] args) {
        ItemMenu Makanan1 = new Makanan("Nasi Padang", 8.99);
        ItemMenu Minuman1 = new Minuman("Es Teh", 3.49);
        ItemMenu MakananPenutup1 = new MakananPenutup("Martabak", 5.99);


        Order order = new Order();
        order.tambahItem(Makanan1);
        order.tambahItem(Minuman1);
        order.tambahItem(MakananPenutup1);


        System.out.println("Detail Pesanan:");
        order.printOrderDetails();


        double total = order.hitungHarga();
        System.out.println("Total Harga: Rp " + total);


        Receipt receipt = new Receipt(0.1, 0.05); 
        double jumlahAkhir = receipt.hitungJumlahAkhir(total);
        System.out.println("Jumlah Akhir (dengan pajak dan diskon): Rp." + jumlahAkhir);

       
        if (Makanan1 instanceof Makanan) {
            Makanan specificFood = (Makanan) Makanan1; 
            System.out.println("Downcasted Item: " + specificFood.getNama());
        }
    }
}

