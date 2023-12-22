package com.javacodebase.Polymorphism;

public class Main {
    public static void main(String[] args) {
    Car car= new Car("GasPowered");
    runRace(car);
    Car car1=  new GasPoweredCar("2023 Megh Car", 15.4,6);
    runRace(car1);
    Car electricCar = new ElectricCar("Tesla", 25, 6);
    runRace(electricCar);
        HybridCar hybridCar = new HybridCar("Hybrid car", 25, 7, 4);
    runRace(hybridCar);

    }

    public static void  runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
