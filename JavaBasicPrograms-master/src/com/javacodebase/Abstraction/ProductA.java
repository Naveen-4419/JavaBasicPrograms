package com.javacodebase.Abstraction;

public class ProductA extends ProductForSale{

    public ProductA(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("In Product A");
        System.out.println("This"  + type +"is a Great Picture of Meghana");
        System.out.printf("Price of this product is $6.2f %n", price);
        System.out.println(description);
    }
}
