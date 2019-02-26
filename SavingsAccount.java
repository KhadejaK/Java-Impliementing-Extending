/**
* An account that earns interest every month
*/
public class SavingsAccount extends BankAccount
{
  private double annualInterestRate;
 
  /**
   * Creates a InterestAccount object with a starting balance and account id
   * @param initialBalance the starting balance
   * @param rate the annual interest rate
   */
  public SavingsAccount(double initialBalance, double rate)
  {
      super(initialBalance);
      annualInterestRate = rate;
  }
  
  public double getInterestRate()
  {
     return annualInterestRate;
  }
  
  @Override
  public void endOfMonth()
  {
      double interest = getBalance() * annualInterestRate / 100 /12;
      deposit(interest);
  }
  
  @Override
  public boolean equals(Object otherObject)
  {
     if (!super.equals(otherObject))
        return false;
     
     SavingsAccount other = (SavingsAccount) otherObject;
     return(other.annualInterestRate == annualInterestRate);
  }
  
  @Override
  public String toString()
  {
     return super.toString() + "[anualInterstRate=" + annualInterestRate + "]";
  }
}