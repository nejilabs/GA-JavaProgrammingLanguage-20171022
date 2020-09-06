package com.gajava.storage;

import java.util.Scanner;

public class Proj_BetterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Num1: ");
        double num1 = input.nextDouble();

        System.out.print("op: ");
        String op = input.next();

        System.out.print("Num2: ");
        double num2 = input.nextDouble();

        if(op.equals("+")){
            System.out.println(num1 + num2);
        }else if(op.equals("-")){
            System.out.println(num1 - num2);
        } else if(op.equals("*")){
            System.out.println(num1 * num2);
        }else if(op.equals("/")){
            System.out.println(num1 / num2);
        }else {
            System.out.println("Invalid operator");
        }

        switch(op){
            case "+": System.out.println(num1 + num2);
                break;
            case "-": System.out.println(num1 - num2);
                break;
            case "*": System.out.println(num1 * num2);
                break;
            case "/": System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }


    }
}
