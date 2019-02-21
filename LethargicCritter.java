/**
 * A LethargicCritter only has two activities: eat and sleep. 
 * When asked to move, it will either eat or sleep. 
 * A LethargicCritter is created hungry so the first time its move method is called, 
 * the LethargicCritter should eat. (and add the word "eat" to the history. 
 * The next time the move method is called, the LethargicCritter will sleep 
 * (and add the word "sleep" to the history). It will continue to alternate activities in this manner.
 * @author KhadejaKhalid
 */
public class LethargicCritter extends Critter
{
   private int count = 0;
   
   /**
    * Constructs the LethargicCritter
    * @param theWeight : comes from Critter class
    */
   public LethargicCritter(double theWeight)
   {
      super(theWeight);
   }
   
   /**
    * When asked to move, it will either eat or sleep. 
    * @param steps : doesn't move, just sleeps and eats
    * @Override
    */
   public void move(int steps)
   {
      if (count%2 == 0)
         super.addHistory("eat");
      else
         super.addHistory("sleep");
      count++;
   }

}
