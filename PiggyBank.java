public class PiggyBank {
  private int pennies;
  private int nickels;
  private int dimes;
  private int quarters;

  public PiggyBank() {
    this.pennies = 0;
    this.nickels = 0;
    this.dimes = 0;
    this.quarters = 0;
  }

  public void addPenny() {
    this.pennies++;
  }

  public void addNickel() {
    this.nickels++;
  }

  public void addDime() {
    this.dimes++;
  }

  public void addQuarter() {
    this.quarters++;
  }

  public int total() {
    return this.pennies + this.nickels * 5 + this.dimes * 10 + this.quarters * 25;
  }

  public String toString() {
    return "This piggy bank contains " + this.pennies + " pennies, " + this.nickels + " nickels, " + this.dimes
        + " dimes, and " + this.quarters + " quarters.";
  }
}
