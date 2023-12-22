package com.javacodebase.Collections.BankApplication;


import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions ){
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer cust= new Customer("Meghaa", 1000);
        System.out.println(cust);
        Banks bank=new Banks("Chase");
        bank.addNewCustomer("Ram Mohan", 5000);
        bank.addTransaction("Ram Mohan", -600);
        bank.addTransaction("Ram Mohan", -700);
        bank.printStatement("Ram Mohan");
        System.out.println(bank);
    }
}

class Banks {
    private String name;
    private ArrayList<Customer> customers= new ArrayList<>(5000);

    @Override
    public String toString() {
        return "Banks{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public Banks(String name){
        this.name=name;
    }

    private Customer getCustomer(String custName){
        for(var customer: customers){
            if(customer.name().equalsIgnoreCase(custName)){
                return customer;
            }
        }
        System.out.println("No customer with "+custName+ " found");
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer newCust = new Customer(customerName, initialDeposit);
            customers.add(newCust);
        }
    }
    public void addTransaction(String name, double transactionAmount){
        Customer cust=getCustomer(name);
        if(cust != null){
            cust.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String custName){
        Customer cust=getCustomer(custName);
        if(cust == null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println(cust.name());
        System.out.println(cust.transactions());
        for (double d: cust.transactions()){
            System.out.printf("$%10.2f (%s)%n",d, d<0 ? "debit": "credit");
        }

    }
}
