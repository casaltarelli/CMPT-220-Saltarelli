//package com.company;

import java.util.Date;

public class NineSeven {
    // ----- Question 9.7 -----
    /* I know the class is supposed to be called "Account" I called it
    "NineSeven" just so that I could keep track of what problem I am doing */

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public static void main(String[] args) {
        // -- Create Instance
        NineSeven instance = new NineSeven();

        // - Create Account
        instance.createAccount(1122, 20000);

        // - Set Interest Rate
        instance.setAnnualInterestRate(450);

        // - Withdraw & Deposit
        instance.withdraw(2500);
        instance.deposit(3000);

        // - Print Account Info
        System.out.println("Account Info:");
        System.out.println("Balance: " + instance.balance);

        double monthlyInterestRate = instance.getMonthlyInterestRate();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate);

        Date createdDate = instance.getDateCreated();
        System.out.println("Account Created On: " + createdDate);
    }

    // ----- Create Account
    public void createAccount() {
        // -- Creates Account Object
    }

    public void createAccount(int idNum, double amount) {
        // -- Creates Account Object
        id = idNum;
        balance = amount;

        dateCreated = new Date();
    }

    // ----- ID
    public int getID() {
        return id;
    }

    public void setID(int ID) {
        id = ID;
    }

    // ----- Balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    // ----- Annual Interest Rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate/100;
    }

    // ----- Date
    public Date getDateCreated() {
        return dateCreated;
    }

    // ----- Monthly Interest Rate
    public double getMonthlyInterestRate() {
        // annualInterestRate / 12
        double monthlyInterestRate = annualInterestRate / 12;

        return monthlyInterestRate;
    }

    // ----- Monthly Interest
    public double getMonthlyInterest() {
        double monthlyInterest = getMonthlyInterestRate();

        return balance * monthlyInterest;
    }

    // ----- Withdraw & Deposit
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

}
