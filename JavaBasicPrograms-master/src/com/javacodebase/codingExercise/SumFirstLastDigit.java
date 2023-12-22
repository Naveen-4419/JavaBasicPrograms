package com.javacodebase.codingExercise;

import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Sum of first and last " + addFirstLast(i));
    }

    public static int addFirstLast(int number) {
        if (number < 0) {
            return -1;
        } else {
            int firstDigit = number, lastDigit, sum, num = number;
            lastDigit = num % 10;
            while (num >= 10) { // 12>10 //
                num = num / 10; //123 = 12 // 1
                firstDigit = num; //12 // 1
            }
            sum = lastDigit + firstDigit; // 1+5
            return sum;
        }
    }

}
