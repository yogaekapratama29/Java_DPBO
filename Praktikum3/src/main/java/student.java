/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author macairm1
 */


public class student {
    private String name_student;
    private String id_student;
    private int korean;
    private int english;
    private int math; 
}

public student(String name_student, String id_student, int korean, int english,int math){
    this.name_student = name_student;
    this.id_student = id_student;
    this.korean = korean;
    this.english = english;
    this.math = math;
}

public double calculateAverage(){
double average = (korean + english + math) / 3.0;
return average;
}

public String StudentInfo(){
    return "Nama : " + name_student + " \n" +
           " Student ID : " + id_student + " \n" +
           " Nilai Korea : " + korean + " \n" +
           " Nilai English : " + english + " \n" +
           " Nilai Math : " + math + " \n" +
           " Rata rata Nilai " + calculateAverage();
}

public void changesStudentID(String newID){
    this.id_student = newID;
}

public void printStudentInfo(){
    System.out.println(StudentInfo());
}