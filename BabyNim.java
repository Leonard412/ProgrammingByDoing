import java.util.Scanner;

public class BabyNim
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int counterA = 3;
      int counterB = 3;
      int counterC = 3;
      String choice;
      int removal;
      
      while(counterA > 0 || counterB > 0 || counterC > 0)
      {
         System.out.println("A: " + counterA + "    B: " + counterB + "    C: " + counterC);
         System.out.print("Choose a pile: ");
         choice = keyboard.next();
         System.out.print("How many to remove from pile " + choice + ": ");
         removal = keyboard.nextInt();
         if(choice.equalsIgnoreCase("a"))
         {
            counterA = counterA - removal;
         }
         if(choice.equalsIgnoreCase("b"))
         {
            counterB = counterB - removal;
         }
         if(choice.equalsIgnoreCase("c"))
         {
            counterC = counterC - removal;
         }
      }
      if(counterA <= 0 && counterB <= 0 && counterC <= 0)
      System.out.println("All piles are empty. Good job!");   
   }
}