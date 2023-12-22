package com.javacodebase.CompositionChallenge;

public class Refrigerator {
    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    private boolean hasWorkToDo = false;

    public Refrigerator() {
    }
    public  void orderFood(){
        if(hasWorkToDo)
        System.out.println("Work in progress");
        hasWorkToDo = false;
    }


}

