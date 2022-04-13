public class PiggyBank {
  private double pennies;
  private double nickels;
  private double dimes;
  private double quarters;

  private double total = 0;

  public PiggyBank() {
    this.pennies = 0;
    this.nickels = 0;
    this.dimes = 0;
    this.quarters = 0;
  }

  // Getter method for total
  public double getTotal() {
    // Round the total to two decimal places
    this.total = Math.round(this.total * 100.0) / 100.0;

    return this.total;
  }

  // Create methods to add money to the bank
  private void addPenny() {
    this.pennies++;
    this.total += 0.01;
  }

  private void addNickel() {
    this.nickels++;
    this.total += 0.05;
  }

  private void addDime() {
    this.dimes++;
    this.total += 0.10;
  }

  private void addQuarter() {
    this.quarters++;
    this.total += 0.25;
  }

  public void addMoney(int choice) {
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

  public void takeMoney(double amount) {
    this.total -= amount;

    // Round the total to two decimal places
    this.total = Math.round(this.total * 100.0) / 100.0;

    System.out.println("You have $" + this.total);
  }

  public String toString() {
    return "This piggy bank contains " + this.pennies + " pennies, " + this.nickels + " nickels, " + this.dimes
        + " dimes, and " + this.quarters + " quarters.";
  }
}
