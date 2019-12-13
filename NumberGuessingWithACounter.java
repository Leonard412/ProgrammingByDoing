import java.util.*;

public class NumberGuessingWithACounter
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      
      int guessNum;
      int randNum;
      int tries = 0;
      
      randNum = 1 + r.nextInt(10);
      
      System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
      System.out.print("Your guess: ");
      guessNum = keyboard.nextInt();
      tries++;
      
      while(guessNum != randNum)
      {
         System.out.println("That is incorrect. Guess again");
         guessNum = keyboard.nextInt();
         tries++;
      }
      
      if(guessNum == randNum)
      {
         System.out.println("You're right! You're a good guesser.");
         System.out.println("It only took you " + tries + " tries." );
      }
   }
}