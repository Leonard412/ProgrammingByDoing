import java.util.Random;
import java.util.Scanner;

public class BlackJack
{
   public static void main(String[] args)
   {
      Random r = new Random();
      Scanner keyboard = new Scanner(System.in);
      
      String response;
      
      int card1 = 2 + r.nextInt(11);//initialize all variables
      int card2 = 2 + r.nextInt(11);
      int card3 = 2 + r.nextInt(11);
      int card4 = 2 + r.nextInt(11);
      int playerTot = card1 + card2;//player total
      int dealerTot = card3 + card4;//dealer total
      
      System.out.println("Welcome to Mitchell's blackjack program!");
      System.out.println("You get a " + card1 + " and a " + card2 + ".");
      System.out.println("Your total is " + playerTot + ".\n");
      
      if(playerTot > 21) //rare chance the player draws 2 11s
      {
         System.out.println("You busted. Dealer Wins.");
         System.exit(0); //ends the program
      }
      
      System.out.println("The dealer has a " + card3 + " showing, and a hidden card.");
      System.out.println("His total is hidden, too\n");
      
      System.out.print("Would you like to \"hit\" or \"stay\"? ");
      response = keyboard.next();
      
      while(response.equalsIgnoreCase("hit") && playerTot <= 21) //allows the player to keep hitting until bust
      {
         card1 = 2 + r.nextInt(11);
         System.out.println("You drew a " + card1);
         playerTot = playerTot + card1; //increases the old total with a new one
         System.out.println("Your total is " + playerTot + ".");
         if(playerTot > 21)
            {
              System.out.println("You busted. Dealer Wins.");
              System.exit(0);
            }
         
            System.out.print("Would you like to \"hit\" or \"stay\"? ");
            response = keyboard.next();

            if(response.equalsIgnoreCase("stay"))
            {
               break;
            }            
       }
       if(response.equalsIgnoreCase("stay"))
       {
         System.out.println("\nOkay, dealer's turn.");
         System.out.println("His hidden card was a " + card4 + ".");
         System.out.println("His total is " + dealerTot + ".");
         
         while(dealerTot <= 16)//Gives the dealer some form of intelligence to decide to hit or stay
         {
            System.out.println("\nDealer chooses to hit.");
            card3 = 2 + r.nextInt(11);
            System.out.println("He draws a " + card3 + ".");
            dealerTot = dealerTot + card3;
            System.out.println("His total is " + dealerTot);
            
            if(dealerTot == 20 || dealerTot == 21) //Dealer wins all ties
            {
               System.out.println("Dealer stays");
               break;
            }
            
            if(dealerTot > 21)
            {
              System.out.println("The dealer busted. You Win!");
              System.exit(0);
            }
         }
         
       }
       System.out.println("\nDealer total is " + dealerTot + ".");
       System.out.println("Your total is " + playerTot + ".");
       
       
       if(playerTot > dealerTot)
         System.out.println("YOU WIN!");
         
      else
         System.out.println("You lose.");

      if(playerTot == dealerTot)
         System.out.println("It's a tie! Dealer wins.");
   }
}