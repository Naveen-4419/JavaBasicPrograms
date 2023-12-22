package com.javacodebase.Arrays;

import java.util.Scanner;

public class MiniElement {
    public static void main(String[] args) {
        System.out.println("Enter the total number of values you want to add");
        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int newArray[]=arrareadIntegers(n, sc);
//        int minVal= findMin(newArray);
//        System.out.println("Minimum value" +minVal);

       int newArray1[]= readIntegers(sc);
        int minVal= findMin(newArray1);
        System.out.println("Minimum value" +minVal);
    }

    public static int[] readIntegers(Scanner sc){
        System.out.println("Enter the string of elements using ,");
        String s= sc.next();
        String split[]= s.split(",");
        int[] newArray=new int[split.length];
        for(int i=0; i<newArray.length; i++){
            newArray[i]= Integer.parseInt(split[i]);
        }
        return newArray;
    }

    public static int[] arrareadIntegers(int n, Scanner sc){
        int newArray[]=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0; i<newArray.length; i++){
            newArray[i]= sc.nextInt();
        }

        return newArray;
    }
    public static int findMin(int[] newArray){
        int minVal=Integer.MAX_VALUE;
        for(int element: newArray){
            if(element< minVal){
                minVal = element;
            }
        }

        return minVal;

    }
}
