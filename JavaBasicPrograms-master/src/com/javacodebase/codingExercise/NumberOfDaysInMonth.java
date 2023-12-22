package com.javacodebase.codingExercise;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int year = 1924;
        if(((year/4 == 0) && (year/100 != 0)) || ( year/400 == 0)){
            System.out.println("year");
        } else{
            System.out.println("67566534");
        }
    }
}
