package com.javacodebase.codingExercise;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces( double number1, double number2){
        if(Math.round(number1) == Math.round(number2)){
            return true;
        }else
            return false;
    }

}



