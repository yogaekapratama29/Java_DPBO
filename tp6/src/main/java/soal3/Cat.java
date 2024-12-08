/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author macairm1
 */
class Cat extends Animal {
    private String name;

    public Cat(int age, String kind, String name) {
        super(age, kind);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hunt() {
        System.out.println("Tangkap tikus!!");
    }

    @Override
    public void run() {
        System.out.println("Lari!!!");
    }

    public void play() {
        System.out.println("Mainan sangat menyenangkan!!");
    }
}