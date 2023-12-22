package com.javacodebase.codingExercise;

import java.util.Scanner;

public class UserUnputChallenge1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1, sum=0;
        while(count<= 5){
            System.out.println("Enter number #" +(count)+" :");
            try{
                String s=sc.nextLine(); //The nextLine() method returns the line that was skipped.
                Integer i=Integer.parseInt(s); // Double i= Double.parseDouble(s);
                sum += i;
                count ++;
            }
            catch(Exception nfe){
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Sum of all the number:" +sum);
    }
}
