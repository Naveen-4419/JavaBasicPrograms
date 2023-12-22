package com.javacodebase.codingExercise;

public class printDayOfWeek {
    public static void main(String[] args) {
        int day = 1;
    String dayVariable = printDayOfWeek(day);
    System.out.println(dayVariable + " " + day );
    }

    public static String printDayOfWeek(int day){
        switch(day){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            default: return "Invalid Day";
        }

    }
}
