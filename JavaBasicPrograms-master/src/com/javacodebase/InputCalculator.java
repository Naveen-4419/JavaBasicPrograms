package com.javacodebase;

import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        double sum = 0, avg = 0,number=0;
        while (true) {
            try {
                System.out.println("Enter the number: ");
                Double d = sc.nextDouble();
                sum += d;
                avg = ((avg + d) / 2);
                number ++;
            } catch (Exception e) {
                avg = (double)((sum) / number);
                avg = Math.round(avg);
                System.out.println("SUM = " + (int)sum + " AVG = " + (int)avg);
                break;
            }


        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
