/**
 * A MulishCritter is very stubborn. It only moves every third time you tell it it move. 
 * You will override the move method. If you call the MulishCritter's move method 4 times, 
 * it will move the requested amount, not move, not move, move the requested amount. 
 * (The % operator is handy here)
 * @author KhadejaKhalid
 */
public class MulishCritter extends Critter
{
   private int count = 0;
   
   /**
    * Constructs the MulishCritter
    * @param theWeight : comes from Critter class
    */
   public MulishCritter(double theWeight)
   {
      super(theWeight);
   }

   /**
    * It only moves every third time you tell it it move.
    * @param steps : # of steps to move
    * @Override
    */
   public void move(int steps)
   {
      if (count%3 == 0)
         super.move(steps);
      count++;
   }
}
