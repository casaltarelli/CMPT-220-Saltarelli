//package com.company;

import java.util.Date;

public class Account {
    // ----- Question 11.3 -----
    // ----- Global Variables
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // ----- Methods
    Account() {
        this(0, 0);
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // -- Mutator Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // -- Accessor Methods
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // -- Withdraw & Deposit
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    // -- toString
    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
                + "\nBalance: $" + balance + "\nMonthly interest: $" + getMonthlyInterest();
    }
}
