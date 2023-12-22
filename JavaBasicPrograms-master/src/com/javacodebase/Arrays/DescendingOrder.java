package com.javacodebase.Arrays;

import java.util.Arrays;
import java.util.Random;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] integerArray = new int[10];
        int a=10;
        int b=a;
        b=120;
        System.out.println(a +" " + b);
        int length=1;
        Random random= new Random();
        for(int i=0; i< integerArray.length; i++){
            integerArray[i]= random.nextInt(100);
        }
        Arrays.sort(integerArray);

        for(int element: integerArray ) {
            System.out.print(element);
            if (length < integerArray.length) {
                System.out.print(",");
                length++;
            }
        }
        System.out.println("Descending order");
        for(int i=integerArray.length-1; i>=0; i--){
            System.out.print(integerArray[i]);
            if(i>0) {
                System.out.print(",");
            }
        }
    }
}
