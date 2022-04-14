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
  private double max = 1.0;

  /**
   * A no-argument constructor for the PiggyBank class.
   */
  public PiggyBank() {}

  /**
   * Gets the total in the piggy bank.
   * @return the total
   */
  public double getTotal() {
    // Round the total to two decimal places
    this.total = Math.round(this.total * 100.0) / 100.0;

    return this.total;
  }

  /**
   * Sets the total in the bank
   * @param total the total to set
   */
  public void setTotal(double newTotal) {
    this.total = newTotal;
  }

  /**
   * Gets the maximum that the bank can hold.
   * @return the maximum amount of money that can be in the bank
   */
  public double getMax() {
    // Round the max to two decimal places
    this.max = Math.round(this.max * 100.0) / 100.0;

    return this.max;
  }

  /**
   * Adds money to the bank.
   * @param choice the user's choice in the menu
   */
  public void addMoney(int choice) {
    // See if the user's choice is between 2 and 5, and if so, adding the appropriate value to total.
    if (choice == 2) {
      total += 0.01;
    } else if (choice == 3) {
      total += 0.05;
    } else if (choice == 4) {
      total += 0.10;
    } else if (choice == 5) {
      total += 0.25;
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
