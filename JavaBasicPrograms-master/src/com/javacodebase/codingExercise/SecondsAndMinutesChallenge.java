package com.javacodebase.codingExercise;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int seconds){
        int minutes =0, secondsLeft;
        if(seconds >= 0) {
            minutes = seconds /60;
            secondsLeft = seconds % 60;
            String hours = getDurationString(minutes, secondsLeft);
            return hours;
        }
        return "Seconds should be greater than 0";
    }
    public static String getDurationString(int minutes, int seconds){
        int hours=0;
        if(minutes >=0 && seconds >=0 && seconds<=59 ){
            hours = minutes/60;
            minutes = minutes % 60;
            return hours+"h " +minutes+"m "+seconds+"s";
        }
        return "Minutes cannot be zero and seconds cannot be greater than 59 or less than zero.";
    }
}
