import java.util.Scanner;

public class WorstGuessing
{
   private static int correctNumber = 8;
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int numGuess;
      
      System.out.println("IT'S THE WORST NUMBER GUESSING GAME EVER!!!\n");
      
      System.out.print("I'm thinking of a number from 1-10. Try to guess! ");
      numGuess = keyboard.nextInt();
      if(numGuess > 10 || numGuess < 1)
      {
         System.out.println("You don't know how to follow instructions, eh?");
         System.exit(0);
      }
      
      if(numGuess == correctNumber)
      {
         System.out.println("Wow I can't believe you got that right! It was 8!");
      }
      
      else
      {
         System.out.println("Haha you suck! The correct answer is 8!");
      }
      
      
   }
}
