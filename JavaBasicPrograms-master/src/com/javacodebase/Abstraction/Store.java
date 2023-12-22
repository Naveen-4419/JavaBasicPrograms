package com.javacodebase.Abstraction;

import java.util.ArrayList;


record OrderItem(int quantity, ProductForSale product){

}



public class Store {

   private static ArrayList<ProductForSale> productsForSales = new ArrayList<ProductForSale>();

    public static void main(String[] args) {

       productsForSales.add(new ProductA("Oil painting", 60000.0, "By Ram Mohan"));
       ////adding subclass to parent class list

        listProducts();
       var order=new ArrayList<OrderItem>();
        addItemToOrder(order,0,2);
        printOrder(order);
    }

    public static void  addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, productsForSales.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal=0;
        for(var item: order){
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.println(salesTotal);
    }

    public static void listProducts(){
        for(var item:productsForSales){
            System.out.println(item);
            item.showDetails();
        }
    }



}
