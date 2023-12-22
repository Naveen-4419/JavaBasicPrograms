package com.javacodebase.Inheritance;

public class Employee extends Worker{
    public long employeeId;
    public String hireData;

    public Employee(String name, String birthDate, long employeeId, String hireDate){
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hireData = hireDate;
        System.out.println("default cons");
    }
}
