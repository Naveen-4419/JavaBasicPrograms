package com.javacodebase.ModifiedSwitch;


enum Season{SUMMER, SPRING, WINTER, FALL};
public class SwitchClass {
    public static void main(String[] args) {
        Season season= Season.SUMMER;
//Advanced switch case provides safety by exhaustive including of default
        String weather = switch(season){
            case SUMMER,SPRING -> "Sunny";
            case WINTER -> "Rainy";
            case FALL -> {
                System.out.println("Its fall"); // other way of writing
                yield "Fall";
            }
            default -> "Invalid Weather"; // Must and should have default, else code won't run
        };
        System.out.println(weather);
    }
}


