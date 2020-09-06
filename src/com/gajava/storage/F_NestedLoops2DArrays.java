package com.gajava.storage;

public class F_NestedLoops2DArrays {
    public static void main(String[] args) {
//        for (int i = 1; i < 3; i++){
//            for (int j = 0; j<4; j++){
//                System.out.println("i=" + i + ", j=" + j);
//            }
//        }

        int[][] listOfNumbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10}
        };

       for (int i = 0; i < listOfNumbers.length; i++){
            for (int j = 0; j< listOfNumbers[i].length; j++){
                System.out.print(listOfNumbers[i][j]);
            }
           System.out.println("");
        }
    }
}
