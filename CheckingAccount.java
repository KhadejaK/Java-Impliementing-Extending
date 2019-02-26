/**
* A type of BankAccount where there are charges 
* for each transaction
*/
public class CheckingAccount extends BankAccount
{
  private double transactionFee;
  private int transactions;
  
  /**
   * Creates a TransactionAccount object with a starting balance and a transaction fee
   * @param initialBalance the starting balance
   * @param transactionFee  the fee charged for each transaction
   */
  public CheckingAccount(double initialBalance, double transactionFee)
  {
      super(initialBalance );
      transactions = 0;   
      this.transactionFee = transactionFee;
  }
  
  @Override
  public void deposit(double amount)
  {
      super.deposit(amount);
      transactions++;
  }
  
  @Override
  public void withdraw(double amount)
  {
      super.withdraw(amount);
      transactions++;
  }
  
  @Override
  public void endOfMonth()
  {

     double fee = transactions * transactionFee;
     super.withdraw(fee);

     transactions = 0;
  }
}