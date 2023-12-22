package com.javacodebase.StringOperations;

public class PalindromeString {

    public static void main(String[] args) {
        String s = "//"; //"A:MADAM:a";
        //String s="ABba";

//        StringBuilder str=new StringBuilder(s);
//        String palinCheck = str.reverse().toString();
//
//        if(s.equalsIgnoreCase(palinCheck)){
//            System.out.println("Yes, its a palindrome");
//        } else{
//            System.out.println("No,its not a palindrome ");
//        }

        boolean isPalindrome = palindromeCheck(s);
        System.out.println(isPalindrome ? "Yes, its a palindrome" : "No,its not a palindrome ");
    }

    private static boolean palindromeCheck(String s) {
        if (s.length() > 1) {
            char ch[] = s.toLowerCase().toCharArray();
            for (int i = 0, j = ch.length - 1; i < (ch.length) / 2; i++) {
                if (ch[i] == ch[j]) { // modify code by replacing j = ch.length()-i-1
                    j--;
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;



        /////Using streams
//        String sl=s.toLowerCase();
//        return IntStream.range(0,s.length()/2).allMatch(i -> sl.charAt(i) == sl.charAt(sl.length()-i-1));
    }
}
