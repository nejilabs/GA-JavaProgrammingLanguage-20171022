package com.gajava.storage;

import java.util.Scanner;

public class E_ExponentMethod {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Base Number: ");
        double baseNum = keyboardInput.nextDouble();

        System.out.print("Power Number: ");
        double powNum = keyboardInput.nextDouble();

        System.out.println(baseNum + "^" + powNum + " = " + customerPow(baseNum,powNum));
    }

    public static double customerPow(double baseNumber, double powerNumber){
        double result = 1;
        for(int i = 0; i < powerNumber; i++){
            result *= baseNumber;
        }
        return result;
    }
}
