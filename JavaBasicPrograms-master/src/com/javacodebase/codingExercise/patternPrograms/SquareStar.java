package com.javacodebase.codingExercise.patternPrograms;

public class SquareStar {
    public static void main(String[] args) {
        squareStar(8);
    }
    public static void squareStar(int number){
        for(int i=1;i<=number; i++){
            for(int j=1; j<=number; j++){
                if(i==j || i==1 || i==number || j==1 || j== number || j== number+1-i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}



//output:
//        ********
//        **    **
//        * *  * *
//        *  **  *
//        *  **  *
//        * *  * *
//        **    **
//        ********
