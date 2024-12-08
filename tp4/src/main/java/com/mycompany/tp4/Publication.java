/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author macairm1
 */
class Publication {
    private String title;
    private int price;
    private int page;

    public Publication(String title, int price, int page) {
        this.title = title;
        this.price = price;
        this.page = page;
    }
   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

   
    public void printHeader() {
        System.out.println("===== Mencari Informasi Buku =====");
    }

    public int calculateTotalPrice(int copies) {
        return price * copies;
    }

    public void printPriceList() {
        Locale myIndonesianLocale = new Locale("in", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(myIndonesianLocale);
        System.out.println(title + " (Price List: " + currencyFormatter.format(price) + ")");
    }

    public void printBookVolume(int copies) {
        System.out.println(title + " - Pembelian Jilid: " + copies);
    }
}


