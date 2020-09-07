package com.gajava.classesandobjects;

public class G_ClassesAndObjects {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.firstName = "Nelson";
        myStudent.lastName = "Alba";
        myStudent.age = 18;
        myStudent.gpa = 3.5;
        myStudent.major = "BSCS";
        myStudent.onProbation = false;

        System.out.println(myStudent.firstName);
        System.out.println(myStudent.lastName);
    }
}
