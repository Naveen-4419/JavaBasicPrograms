package com.javacodebase.codingExercise;

public class PrimeNumberCount {
    public static void main(String[] args) {
        int number = 90, counter=0;
        for(int i=2; i<=1000; i++){
            if(isPrime(i)){
                System.out.println(i +"is Prime");
                counter++ ;
                if(counter == 3){
                    break;
                }
            }
        }
        System.out.println("The number is " +(isPrime(number)? "a Prime number": "Not a prime number"));
    }
    public static boolean isPrime(int number){
        if(number >= 2){
        for(int i=2; i<= number/2; i++){ // for(int i =2; i< number; i++)
            if( number % i == 0 ){
                return false;
            }
        }
        } else{
            System.out.println("Number should be greater than 2");
            return false;
        }
        return true;
    }
}
