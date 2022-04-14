/*
ICS4UE - April 13, 2022
I have coded this program following our Academic Honesty policy.

SOURCES
-------
N/A

Consultation
------------
I consulted with my EA at Bloorview School, Colin Smith.
*/

public class PiggyBank {
  private double total = 0;

  /**
   * A no-argument constructor for the PiggyBank class.
   */
  public PiggyBank() {}

  /**
   * @return the total
   */
  public double getTotal() {
    // Round the total to two decimal places
    this.total = Math.round(this.total * 100.0) / 100.0;

    return this.total;
  }

  /**
   * Adds a penny to the total.
   */ 
  private void addPenny() {
    this.total += 0.01;
  }

  /**
   * Adds a nickel to the total.
   */
  private void addNickel() {
    this.total += 0.05;
  }

  /**
   * Adds a dime to the total.
   */
  private void addDime() {
    this.total += 0.10;
  }

  /**
   * Adds a quarter to the total.
   */
  private void addQuarter() {
    this.total += 0.25;
  }

  /**
   * Adds money to the bank.
   * @param choice the user's choice in the menu
   */
  public void addMoney(int choice) {
    // See if the user's choice is between 2 and 5, and if so, calling the appropriate method.
    if (choice == 2) {
      this.addPenny();
    } else if (choice == 3) {
      this.addNickel();
    } else if (choice == 4) {
      this.addDime();
    } else if (choice == 5) {
      this.addQuarter();
    }

    // Round the total to two decimal places
    this.total = Math.round(this.total * 100.0) / 100.0;

    System.out.println("You have $" + this.total);
  }

  /**
   * Removes money from the bank.
   * @param amount the amount of money to remove
   */
  public void takeMoney(double amount) {
    this.total -= amount;

    // Round the total to two decimal places
    this.total = Math.round(this.total * 100.0) / 100.0;

    System.out.println("You have $" + this.total);
  }

  /**
   * Formats the object when printed.
   * @return the total as a string
   */
  public String toString() {
    return "You have $" + this.total + " in the bank.";
  }
}
