package com.javacodebase.Inheritance;

public class Worker {
    public String name;
    public String birthDate="12/16/1995";
    public String endDate;

    public Worker(){
        System.out.println("Default Constructor");
    }


    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = birthDate.lastIndexOf("/");
        int date = Integer.parseInt(birthDate.substring(birthYear+1));
        System.out.println(date);
        return date;
    }
    public double collectPay(){
        return 25.6;
    }
    public void terminate(String endDate){
        this.endDate= endDate;
    }

    public static void main(String[] args) {
        SalariedEmployee se= new SalariedEmployee("Megh", "12/12/1995", 1234567,"12/18/2015", 23456.78, true );
        se.getAge();
        se.collectPay();
        se.retire();
    }
}
