package com.javacodebase.codingExercise;


public class NumberToWords {
    // write your code here
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int digitLength = (int) (Math.log10(number) + 1);
            return digitLength;
        }
    }



    public static int reverse(int number) { //231
        int n1, reverseNum = 0, n2 = number;
        while (n2 != 0) {
            n1 = n2 % 10;
            reverseNum = reverseNum * 10 + n1;
            n2 = n2 / 10;
        }
        return reverseNum;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNum = reverse(number), n1;
            System.out.println("reverseNum" + reverseNum);
            int length = getDigitCount(number);
            System.out.println("length" + length);
            for (int i = 0; i < length; i++) {
                n1 = reverseNum % 10;
                switch (n1) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;

                }
                reverseNum = reverseNum / 10;
            }
        }

    }

    public static void main(String[] args) {
        numberToWords(001);
        System.out.println("count" + getDigitCount(0));
    }
}
