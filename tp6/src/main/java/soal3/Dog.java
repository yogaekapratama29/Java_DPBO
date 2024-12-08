/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author macairm1
 */
class Dog extends Animal {
    private String name;

    public Dog(int age, String kind, String name) {
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
        System.out.println("Menangkap rusa!!");
    }

    @Override
    public void run() {
        System.out.println("Lari dengan kecepatan 40km/jam");
    }
}
