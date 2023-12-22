package com.javacodebase.Inheritance;

public class SalariedEmployee extends Employee{
    public double annualSalary;
    public boolean isRetried;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetried){
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary= annualSalary;
        this.isRetried= isRetried;
        System.out.println("Salaried Employee");
    }

    @Override
    public double collectPay() {
        return (int) annualSalary/26;
    }

    public boolean retire(){
        return true;
    }
}
