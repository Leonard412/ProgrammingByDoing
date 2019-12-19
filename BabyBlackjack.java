import java.util.Random;

public class BabyBlackjack
{
   public static void main(String[] args)
   {
      Random r = new Random();
      
      int card1 = 1 + r.nextInt(10);
      int card2 = 1 + r.nextInt(10);
      int card3 = 1 + r.nextInt(10);
      int card4 = 1 + r.nextInt(10);
      int playerTot = card1 + card2;
      int dealerTot = card3 + card4;
      
      System.out.println("You drew " + card1 + " and " + card2 + ".");
      System.out.println("Your total is " + playerTot);
      
      System.out.println("Your dealer has " + card3 + " and " + card4 + ".");
      System.out.println("Dealer's total is " + dealerTot);
      
      if(playerTot > dealerTot)
         System.out.println("YOU WIN!");
         
      else
         System.out.println("You lose."); 
   }
}