public class AccountsOverrideTester
{

   public static void main(String[] args)
   {
      BankAccount account1 = new BankAccount(1500);
      BankAccount account2 = new BankAccount(1500);
      BankAccount account3 = new BankAccount(5000);
      
      SavingsAccount savings1 = new SavingsAccount(1500, .01);
      SavingsAccount savings2 = new SavingsAccount(3000, .02);
      SavingsAccount savings3 = new SavingsAccount(3000, .02);
      
      System.out.println(account1);
      System.out.println("Expected: BankAccount[balance=1500.0]");
      System.out.println(savings3);
      System.out.println("Expected: SavingsAccount[balance=3000.0][anualInterstRate=0.02]");
      
      System.out.println(account1.equals(account2));
      System.out.println("Expected: true");
      System.out.println(account1.equals(account3));
      System.out.println("Expected: false");
      System.out.println("super equals sub: " + account1.equals(savings1));
      System.out.println("Expected: false");
      
      System.out.println(savings1.equals(savings2));
      System.out.println("Expected: false");
      System.out.println(savings3.equals(savings2));
      System.out.println("Expected: true");

      System.out.println("Different classes:" + savings1.equals("account"));
      System.out.println("Expected: false");
      System.out.println("null: " + savings1.equals(null));
      System.out.println("Expected: false");
   }
}