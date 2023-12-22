package com.javacodebase.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class GroceryArrayList {
    private static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        List<String> listOfGrocery= new ArrayList<String>();
        while(true){
            System.out.println(" \n 0. Shut down \n 1.Add items \n 2. Remove Items ");
            System.out.println("Enter any option:");
            int n= Integer.parseInt(sc.nextLine());
            switch(n){
                case 0: System.exit(1); break;
                case 1: addItems(listOfGrocery); break;
                case 2: deleteItems(listOfGrocery); break;
            }
            listOfGrocery.sort(Comparator.naturalOrder());
            System.out.println(listOfGrocery);
        }
    }

    private static void deleteItems(List<String> listOfGrocery) {
        System.out.println("Delete the items specified between ,");
        String s[]= sc.nextLine().split(",");
        listOfGrocery.removeAll(List.of(s));
    }

    public static void addItems(List<String> listOfGrocery){
        System.out.println("Enter the items using , in between : ");
        String groceryList= sc.nextLine();
        String s[]= groceryList.split(",");
        listOfGrocery.addAll(List.of(s));
        System.out.println(listOfGrocery);
    }
//Mango, Orange, Tomato, Carrot, Peas, Potato, Brinjal

}
