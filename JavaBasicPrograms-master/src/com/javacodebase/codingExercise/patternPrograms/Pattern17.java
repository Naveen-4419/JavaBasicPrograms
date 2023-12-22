package com.javacodebase.codingExercise.patternPrograms;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }
    public static void pattern17(int number){
        System.out.println();
        for(int rows=1; rows<=(2*number-1); rows++){
            int val= rows<= number? number-rows: rows-number;
            for(int spaces=1; spaces<=val; spaces++){
                System.out.print(" ");
            }
            int rowVal= rows<= number ? rows: (2*number)-rows;
            for(int j=rowVal; j>=1;j--){
                System.out.print(j + " ");
            }
            for(int k=2; k<=rowVal; k++){
                System.out.print(k+ " ");
            }
            System.out.println();

        }
    }
}




