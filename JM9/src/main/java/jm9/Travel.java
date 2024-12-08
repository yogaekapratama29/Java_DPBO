/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm9;

/**
 *
 * @author macairm1
 */
public class Travel {
    private String travelCode;
    private String cityName;
    private String flight;
    private String travelType;
    private int reserved;

    public Travel(String travelCode, String cityName, String flight, String travelType) {
        this.travelCode = travelCode;
        this.cityName = cityName;
        this.flight = flight;
        this.travelType = travelType;
    }

    public String getTravelCode() {
        return travelCode;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public int getReserved() {
        return reserved;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-10s %-20s %-20s %-15s", travelCode, cityName, flight, travelType, reserved + " orang");
    }
}

