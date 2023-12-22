package com.javacodebase.Collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


record Place( String placeName, int distance){

        }



public class Main_Places {



    public static void main(String[] args) {
        Places p= new Places();

        LinkedList<Places> listOfPlaces= new LinkedList<>();
        listOfPlaces.add(new Places("Sydney", 0));
        listOfPlaces.add(new Places("Ade", 1374));
        listOfPlaces.add(new Places("Alice", 2771));
        listOfPlaces.add(new Places("Brisbane", 917));
        listOfPlaces.add(new Places("Darwin", 3972));
        listOfPlaces.add(new Places("Melb", 877));
        listOfPlaces.add(new Places("Perth", 3923));
        Places place = new Places("brisbane", 917);
        addPlaces(listOfPlaces, place);
        Places place1 = new Places("MeghaCity", 99);
        addPlaces(listOfPlaces, place1);
        System.out.println(listOfPlaces);
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Available action: \n (F)orward \n (B)ackward \n (L)ist Places \n (M)enu \n (Q)uit");
            String s= sc.next();

            switch(s){
                case "F":
                    System.out.println("Forward action");
                    forwardAction(listOfPlaces);
                    break;
                case "B":
                    System.out.println("Backward action");
//                    backwardAction(listOfPlaces);
                    break;
                case "L":
                    System.out.println("List Places");
//                    listingPlaces(listOfPlaces);
                    break;
                case "M":
                    System.out.println("Menu action");
                    forwardAction(listOfPlaces);
                    break;
                case "Q":
                    System.out.println("Quit action");
                    System.exit(0);
                    break;

            }
        }


    }

    private static void addPlaces(LinkedList listOfPlaces, Places place){
        if(listOfPlaces.contains(place)){
            System.out.println("Place already available");
            return;
        }
        for(int i=0; i< listOfPlaces.size(); i++){
            if(listOfPlaces.get(i).equals(place.getPlaceName())){
               return;
            }
        }
      
        listOfPlaces.add(place);
    }

    private static void forwardAction(LinkedList<Places> listOfPlaces) {
        ListIterator iterator= listOfPlaces.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
