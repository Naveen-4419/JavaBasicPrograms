package com.javacodebase.codingExercise;

import java.util.Scanner;

public class DigitSum {
//    public static int sumDigits(int number){
//        if(number <0){
//           return -1;
//        } else{
//            int sum=0;
//            sum = numberSplit(number);
//            return sum;
//        }
//    }
    public static int sumDigits(int number) {
        int n1, n2, sum=0;
        while (number > 0) {
             n1 = number % 10;
             n2 = number / 10;
             sum += n1;
            number = n2;

        }
        if(number < 0){
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println("Sum of all the number " +sumDigits(number));

    }
}
