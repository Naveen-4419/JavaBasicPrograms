package com.javacodebase.CompositionChallenge.Challenge1;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    public String getStyle(String style){
        return style;
    }
    public boolean isBattery(boolean battery){
        return battery;
    }
    public int globRating(int globRating){
        return globRating;
    }

}
