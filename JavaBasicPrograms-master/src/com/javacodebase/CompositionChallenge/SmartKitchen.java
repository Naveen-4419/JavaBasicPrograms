package com.javacodebase.CompositionChallenge;

public class SmartKitchen {
    Oven oven;
    Refrigerator fridge;
    DishWasher dishWasher;
    CoffeeMaker coffeeMaker;

    public SmartKitchen() {
    }

    public SmartKitchen(Oven oven, Refrigerator fridge, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
       oven = new Oven();
       fridge= new Refrigerator();
       dishWasher = new DishWasher();
       coffeeMaker = new CoffeeMaker();
    }

    public Oven getOven() {
        return oven;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void addWater(){
        coffeeMaker = new CoffeeMaker(true);
        coffeeMaker.brewCoffee();


    }
    public void pourMilk(){
        fridge= new Refrigerator(true);
        fridge.orderFood();

    }
    public void loadDishwasher(){
        dishWasher = new DishWasher(true);
        dishWasher.doDishes();

    }
    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishwasher();


    }

}
