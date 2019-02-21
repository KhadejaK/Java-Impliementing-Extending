/**
 * Implement a subclass of Product called Painting.
 * A Painting has a String instance variable, artist, in addition to description and price.
 * These paintings are framed prints not originals.
 * @author KhadejaKhalid
 */
public class Painting extends Product
{
   private String artist;
   
   /**
    * Constructs a Painting 
    * @param d : description from Product class
    * @param p : price from Product class
    * @param theArtist : the name of the artist 
    */
   public Painting(String d, double p, String theArtist)
   {
      super(d, p);
      artist = theArtist;
   }
   
   /**
    * @return the name of the artist
    */
   public String getArtist()
   {
      return artist;
   }
   
   /**
    * returns true if the paintings have the same artist. Otherwise false
    * @param other : the other painting
    * @return true if the artist is found otherwise false
    */
   public boolean sameArtist(Painting other)
   {
      boolean found = false;
      if (other.getArtist().equals(getArtist()))
         found = true;
      
      return found;
   }
   
   /**
    * @return the description of the Painting then a space and the Artist's name
    * @Override
    */
   public String getDescription()
   { 
      return super.getDescription() + " " + getArtist();
   }
   
   
}
