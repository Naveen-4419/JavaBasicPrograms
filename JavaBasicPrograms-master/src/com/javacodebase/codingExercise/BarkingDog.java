package com.javacodebase.codingExercise;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if(barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 6));

//        //string to int
//        String s="123";
//        int i= Integer.parseInt(s);
//
//        //int to String
//        int integer=56;
//        String string= Integer.toString(i);
//        System.out.println(string + " " + i);
    }



}
