import java.util.*;

public class FlipAgain
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random rng = new Random();
      
      String again;
      
      do
      {
         int flip = rng.nextInt(2);
         String coin;
         
         if(flip == 1)
               coin = "HEADS";
         else
               coin = "TAILS";

         System.out.println("You flip a coin and it is... " + coin);
         
         System.out.print("Would you like to flip again \"(Y/N)\" ");
         again = keyboard.next();
      }
      
      while(again.equalsIgnoreCase("y"));
   }
}