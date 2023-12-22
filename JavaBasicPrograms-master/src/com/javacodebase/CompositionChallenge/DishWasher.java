package com.javacodebase.CompositionChallenge;

public class DishWasher {
    private boolean hasWorkToDo = false;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public DishWasher() {
    }

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Work in progress");
            hasWorkToDo = false;
        } else{
            System.out.println("do Nothing");
        }

    }
}
