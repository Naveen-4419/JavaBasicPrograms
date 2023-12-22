package com.javacodebase;

public class BankAccount {

    private int accountNumber; //String accountNumber
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber; //String phoneNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositingFund(double money){
        accountBalance += money;
        return accountBalance;
    }
    public boolean withDrawFund(double money){
        if(money <= accountBalance) {
            accountBalance -= money;
            System.out.println("Remaining balance: " + accountBalance);
            return true;
        } else{
            System.out.println("Insufficient funds");
            return false;
        }
    }



}
