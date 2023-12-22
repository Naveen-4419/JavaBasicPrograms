package com.javacodebase.Abstraction;

public class ProductB extends ProductForSale{

    public ProductB(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("In Product B" );
        System.out.println("This"  + type +"is a Great Picture of Meghana");
        System.out.printf("Price of this product is $6.2f %n", price);
        System.out.println(description);
    }
}
