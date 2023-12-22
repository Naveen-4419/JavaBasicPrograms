package com.javacodebase.CompositionChallenge;


//// has a relationship, subclass of any superclass can have a composition class for which all subclasses can be made up of
public class Main {

    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();
       smartKitchen.doKitchenWork();
    }
}
