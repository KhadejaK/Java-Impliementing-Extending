/**
 * A ImpatientCritter is always in a hurry If  you tell an ImpatientCritter to move 5, 
 * it will actually move 10 steps. You will override the move method.
 * @author KhadejaKhalid
 */
public class ImpatientCritter extends Critter
{
   /**
    * Constructs the ImpatientCritter
    * @param theWeight : comes from Critter class
    */
   public ImpatientCritter(double theWeight)
   {
      super(theWeight);
   }
   
   /**
    * moves # steps times 2
    * @param steps : moves # steps * 2
    * @Override
    */
   public void move(int steps)
   {
       super.move(steps *2);
   }
}
