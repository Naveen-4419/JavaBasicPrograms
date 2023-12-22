package com.javacodebase.codingExercise;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, sum = 0, i;
        try {
            while (count < 5) {
                System.out.println("Enter number #" + (count + 1) + ":");
                i = sc.nextInt();
                sum += i;
                count++;
            }
            System.out.println("Sum of all integers " + sum);
        } catch (Exception e){
            System.out.println("Invalid Number");
            main(null);
        }
    }
}
//this class does not allow to continue the number if we have any error
//Enter number #1:
//        1
//        Enter number #2:
//        2
//        Enter number #3:
//        3
//        Enter number #4:
//        hbgh
//        Invalid Number
//        Enter number #1:
//        1
//        Enter number #2:
//        2
//        Enter number #3:
//        3
//        Enter number #4:
//        4
//        Enter number #5:
//        5
//        Sum of all integers15
//
//        Process finished with exit code 0
