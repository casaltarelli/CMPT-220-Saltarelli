//package com.company;

public class ElevenThree {
    // ----- Question 11.3 -----

    public static void main(String[] args) {
        // -- Instances of Account, CheckingAccount, & SavingsAccount
        Account aInstance = new Account(1, 1000);
        CheckingAccount cInstance = new CheckingAccount(2, 1000, -20);
        SavingsAccount sInstance = new SavingsAccount(3, 1000);

        // -- Set Interest Rates
        aInstance.setAnnualInterestRate(5);
        cInstance.setAnnualInterestRate(5);
        sInstance.setAnnualInterestRate(5);

        // -- Withdraw & Deposit
        aInstance.withdraw(500);
        cInstance.withdraw(500);
        sInstance.withdraw(500);

        aInstance.deposit(1000);
        cInstance.deposit(1000);
        sInstance.deposit(1000);

        // -- toString
        System.out.println(aInstance.toString());
        System.out.println(cInstance.toString());
        System.out.println(sInstance.toString());
    }
}
