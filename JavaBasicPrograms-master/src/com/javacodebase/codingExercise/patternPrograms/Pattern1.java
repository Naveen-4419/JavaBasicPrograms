package com.javacodebase.codingExercise.patternPrograms;

public class Pattern1 {
    public static void main(String[] args) {
        getPattern(5);
    }
    public static void getPattern(int number){
        for(int i=1; i<=number; i++){
            for(int j=1; j<= number+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//* * * * *
//* * * *
//* * *
//* *
//*