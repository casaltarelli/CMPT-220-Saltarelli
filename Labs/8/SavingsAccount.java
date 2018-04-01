package com.company;

public class SavingsAccount extends Account {
    // ----- Question 11.3 -----
    // ----- Global Variables

    // ----- Methods
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    // -- Withdraw
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
