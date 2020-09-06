package com.gajava.storage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class G_TryCatchErrors {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try{
            double num = keyboardInput.nextDouble();
            System.out.println(num);
        }catch(Exception error){
            System.out.println(error);
        }

//        try{
//            System.out.println(nums[5]);
//            double num = keyboardInput.nextDouble();
//            System.out.println(num);
//        }catch(ArrayIndexOutOfBoundsException error){
//            System.out.println(error);
//        }catch (InputMismatchException error){
//            System.out.println(error);
//        }catch (Exception error){
//            System.out.println(error);
//        }catch (Error error){
////            System.out.println(error);
////        }catch (Throwable error){
////            System.out.println(error); //catches both exceptions and errors
////        }
    }
}
