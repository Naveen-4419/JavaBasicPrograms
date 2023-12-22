package com.javacodebase.codingExercise;

public class sum3and5 {
    public static void main(String[] args) {
        int sum=0, counter=0;
        for(int i=1; i<= 1000; i++){
            if(i%3 == 0 && i%5 == 0){
                counter++;
                sum+=i;
                System.out.println("Number which is divided by both 3 and 5 " + i);
                if(counter >= 5){
                    break;
                }
            }
        }
        System.out.println("Sum of the numbers " + sum);
    }
}
