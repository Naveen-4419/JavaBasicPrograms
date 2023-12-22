package com.javacodebase.Constructors;

public class Main {
    public static void main(String[] args) {

        CustomerChallenge cc= new CustomerChallenge("Ram", "rammohanmeesala@gmail.com");
        System.out.println(cc.getCreditLimit() +" " + cc.getName() +" " + cc.getEmail());
        CustomerChallenge cc1= new CustomerChallenge();
        System.out.println(cc1.getCreditLimit() +" " + cc1.getName() +" " + cc1.getEmail());

//        Employee tim= new Employee("Meghana", "12/16/1995", 1234, "12/24/1995");
//tim.getAge();
    }
}
