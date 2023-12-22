package com.javacodebase.DesignPatterns;

public class Singleton {

    private static Singleton singletonInstance= null;
    private static String s;

    private Singleton(){
        s="Welcome to my singleton class";
    }
    public static synchronized Singleton getInstance(){
        if(singletonInstance== null){
            singletonInstance= new Singleton();
        }
        return singletonInstance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(s);
        Singleton singleton1 = Singleton.getInstance();

        if(singleton1.hashCode() == singleton.hashCode()){
            System.out.println("both instances are same");
        }



    }
}
