package com.javacodebase.codingExercise;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(3);
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("Positive");
        } else if(number < 0){
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }
    }
}


//
//public class SpeedConverter {
//
//    // write your code here
//    public static long toMilesPerHour( double kilometersPerHour){
//        if(kilometersPerHour < 0){
//            return -1;
//        } else{
//
//        }
//    }
//}
