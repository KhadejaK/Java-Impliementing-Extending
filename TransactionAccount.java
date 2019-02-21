/**
 * The number of free transactions is 4 
 * and the charge is a $5.00 for every transaction after that amount
 * Both deposits and withdrawals are transactions.
 * @author KhadejaKhalid
 */
public class TransactionAccount extends BankAccount
{
      public final static int FREE_TRANSACTIONS = 4;
      public final static int MAX_TRANS_COST = 5;
      private int currTrans = 0;
      
      /**
       * Constructs a TransactionAccount
       * @param b : balance from the BackAccount class
       * @param id : id from the BackAccount class
       */
      public TransactionAccount(double b, String id)
      {
         super(b, id);
      }
      
      /**
       * Deposits money into the bank account & adds to the currentTrans number
       * @param amount the amount to deposit
       * @Override
       */
      public void deposit(double amount)
      {  
         super.deposit(amount);
         currTrans++;
      }
      
      /**
       * Withdraws money from the bank account & adds to the currentTrans number
       * @param amount the amount to withdraw
       * @Override
       */
      public void withdraw(double amount)
      {   
         super.withdraw(amount);
         currTrans++;
      }
      

      /**
       * Do end of month processing for the account & withdraw fee
       * @Override
       */
      public void endOfMonth()
      {
         if (currTrans > FREE_TRANSACTIONS)
            super.withdraw((currTrans-FREE_TRANSACTIONS) * MAX_TRANS_COST);
      }
      

}
