//package com.company;

public class CheckingAccount extends Account{
    // ----- Question 11.3 -----
    // ----- Global Variables
    private double overdraftLimit;


    // ----- Methods
    public CheckingAccount() {
        super();
        this.overdraftLimit = -20;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // -- Mutators
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // -- Accessors
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // -- Withdraw
    public void withdraw(double amount) {
        if((getBalance() - amount) > overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Amount is greater than preset Overdraft Limit");
        }
    }

    public String toString() {
        return super.toString() + "\nOverdraft Limit: $" + overdraftLimit;
    }
}
