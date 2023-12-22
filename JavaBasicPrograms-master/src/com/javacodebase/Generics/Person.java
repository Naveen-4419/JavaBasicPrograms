package com.javacodebase.Generics;

public class Person {

    public static void main(String[] args) {
        GenericClass<Integer> person=new GenericClass<>();
        person.setName(1);
        Integer name= person.getName();
        System.out.println(name);



    }
}
