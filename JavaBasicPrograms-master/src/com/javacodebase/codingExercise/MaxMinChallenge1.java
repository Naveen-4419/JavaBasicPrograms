package com.javacodebase.codingExercise;

import java.util.Scanner;

public class MaxMinChallenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        while (true) {  try {
            System.out.println("Enter a number:");
            Double d = sc.nextDouble();
            if (!d.isNaN()) {
                min = min < d ? min : d;

                max = max > d ? max : d;
            }
        }

        catch (Exception e) {
            System.out.println("Expected number");
            break;
        }

        }
        System.out.println("Maximum number enter so far: " + max);
        System.out.println("Minimum number enter so far: " + min);
    }
}
