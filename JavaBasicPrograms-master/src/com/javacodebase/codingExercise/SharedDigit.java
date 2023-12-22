package com.javacodebase.codingExercise;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 32));
    }

    public static boolean hasSharedDigit(int digit1, int digit2) {

        //  int digitLength = (int)(Math.log10(digit1)+1); // used to find length of the digit
        //digitLength = digitLength > 2 ? (int)(Math.log10(digit2)+1) : 0;
        //        int i=50;
        //        String s=Integer.toString(i); int to String conversion
        //       System.out.println(i +" " + s);
        if (digit1 >= 10 && digit2 <= 99 && digit2 >= 10 && digit1 <= 99) {
            int n1, n2, n3, n4;
            n1 = digit1 / 10;
            n2 = digit1 % 10;
            n3 = digit2 / 10;
            n4 = digit2 % 10;
            if (n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4) {
                return true;
            }
        }
        return false;
    }


}
