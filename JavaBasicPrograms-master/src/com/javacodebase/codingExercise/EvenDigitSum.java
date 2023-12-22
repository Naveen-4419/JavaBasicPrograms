package com.javacodebase.codingExercise;

import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        System.out.println("Enter a digit to get its EvenDigitSum "+ getEvenDigitSum(number));

    }
    public static int getEvenDigitSum(int number){

        if(number >= 0){
            int number1, number2, sumOfEvenNumber = 0;
            while(number > 0){ //23456 //2345 //234
                number1 = number/10; //2345 //234 //23
                number2= number%10;//6 //5 // 4
                number = number1; //2345 //234 // 23
                if(number2%2 == 0){ //6%2 == 0 //5%2 !=0 //4%2 !=0
                    sumOfEvenNumber += number2; //6 //6+4
                }
            }
            return sumOfEvenNumber; //0

        }
        return -1;
    }
}
