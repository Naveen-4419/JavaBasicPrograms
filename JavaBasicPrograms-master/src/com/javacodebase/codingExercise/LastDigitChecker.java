package com.javacodebase.codingExercise;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10,100,1000));

    }
    public static boolean hasSameLastDigit(int digit1, int digit2, int digit3){
        if(isValid(digit1) && isValid(digit2) && isValid(digit3)){
            if(digit1%10 == digit2%10 || digit2%10 == digit3%10 || digit3%10 == digit1%10) {
                return true;
            }
        } return false;
    }

    public static boolean isValid(int digitCheck){
        if(digitCheck >=10 && digitCheck<= 1000){
            return true;
        }return false;

    }
}
