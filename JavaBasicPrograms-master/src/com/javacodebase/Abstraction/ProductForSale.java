package com.javacodebase.Abstraction;

public abstract class ProductForSale {
    protected static String type;
    protected static double price;
    protected static String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }


    public double getSalesPrice(int quantity){
        System.out.println("in getSalesPrice");
        return quantity*price;
    }

    public void pricedLineItem(int qty){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);
    }

     public abstract void showDetails();





}
