package com.gajava.storage;

import java.util.Scanner;

public class Proj_GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 5;
        int maxNumberOfAttempts = 3;
        int numberOfAttempts = 0;
        int guess = 0;

        Scanner input  = new Scanner(System.in);
        while(numberOfAttempts != maxNumberOfAttempts){
            if (guess == secretNumber){
                System.out.println("You won");
                break;
            }
            System.out.print("Enter Guess: ");
            guess = input.nextInt();
            numberOfAttempts++;
            System.out.println("Try again");

        }

        if (guess!=secretNumber){
            System.out.println("You lose");
        }

    }
}
