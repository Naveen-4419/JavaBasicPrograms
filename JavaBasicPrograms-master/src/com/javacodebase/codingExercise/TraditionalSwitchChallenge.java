package com.javacodebase.codingExercise;

public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char c = 'A';

        // Enhanced switch case
//        return switch(c){
//            case 'A' -> System.out.println("Able");
//            case 'B' -> System.out.println("Baker");
//            case 'C' -> System.out.println("Charlie");
//            case 'D' -> System.out.println("Dog");
//            case 'E' -> System.out.println("Easy");
//            default -> {
//                System.out.print("Wrong choice");
//            }
//
//        };


        switch (c) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default: {
                System.out.print("Wrong choice");
            }

        }
        ;


    }


}
