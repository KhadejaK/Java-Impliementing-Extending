/**
 * Lethargic critter only eats and sleeps.
 * 
 */
public class LethargicCritter extends Critter
{
    private boolean timeToEat;

    /**
     * Constructor for objects of class LethargicCritter
     * with the given weight and a position of 0
     * @param weight weight of this critter
     */
    public LethargicCritter(double weight)
    {
        super(weight);
        timeToEat = true;
    }
    
    @Override
    public void move(int steps)
    {
        if (timeToEat)
        {
            addHistory("eat");
        }
        else
        {
            addHistory("sleep");
        }
        
        timeToEat = !timeToEat;
    }
    
    @Override
    public boolean equals(Object otherObject)
    {
       if (!super.equals(otherObject))
          return false;
       
       LethargicCritter other = (LethargicCritter) otherObject;
       
       return (other.timeToEat == timeToEat);
    }
    
    @Override
    public String toString()
    {
       return super.toString() + "[timeToEat=" + timeToEat + "]";
    }
}
