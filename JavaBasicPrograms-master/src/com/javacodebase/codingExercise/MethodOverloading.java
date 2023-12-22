package com.javacodebase.codingExercise;

public class MethodOverloading {
    public static void main(String[] args) {
double heightInCenti = convertToCentimeters(5,8);
        System.out.println(heightInCenti);
    }
    public static double convertToCentimeters(int heightInch){
        //height in inches
        // need to convert to centimeters
        return heightInch*2.54;



    }
    public static double convertToCentimeters(int heightFeet, int heightInch){
        //p1 in Feet, p2 in inch
        // need to convert to feet to inch
        int totalHeight = heightFeet * 12 + heightInch;
        double heightInCenti = convertToCentimeters(totalHeight);
        return heightInCenti;
    }

}
