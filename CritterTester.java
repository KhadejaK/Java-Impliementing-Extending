/**
 * Tests Critter subclasses.
 * 
 */
public class CritterTester
{
   public static void main(String[] args)
   {
      Critter impatient = new ImpatientCritter(15.7);
      impatient.move(10);
      impatient.move(-3);
      System.out.println(impatient.getHistory());
      System.out.println("Expected: [move to 20, move to 14]");
      System.out.println(impatient.getPosition());
      System.out.println("Expected: 14");

      //LethargicCritter
      Critter lazy = new LethargicCritter(5.2);
      lazy.move(2);
      lazy.move(4);
      lazy.move(-1);
      lazy.move(3);
      lazy.move(5);

      System.out.println(lazy.getHistory());
      System.out.println("Expected: [eat, sleep, eat, sleep, eat]");
      System.out.println(lazy.getPosition());
      System.out.println("Expected: 0");

      //MulishCritter
      Critter mule = new MulishCritter(8.2);
      mule.move(2);
      mule.move(4);
      mule.move(-1);
      mule.move(3);
      mule.move(5);

      System.out.println(mule.getHistory());
      System.out.println("Expected: [move to 2, move to 5]");
      System.out.println(mule.getPosition());
      System.out.println("Expected: 5");
   }
}