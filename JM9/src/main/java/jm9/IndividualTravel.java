/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm9;

/**
 *
 * @author macairm1
 */
public class IndividualTravel extends Travel {
    private int maxPeople;

    public IndividualTravel(String travelCode, String cityName, String flight, int maxPeople) {
        super(travelCode, cityName, flight, "Individual Travel");
        this.maxPeople = maxPeople;
    }

    @Override
    public void setReserved(int reserved) {
        if (reserved > maxPeople) {
            System.out.println("Error: Jumlah pemesanan melebihi kapasitas maksimal!");
        } else {
            super.setReserved(reserved);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %-15s %-15s %-15s", super.toString(), "N/A", maxPeople + " orang", getReserved() + " orang");
    }
}