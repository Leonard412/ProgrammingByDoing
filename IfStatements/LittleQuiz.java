import java.util.*;

public class LittleQuiz
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String decision;
      int selection;
      int score = 0;
      
      
      do
      {
         System.out.print("Are you ready for a quiz? (Y/N) ");
         decision = keyboard.next();
      
         System.out.println("Okay, here it comes!");
         
         System.out.println("Q1) What is the capital of Alaska?");
         System.out.println("       1) Melbourne");
         System.out.println("       2) Anchorage");
         System.out.println("       3) Juneau");
         
         selection = keyboard.nextInt();
         
            if(selection == 3)
            {
               System.out.println("That's right!");
               score++;
            }
            
            else
            {
               System.out.println("Nah fam you're wrong...");
            }
         
         System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
         System.out.println("    1) Yes");
         System.out.println("    2) No");
         
         selection = keyboard.nextInt();
         
            if(selection == 2)
            {
               System.out.println("Yes that's right!");
               score++;
            }
            
            else
            {
               System.out.println("No sirree!");
            }
            
          System.out.println("Q3) What is the result of 9+6/3?");
          System.out.println("      1) 5");
          System.out.println("      2) 11");
          System.out.println("      3) 15/3");
          
          selection = keyboard.nextInt();
          
            if(selection == 2)
            {
               System.out.println("You are correct!");
               score++;
            }
            
            else
            {
               System.out.println("That ain't it chief...");
            }
            
            System.out.println("Overall, you got " + score + " out of 3 correct.");
            System.out.print("Thanks for playing!");
      }
      while(decision.equals("Yes"));
   
   }

}
