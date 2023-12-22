package com.javacodebase.CompositionChallenge;

public class CoffeeMaker {
    private boolean hasWorkToDo = false;

    public CoffeeMaker() {
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Work in progress");
            hasWorkToDo = false;
        }
    }
}
