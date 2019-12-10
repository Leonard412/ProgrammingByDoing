import java.util.Scanner;

public class TwentyQuestions
{
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);   
      
      String response;
      
      System.out.println("TWO QUESTIONS!");
      System.out.println("Think of an object, and I'll try to guess it.");
      
      System.out.println("Question 1) Is it animal, vegetable, or mineral?");
      response = keyboard.next();
      
      if(response.equalsIgnoreCase("animal"))
      {
         System.out.println("Question 2) Is it bigger than a breadbox?");
         response = keyboard.next();
         
         if(response.equalsIgnoreCase("yes"))
         {
            System.out.println("My guess is that you are thinking of a Tiger.");
            System.out.println("I would ask you if I'm right, but frankly I don't care.");
         }
         
         else
         {
            System.out.println("My guess is that you are thinking of a Gerbil.");
            System.out.println("I would ask you if I'm right, but I really don't care.");
         }
      }
      
      else if(response.equalsIgnoreCase("vegetable"))
      {
         System.out.println("Question 2) Is it bigger than a breadbox?");
         response = keyboard.next();
         
         if(response.equalsIgnoreCase("yes"))
         {
            System.out.println("My guess is that you're thinking of a watermelon.");
            System.out.println("I would aks you if I'm right, but I have more important things to do.");
         }
         
         else
         {
            System.out.println("My guess is that you are thinking of a carrot.");
            System.out.println("I would ask you if I'm right, but I'd rather play my Nintendo Switch.");
         }
      
      }
      
      else if(response.equalsIgnoreCase("mineral"))
      {
         System.out.println("Question 2) Is it bigger than a breadbox?");
         response = keyboard.next();
         
         if(response.equalsIgnoreCase("yes"))
         {
            System.out.println("My guess is that you are thinking of a Camaro");
            System.out.println("I would ask you if I'm right, but I'd rather wash my Hummer");
         }
         
         else
         {
            System.out.println("My guess is that you are thinking of a pebble");
            System.out.println("I would ask you if I'm right, but I have other stones to toss.");
         }
      }
   
   }
}