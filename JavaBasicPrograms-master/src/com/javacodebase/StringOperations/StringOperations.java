package com.javacodebase.StringOperations;

public class StringOperations {
    public static void main(String[] args) {
        String apple="Apples";
        char ch= apple.charAt(0); // retrieve char at particular index
        System.out.println(apple.contains("A"));
        System.out.println(apple.indexOf('p'));
        System.out.println( apple.substring(3,5));
        char[] chArray=apple.toCharArray();
        System.out.println(chArray[5]);
    }
}
