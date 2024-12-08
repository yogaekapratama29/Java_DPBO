/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp10;

/**
 *
 * @author macairm1
 */
public abstract class Serangga {
    private final int jumlahKaki = 6;
    private String warna;

    public Serangga(String warna) {
        this.warna = warna;
    }

    public abstract void gerak(int[] sumbu);

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }

    public abstract void info();

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
