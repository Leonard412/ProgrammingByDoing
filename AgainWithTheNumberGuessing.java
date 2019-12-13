import java.util.*;

public class AgainWithTheNumberGuessing
{
   public static void main(String[] args)
   {
      Random r = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      int numGuess;
      int randNum = 1 + r.nextInt(10);
      int tries = 0;
      
      System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
      System.out.print("Your guess: ");
      numGuess = keyboard.nextInt();
      tries++;
      
      do
      {
         System.out.println("That is incorrect. Guess again.");  
         numGuess = keyboard.nextInt();
         tries++;
      }
      while(numGuess != randNum);
      
      if(numGuess == randNum)
      {           
         System.out.println("That's right! You're a good guesser.");
         System.out.println("It only took you " + tries + " tries.");
      }
   }
}