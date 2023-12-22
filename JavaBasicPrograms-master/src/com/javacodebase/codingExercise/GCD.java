package com.javacodebase.codingExercise;

public class GCD {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(24,12));
    }
    public static int getGreatestCommonDivisor(int number1, int number2){
        if(number1 < 10 || number2 < 10){
            return -1;
        } else{
            int gcd = 0;
            for(int i=1; i<number1; i++){
                if(number1%i == 0){
                    if(number2%i == 0){
                        gcd=i;
                    }
                }
            } return gcd;

        }
    }
}
