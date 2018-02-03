package com.company;

import java.util.Scanner;

public class ThreeSeventeen {
    public static void main(String[] args) {
        // ----- Question 3.17 -----
        // -- Generate Computers Choice
        int compChoice = (int) (Math.random() * 3);
        String comp = "";

        if (compChoice == 0) {
            comp = "Scissors";
        } else if (compChoice == 1) {
            comp = "Rock";
        } else if (compChoice == 2) {
            comp = "Paper";
        }

        // -- Ask user for choice
        Scanner getChoice = new Scanner(System.in);
        System.out.println("Please make your choice scissors (0), rock (1), or paper (2)");

        int userChoice = getChoice.nextInt();
        String user = "";

        if (userChoice == 0) {
            user = "Scissors";
        } else if (userChoice == 1) {
            user = "Rock";
        } else if (userChoice == 2) {
            user = "Paper";
        }

        // -- Check for Winner
        String winner = "";

        // - Scissors
        if (userChoice == 0 && compChoice == 2) {
            winner = "You win!";
        } else if (userChoice == 0 && compChoice == 1) {
            winner = "The computer wins!";
        } else if (userChoice == 0 && compChoice == 0) {
            winner = "It's a tie!";
        }

        // - Rock
        if (userChoice == 1 && compChoice == 0) {
            winner = "You win!";
        } else if (userChoice == 1 && compChoice == 1) {
            winner = "It's a tie!";
        } else if (userChoice == 1 && compChoice == 1) {
            winner = "The computer wins!";
        }

        // - Paper
        if (userChoice == 2 && compChoice == 0) {
            winner = "The computer wins!";
        } else if (userChoice == 2 && compChoice == 1) {
            winner = "You win!";
        } else if (userChoice == 2 && compChoice == 2) {
            winner = "It's a tie!";
        }

        // -- Output to the user
        System.out.println("The computer is " + comp + "." + " You are " + user + ". " + winner);
    }
}
