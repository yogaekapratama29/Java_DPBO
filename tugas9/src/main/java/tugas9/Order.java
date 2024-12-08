/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macairm1
 */


import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<ItemMenu> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void tambahItem(ItemMenu item) {
        items.add(item);
    }

    public double hitungHarga() {
        double total = 0.0;
        for (ItemMenu item : items) {
            total += item.getHarga();
        }
        return total;
    }

    public void printOrderDetails() {
        for (ItemMenu item : items) {
            item.printDetails();
        }
    }
}

