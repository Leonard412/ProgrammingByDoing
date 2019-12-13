import java.util.*;

public class HiLoLimited
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      
      int numGuess;
      int randNum;
      int tries = 0;
      
      randNum = 1 + r.nextInt(100);
      
      //System.out.println(randNum);
      System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
      System.out.print("First guess: ");
      numGuess = keyboard.nextInt();
      tries++;
      
      while(numGuess != randNum && tries < 8)
      {
         System.out.print("Guess # " + (tries + 1) + ": ");
         numGuess = keyboard.nextInt();
         tries++;
         
         if(numGuess > randNum)
            System.out.println("Sorry, that guess is too high.");

         else if(numGuess < randNum)
            System.out.println("Sorry, you are too low.");
      }
         
      if(numGuess == randNum)
      {
         System.out.println("You guessed it! What are the odds?");
      }
      
      if(tries >= 7)
      {
         System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
      }
   }
}