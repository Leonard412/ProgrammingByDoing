import java.util.*;

public class TwoMoreQuestions
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String answer;
      String answer2;
      
      System.out.println("TWO MORE QUESTIONS, BABY!");
      
      System.out.println("Think of something and I'll try to guess it!");
      
      System.out.print("Question 1) Does it stay inside or outside or both? ");
      answer = keyboard.next();
      
      System.out.print("Question 2) Is it a living thing? ");
      answer2 = keyboard.next();
      
      if(answer.equalsIgnoreCase("outside") && answer2.equalsIgnoreCase("no"))
      {
         System.out.println("Clearly you're thinking of a billboard.");
      }
      
      if(answer.equalsIgnoreCase("outside") && answer2.equalsIgnoreCase("yes"))
      {
         System.out.println("I definitely believe you're thinking of a deer.");
      }
      
      if(answer.equalsIgnoreCase("inside") && answer2.equalsIgnoreCase("no"))
      {
         System.out.println("My guess is that you're thinking of a television.");
      }
      
      if(answer.equalsIgnoreCase("inside") && answer2.equalsIgnoreCase("yes"))
      {
         System.out.println("Could you be thinking of a houseplant?.");
      }
      
      if(answer.equalsIgnoreCase("both") && answer2.equalsIgnoreCase("no"))
      {
         System.out.println("You're definitely thinking of a cell phone!");
      }
      
      if(answer.equalsIgnoreCase("both") && answer2.equalsIgnoreCase("yes"))
      {
         System.out.println("This one's easy! You're thinking of a dog!");
      }
   }
}