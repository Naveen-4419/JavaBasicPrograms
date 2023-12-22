package com.javacodebase.Inheritance;

public class HourlyEmployee extends Employee{
    public double hourlyPayRate;

    public double getDoublePay(){
        return 23.00;
    }
    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate){
        super(name, birthDate, employeeId, hireDate);
        this.hourlyPayRate= hourlyPayRate;
        System.out.println("Salaried Employee");

    }
}
