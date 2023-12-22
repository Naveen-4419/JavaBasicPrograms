package com.javacodebase.codingExercise;


public class SumOdd {
    public static boolean isOdd(int number){
        if(number > 0){
            if(number % 2 == 0){
                return false;
            }   return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        if(start > 0 && end > 0 && start <= end){
            for(int i=start; i<= end; i++){
                sum= isOdd(i) ? sum+i: sum;
            } return sum;
        } else{
            return -1;
        }


    }

    public static void main(String[] args) {
        int sum= sumOdd(2,10);
        System.out.println("bhyt "+sum);
    }

}
