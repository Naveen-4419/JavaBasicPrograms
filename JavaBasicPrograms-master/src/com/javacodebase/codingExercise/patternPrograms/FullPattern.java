package com.javacodebase.codingExercise.patternPrograms;

public class FullPattern {
    public static void main(String[] args) {
        getFullPattern(5);
    }
    public static void getFullPattern(int number){
        int totalColinRow=0;
        for(int rows= 1; rows< 2*number ; rows++){
           totalColinRow = rows > number ? 2*number-rows : rows;
           for(int col=1; col< totalColinRow; col ++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }



//    public static void getFullPattern(int number){
//        for(int i=1; i<= 2*number-1; i++){
//            if(i<=number){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        } else{
//                for(int j=1; j<= 2*number-i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//                }
//            }
//
//    }
}

//output:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *