package com.javacodebase.codingExercise;

public class Number_Palindrome {
    public static boolean isPalindrome(int number) {
        int n1, n2, numSum = 0, numberCheck = number;
        do {
            n1 = numberCheck % 10;
            n2 = numberCheck / 10;
            numSum = numSum * 10 + n1;
            numberCheck = n2;
        } while (n2 != 0);
        System.out.println(numSum + " " + number);
        if (numSum == number) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Given number is " + (isPalindrome(-22) ? "as palindrome" : "not a palindrome"));
    }
}
