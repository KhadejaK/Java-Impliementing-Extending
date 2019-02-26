
public class PolymorphismRunner
{
   public static void main(String[] args)
   {
      BankAccount[] acc = new BankAccount[5];
      
      acc[0] = new BankAccount(1000);
      acc[1] = new SavingsAccount(1000, .01);
      acc[2] = new CheckingAccount(3000, 3);
      acc[3] = new SavingsAccount(1000, .01);
      acc[4] = new SavingsAccount(2000, .012);
      
      for (BankAccount elm : acc)
      {
         elm.deposit(200);
         elm.withdraw(100);
         elm.endOfMonth();
         System.out.printf("Balance: %.2f %n", elm.getBalance());
         if (elm.getClass().getName().equals("SavingsAccount"))
         {
            SavingsAccount sAcc = (SavingsAccount) elm;
            System.out.println("Interest: " + sAcc.getInterestRate());
         } 
      }
   }
}
