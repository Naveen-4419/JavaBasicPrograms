package com.javacodebase.StringOperations;

import java.util.Arrays;

public class MaxMinArrayProduct {

    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,-1,-3, 12,10};
        int maxProduct=Integer.MIN_VALUE;
        int minProduct=Integer.MAX_VALUE;
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j< numbers.length; j++){

                    if ( numbers[i] * numbers[j] > maxProduct) {
                        maxProduct =  numbers[i] * numbers[j];
                    }
                    if( numbers[i] * numbers[j] < minProduct) {
                        minProduct =  numbers[i] * numbers[j];
                    }

            }
        }

        System.out.println(maxProduct);
        System.out.println(minProduct);
        // Other approach
        int []maxMin= findMaxMinProduct(numbers);
    }

    public static int[] findMaxMinProduct(int[] numArray){
         Arrays.sort(numArray);
         int result[] = new int[2];
        int maxPro = numArray[numArray.length-1] * numArray[numArray.length-2];
        int minPro = numArray[0] * numArray[1];
        if(maxPro > minPro){
            result[0]=maxPro;
            result[1] = minPro;
            return result;
        } else{
            result[0]=minPro;
            result[1] = maxPro;
            return result;
        }

    }

}
