/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_mission_4_2311104023_yoga.java_mission_4_2311104023_yoga;

/**
 *
 * @author macairm1
 */
public class SecondBook extends Book {
    private String condition;

    // Constructor
    public SecondBook(String title, String author, double price, int stock, String condition) {
        super(title, author, price, stock);
        this.condition = condition;
    }

    // Getter and Setter for condition
    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }

    // Override toString to include condition information
    @Override
    public String toString() {
        return super.toString() + " Kondisi: " + condition;
    }
}