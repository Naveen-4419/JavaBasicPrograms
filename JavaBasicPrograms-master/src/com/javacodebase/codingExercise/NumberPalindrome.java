package com.javacodebase.codingExercise;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(isPalidrome(number));
    }

    public static boolean isPalidrome(int number){
        int n1,n2,resultNum=0, numCopy=number;
        do{
            n1=numCopy%10; //123%10 = 3
            n2=numCopy/10; // 123/10 = 12
            resultNum = resultNum*10 + n1; // 3
            numCopy=n2;

        }while(n2 !=0);

        if(resultNum == number){
            return true;
        } return false;
    }
}
