/**
 * Write a description of class ProductTester here.
 * 
 * @author KOBrien
 */
public class PaintingTester
{
    public static void main(String[] args)
    { 
        //be sure Painting is a subclass of Product
        Product product = new Painting("The Starry Night", 95.0, "Van Gogh");
        
        //instantiate some Paintings
        Painting lilies = new Painting("The Water Lily Pond", 85.0, "Monet");
        Painting bridge = new Painting("The Japanese Footbridge", 120.0, "Monet");
        Painting girl = new Painting("Girl with a Hoop", 100, "Renoir");
        Painting child = new Painting("Child with a Dove", 150.0, "Picasso");
        Painting starry = (Painting)product; //Get a Painting reference to the Painting
  
        System.out.println(lilies.sameArtist(bridge));
        System.out.println("Expected: true");
        System.out.println(girl.sameArtist(child));
        System.out.println("Expected: false");
        
        System.out.println(starry.getDescription());
        System.out.println("Expected: The Starry Night Van Gogh");
        System.out.println(girl.getDescription());
        System.out.println("Expected: Girl with a Hoop Renoir");
        
        System.out.println(lilies.getPrice());
        System.out.println("Expected: 85.0");
        
        System.out.println("Artist: " + starry.getArtist());
        System.out.println("Expected: Van Gogh");
    }
}