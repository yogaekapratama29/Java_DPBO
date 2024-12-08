/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author macairm1
 */
class Dentist extends Doctor {

    public Dentist(String name) {
        super(name, "Kedokteran Gigi");
    }

    public void pullOutTooth() {
        System.out.println("Telah mencabut gigi pasien.");
    }
}