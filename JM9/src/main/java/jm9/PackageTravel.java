/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm9;

/**
 *
 * @author macairm1
 */
public class PackageTravel extends Travel {
    private int minPeople;

    public PackageTravel(String travelCode, String cityName, String flight, int minPeople) {
        super(travelCode, cityName, flight, "Paket Travel");
        this.minPeople = minPeople;
    }

    @Override
    public void setReserved(int reserved) {
        if (reserved < minPeople) {
            System.out.println("Error: Jumlah pemesanan kurang dari jumlah minimum!");
        } else {
            super.setReserved(reserved);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %-15s %-15s %-15s", super.toString(), minPeople + " orang", "N/A", getReserved() + " orang");
    }
}
