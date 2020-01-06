import java.util.*;

public class NumberGuess
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      
      int numGuess;
      int randNum = 1 + r.nextInt(10);
      
      System.out.println("I'm thinking of a number from 1 to 10.");
      System.out.print("Your guess: ");
      numGuess = keyboard.nextInt();
      
      if(numGuess == randNum)
         System.out.println("That's right! My secret number was " + randNum);

      else
         System.out.println("Sorry, but I was really thinking of " + randNum);
   }
}
