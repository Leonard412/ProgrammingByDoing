import java.util.Scanner;

public class Nim
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String player1;
      String player2;
      String choice;
      String winner = "";
      
      int counterA = 3;
      int counterB = 4;
      int counterC = 5;
      int removal;
      
      System.out.print("Player 1, enter your name: ");
      player1 = keyboard.next();
      System.out.print("Player 2, enter your name: ");
      player2 = keyboard.next();
      
      while(counterA + counterB + counterC >= 1)
      {
         System.out.println("A: " + counterA + "   B: " + counterB + "  C: " + counterC);
         System.out.print(player1 + ", choose a pile: ");
         choice = keyboard.next();
         System.out.print("How many to remove from " + choice + ": ");
         removal = keyboard.nextInt();
         if(choice.equalsIgnoreCase("a"))
         {
            if(removal > counterA)
            {
               System.out.print("Pile A doesn't have that many. Try again: ");
               removal = keyboard.nextInt();
            }
            if(removal < 1)
            {
               System.out.print("You must choose at least 1. How many? ");
               removal = keyboard.nextInt();
            }
            counterA = counterA - removal;
         }
         if(choice.equalsIgnoreCase("b"))
         {
            if(removal > counterB)
            {
               System.out.print("Pile B doesn't have that many. Try again: ");
               removal = keyboard.nextInt();
            }
            if(removal < 1)
            {
               System.out.print("You must choose at least 1. How many? ");
               removal = keyboard.nextInt();
            }
            counterB = counterB - removal;
         }
         if(choice.equalsIgnoreCase("c"))
         {
            if(removal > counterC)
            {
               System.out.print("Pile C doesn't have that many. Try again: ");
               removal = keyboard.nextInt();
            }
            if(removal < 1)
            {
               System.out.print("You must choose at least 1. How many? ");
               removal = keyboard.nextInt();
            }
            counterC = counterC - removal;
         }
         
         if((counterA + counterB + counterC) == 1)
         {
            winner = player2;
            System.out.println(player2 + ", you must take the last remaining counter, so you lose. " + player1 + " wins!");
            break;
         }
         System.out.println("A: " + counterA + "   B: " + counterB + "  C: " + counterC);
         System.out.print(player2 + ", choose a pile: ");
         choice = keyboard.next();
         System.out.print("How many to remove from " + choice + ": ");
         removal = keyboard.nextInt();
         if(choice.equalsIgnoreCase("a"))
         {
            if(removal > counterA)
            {
               System.out.print("Pile A doesn't have that many. Try again: ");
               removal = keyboard.nextInt();
            }
            if(removal < 1)
            {
               System.out.print("You must choose at least 1. How many? ");
               removal = keyboard.nextInt();
            }
            counterA = counterA - removal;
         }
         if(choice.equalsIgnoreCase("b"))
         {
           if(removal > counterB)
            {
               System.out.print("Pile B doesn't have that many. Try again: ");
               removal = keyboard.nextInt();
            }
            if(removal < 1)
            {
               System.out.print("You must choose at least 1. How many? ");
               removal = keyboard.nextInt();
            }
            counterB = counterB - removal;
         }
         if(choice.equalsIgnoreCase("c"))
         {
            if(removal > counterC)
            {
               System.out.print("Pile C doesn't have that many. Try again: ");
               removal = keyboard.nextInt();
            }
            if(removal < 1)
            {
               System.out.print("You must choose at least 1. How many? ");
               removal = keyboard.nextInt();
            }
            counterC = counterC - removal;
         }
         if((counterA + counterB + counterC) == 1)
         {
            winner = player1;
            System.out.println(player1 + ", you must take the last remaining counter, so you lose. " + player2 + " wins!");
            break;
         }
      }
      int counterTotal = counterA + counterB + counterC;
      if(counterTotal <= 0)
      {
         System.out.println(winner + ", there are no counters left, so you WIN!");
      }
   }
}
