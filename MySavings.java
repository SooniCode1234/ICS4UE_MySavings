/*
ICS4UE - April 13, 2022
I have coded this program following our Academic Honesty policy.

SOURCES
-------
StackOverflow. (2015, August 30). java - How to clear the console? Stack Overflow. https://stackoverflow.com/a/32295974

Consultation
------------
I consulted with my EA at Bloorview School, Colin Smith.
*/

import java.util.Scanner;
class MySavings {
  public static void main(String[] args) {
    // I use a scanner to read user input
    Scanner in = new Scanner(System.in);

    // Create a PiggyBank object
    PiggyBank piggyBank = new PiggyBank();

    // Display the menu
    showMenu();

    // Get the user's choice
    System.out.print("Enter your choice: ");
    int choice = in.nextInt();

    // While the user's choice is not 0, keep asking for a choice
    while (choice != 0) {
      // Acting on whether the user wants to show the total, add money, take money, or quit
      filterInput(choice, in, piggyBank);

      // Display the menu
      showMenu();

      // Get the user's choice
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
    }
  }

  /**
   * Displays the menu.
   */
  private static void showMenu() {
    System.out.println("1. Show total in bank.");
    System.out.println("2. Add a penny.");
    System.out.println("3. Add a nickel.");
    System.out.println("4. Add a dime.");
    System.out.println("5. Add a quarter.");
    System.out.println("6. Take money out of the bank.");
    System.out.println("Enter 0 to quit.");
  }

  /**
   * Filters the user's input.
   * @param choice the user's choice
   * @param in the Scanner object
   * @param piggyBank the PiggyBank object
   */
  private static void filterInput(int choice, Scanner in, PiggyBank piggyBank) {
    // If the user enters a number between 2 and 5, call piggyBank.addMoney(choice). 
    if (choice >= 2 && choice <= 5) {
      // Add the money to the bank
      piggyBank.addMoney(choice);

      clearScreen();
    } else if (choice == 1) {
      addLineBreak();
      
      // Display the total in the bank
      System.out.println("You have $" + piggyBank.getTotal());
      
      addLineBreak();
    } else if (choice == 6) {
      // Get the user's withdrawal amount
      System.out.print("How much money would you like to take out: ");
      double withdrawalAmount = in.nextDouble();

      // Check if the withdrawal amount is valid. if it is not ask for a new amount.
      while (withdrawalAmount > piggyBank.getTotal()) {
        addLineBreak();
        System.out.println("You don't have enough money in the bank.");
        System.out.print("How much money would you like to take out: ");
        withdrawalAmount = in.nextDouble();
      }

      // Take the money out of the bank 
      piggyBank.takeMoney(withdrawalAmount);

      clearScreen();
    } else {
      addLineBreak();
      System.out.println("Invalid choice.");
      addLineBreak();
    }
  }

  /**
   * Adds a line break.
   */
  private static void addLineBreak() {
    System.out.println();
  }

  /**
   * Clears the screen.
   */
  private static void clearScreen() {
    // Got this code from https://stackoverflow.com/a/32295974
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
