package com.javacodebase.codingExercise.patternPrograms;

public class Pattern30 {

    public static void main(String[] args) {
        pattern30(5);
    }
    public static void pattern30(int number) {
        int spaces;

        for (int rows = 1; rows <= number; rows++) {
            for (spaces = 1; spaces <= number - rows; spaces++) {
                System.out.print(" ");
            }
            for (int j = rows; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= rows; k++) {
                System.out.print(k +"");
            }
            System.out.println();
        }
    }
}

//output:
//        1
//        2 1 2
//        3 2 1 2 3
//        4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5
