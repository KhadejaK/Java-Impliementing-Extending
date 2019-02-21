/**
 * Tests Critter subclasses.
 * 
 */
public class CritterRunner
{
   public static void main(String[] args)
   {
      Critter impatient = new ImpatientCritter(15.7);
      Critter lazy = new LethargicCritter(5.2);
      Critter mule = new MulishCritter(8.2);


      Critter[] zoo = {impatient, lazy, mule};

      //all critters inherit Critter's methods
      for (Critter c : zoo)
      {
         System.out.println("Weight: " + c.getWeight());
         c.move(8);
         c.move(-3);
         System.out.println(c.getHistory());
         System.out.println("Position: " + c.getPosition());
      }
   }
}