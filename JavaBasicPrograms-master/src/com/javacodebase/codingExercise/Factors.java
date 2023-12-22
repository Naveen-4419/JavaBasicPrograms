package com.javacodebase.codingExercise;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
         factors(number);
    }
    public static void factors(int number){
        if(number >= 1){
            System.out.println("Factors of " +number+ " are as below");
            for(int i=1; i<= number; i++){
                if(number%i == 0){
                    System.out.print(i);
                }
            }

        } else{
            System.out.println("Invalid Value");
        }

    }
}
