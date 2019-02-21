/**
 * Tester for BankAccount and its subclasses
 */
public class AccountTester
{
    public static void main(String[] args)
    {
       //check that these are subclasses of BankAccount
        BankAccount account = new TransactionAccount(1500, "abc123");
        account.endOfMonth();
        System.out.println("No transactions: " + account.getBalance());
        System.out.println("Expected: 1500.0");
        
        //
        for (int i = 0; i < TransactionAccount.FREE_TRANSACTIONS; i++)
        {
            account.withdraw(1);
        }
        account.endOfMonth();
        System.out.println("Three Transaction: " + account.getBalance());
        System.out.println("Expected: 1496.0");
        
        //make new account
        account = new TransactionAccount(1500, "xyz789");
        
        //withdraw $4 the add $4 using 6 transactions
        for (int i = 0; i < TransactionAccount.FREE_TRANSACTIONS ; i++)
        {
            account.withdraw(1);
        }
               
        account.deposit(2.0);
        account.deposit(2.0);
        System.out.println("Before end of month: " + account.getBalance());
        System.out.println("Expected: 1500.0");
        
        account.endOfMonth();
        System.out.println("After end of month: " + account.getBalance());
        System.out.println("Expected: 1490.0");
       
        //InterestAccount testing
        BankAccount account2 = new InterestAccount(1000, "abc123");
        account2.endOfMonth();

        System.out.printf("after one month: %.2f%n" , account2.getBalance()); 
        System.out.println("Expected: 1000.75");

        account2 = new InterestAccount(1000, "qrs123");
        account2.withdraw(100);
        
        //do a 12 end of month processings
        for(int i = 0; i < 12; i++)
        {
            account2.endOfMonth();
        }
        account2.deposit(100);
        
        System.out.printf("%.2f%n" , account2.getBalance()); 
        System.out.println("Expected: 1008.13");

    }
}