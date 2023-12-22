package com.javacodebase.codingExercise;

public class isEven {
    public static boolean isEvenNumber(int number){
       if(number % 2 == 0){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        int i=5, evenCount=0, oddCount=0;
//        for(i=5; i<= 20;i++){
//            if(isEvenNumber(i)){
//                System.out.println(i + " is even number");
//            }
//        }

        while(i<=20){

            if(isEvenNumber(i)){
                System.out.println(i + " is even number");
                evenCount += 1;
                if(evenCount >=5) {
                    break;
                }
            } else{
                oddCount += 1;
            }
            i++;
        }
        System.out.println("Even Count " + evenCount+ " OddCount " + oddCount);
    }
}
