import java.util.Scanner;
class MySavings {
  public static void main(String[] args) {
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
      filterInput(choice, in, piggyBank);

      // Display the menu
      showMenu();

      // Get the user's choice
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
    }
  }

  private static void showMenu() {
    System.out.println("1. Show total in bank.");
    System.out.println("2. Add a penny.");
    System.out.println("3. Add a nickel.");
    System.out.println("4. Add a dime.");
    System.out.println("5. Add a quarter.");
    System.out.println("6. Take money out of the bank.");
    System.out.println("Enter 0 to quit.");
  }

  // Create a method that filter the user's input.
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

  private static void addLineBreak() {
    System.out.println();
  }

  // Create a function that clears the screen
  private static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
