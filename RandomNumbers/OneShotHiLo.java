import java.util.*;

public class OneShotHiLo
{
   public static void main(String[] args)
   {
      Random r = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      int randNum = 1 + r.nextInt(100);
      int response;
      
      System.out.print("I'm thinking of a number between 1-100. Try to guess it. ");
      response = keyboard.nextInt();
      
      if(response > randNum)
         System.out.println("Sorry, you are too high. I was thinking of " + randNum);

      if(response < randNum)
         System.out.println("Sorry, you are too low. I was thinking of " + randNum);
         
      if(response == randNum)
         System.out.println("You guessed it! What are the odds?!?");
   }
}
