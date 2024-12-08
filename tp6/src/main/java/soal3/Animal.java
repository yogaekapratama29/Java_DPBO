/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author macairm1
 */
class Animal {
    private int age;
    private String kind;

    public Animal(int age, String kind) {
        this.age = age;
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void run() {
        System.out.println("Lari!!!");
    }

    public void hunt() {
        System.out.println("Berburu...");
    }
}