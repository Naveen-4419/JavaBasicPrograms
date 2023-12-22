package com.javacodebase.Polymorphism;

public class ElectricCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }


    public void startEngine(){
        System.out.println(" Electric Car -> Don't startEngine");
    }

}
