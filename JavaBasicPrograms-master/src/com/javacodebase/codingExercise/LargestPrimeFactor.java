package com.javacodebase.codingExercise;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static boolean isPrime(int number){
        boolean isPrime=true;
        for(int i=2; i< number; i++){
            if(number%i == 0 ){
                isPrime= false;
                break;
            }
        }
        return isPrime;
    }


    public static int getLargestPrime(int number){
        if(number >1){
            int largestPrime=number;
            for(int i=2; i< number; i++){
                if(number%i == 0){
                    if(isPrime(i)){
                        largestPrime = i;
                    }
                }
            } return largestPrime;
        } return -1;
    }
}

//    public static int getLargestPrime(int number){
//        if(number >1){
//            int largestPrime=number;
//            for(int i=2; i< number; i++) {
//                if (number % i == 0) {
//                    for (int j = 2; j < i; j++) {
//                        if (i % j != 0 && j != i) {
//                            largestPrime = i;
//                        }
//                    }
//                }
//            }return largestPrime;
//        } return -1;
//    }
//}
