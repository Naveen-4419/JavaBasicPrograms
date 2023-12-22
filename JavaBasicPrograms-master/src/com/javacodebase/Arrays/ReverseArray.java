package com.javacodebase.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] array= readArray(sc);
        printArray(array);
        array= reverse2(array);
        System.out.println(Arrays.toString(array));
        printArray(array);
    }
    private static void printArray(int []array){
        for(int element: array){
            System.out.print(element+ ",");
        }
        System.out.println();
    }
    private static int[] reverse(int []array){
        int[] reverse= new int[array.length];
        for(int i= 0, j= array.length-1; i<array.length; i++, j--){
            reverse[i]= array[j];
        }
        return reverse;
    }
    private static int[] reverse2(int []array){
        int maxLength= array.length-1;
        int midLen= array.length/2;
        for(int i=0;i<midLen; i++){
            int temp=array[i];
            array[i]= array[maxLength-i];
            array[maxLength-i]= temp;
        }
        return array;
    }
    private static int[] readArray(Scanner sc){
        System.out.println("Enter the string of elements using ,");
        String s= sc.next();
        String sArray[]= s.split(",");
        int array[]= new int[sArray.length];
        for(int i=0;i<array.length; i++){
            array[i]=Integer.parseInt(sArray[i]);
        }
        return array;
    }
}
