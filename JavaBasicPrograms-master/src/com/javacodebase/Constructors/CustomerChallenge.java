package com.javacodebase.Constructors;

public class CustomerChallenge {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmail(){
        return email;
    }
    public CustomerChallenge(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public CustomerChallenge(){
        this("Meghana", 2000000, "gushidimeghana@gmail.com");
        System.out.println("This is a default constructor");
    }

    public CustomerChallenge(String name, String email){
        this(name, 3000000, email);
        System.out.println("Two args constructor");
    }

}
