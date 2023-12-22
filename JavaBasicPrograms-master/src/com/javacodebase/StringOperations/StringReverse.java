package com.javacodebase.StringOperations;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();

        stringReverse(s);
    }

    public static void stringReverse(String str){
        char ch[]=str.toCharArray();
        String reverseString="";
        for(char c: ch){
            reverseString=c+reverseString;
        }
        System.out.println(reverseString);
    }
}
