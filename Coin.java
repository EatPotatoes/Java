import java.util.Random;
/**
 * This Coin class simulates a coin being flipped
 * @author rsteinberg
 */
public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;

   /*-----------------------------------------------------------------
     Sets up the coin by flipping it initially.
   -----------------------------------------------------------------
   */
   
   /**
    * Initiates the coin by flipping it and setting a value to it.
    */
   public Coin ()
   {
      flip();
   }

   /*-----------------------------------------------------------------
     Flips the coin by randomly choosing a face value.
   -----------------------------------------------------------------
   */
   
   /**
    * Gets a random value and sets the coin value to the random value
    */
   public void flip ()
   {
      //face = (int) (Math.random() * 2);
	  Random rnd = new Random();
	  face = rnd.nextInt(2);
   }

   /*-----------------------------------------------------------------
     Returns true if the current face of the coin is heads.
   -----------------------------------------------------------------
   */
   
   /**
    * Decides whether or not the coin has been flipped heads
    * @return returns a boolean, true if the coin is heads, false if the coin is tails
    */
   public boolean isHeads ()
   {
      return face == HEADS;
   }

   /*-----------------------------------------------------------------
     Returns the current face of the coin as a string.
   -----------------------------------------------------------------
   */
   public String toString()
   {
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
}
