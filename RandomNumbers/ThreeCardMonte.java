import java.util.*;

public class ThreeCardMonte
{
   public static void main(String[] args)
   {
      Random r = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      int randNum = 1 + r.nextInt(3);
      int numGuess;
      
      System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
      System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
      System.out.println("He lays down three cards.");
      System.out.println("\n\n Which one is the ace?");
      System.out.println("\t ##  ##  ##");
      System.out.println("\t ##  ##  ##");
      System.out.println("\t 1   2   3");
      
      numGuess = keyboard.nextInt();
      
      if(randNum == 1 && numGuess == randNum)
      {
         System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
         System.out.println("\t AA  ##  ##");
         System.out.println("\t AA  ##  ##");
         System.out.println("\t 1   2   3");
      }
      if(randNum == 2 && numGuess == randNum)
      {
         System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
         System.out.println("\t ##  AA  ##");
         System.out.println("\t ##  AA  ##");
         System.out.println("\t 1   2   3");
      }
      
      if(randNum == 3 && numGuess == randNum)
      {  
         System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
         System.out.println("\t ##  ##  AA");
         System.out.println("\t ##  ##  AA");
         System.out.println("\t 1   2   3");
      }
      
      if(randNum == 1 && numGuess != randNum)
      {
         System.out.println("Ha! Fast Eddie wins again! The ace was card number 1.");
         System.out.println("\t AA  ##  ##");
         System.out.println("\t AA  ##  ##");
         System.out.println("\t 1   2   3");  
      }
      
      if(randNum == 2 && numGuess != randNum)
      {
         System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.");
         System.out.println("\t ##  AA  ##");
         System.out.println("\t ##  AA  ##");
         System.out.println("\t 1   2   3");  
      }
      
      if(randNum == 3 && numGuess != randNum)
      {
         System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.");
         System.out.println("\t ##  ##  AA");
         System.out.println("\t ##  ##  AA");
         System.out.println("\t 1   2   3");  
      }
   }
}
