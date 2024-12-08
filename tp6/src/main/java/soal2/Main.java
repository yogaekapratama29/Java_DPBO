/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author macairm1
 */
public class Main {
    public static void main(String[] args) {
        Dentist dentist = new Dentist("Hong Gil-Dong");

        System.out.println(dentist.getDepartment() + ": Dokter " + dentist.getName());
        dentist.treatPatient();
        dentist.pullOutTooth();
    }
}
