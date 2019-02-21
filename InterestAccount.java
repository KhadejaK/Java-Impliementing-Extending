/**
 * The account earns 0.9% interest annually compounded monthly.
 * @author KhadejaKhalid
 */
public class InterestAccount extends BankAccount
{
   public final static double ANNUAL_INTEREST_RATE = .009/12;
   
   /**
    * Constructs an InterestAccount
    * @param b : balance from the BackAccount class
    * @param id : id from the BackAccount class
    */
   public InterestAccount(double b, String id)
   {
      super(b, id);
   }
   
   /**
    * Do end of month processing for the account + annual interest rate
    * @Override
    */
   public void endOfMonth()
   {
       super.deposit(super.getBalance() * ANNUAL_INTEREST_RATE);
   }
}
