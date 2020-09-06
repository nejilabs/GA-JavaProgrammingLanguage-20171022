package com.gajava;

import java.util.Scanner;

public class A_Input {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Name: ");
        String name = keyboardInput.nextLine();

        System.out.print("Age: ");
        String age = keyboardInput.nextLine();

        System.out.println(name + " " + age);


    }
}
