import java.util.Scanner;

public class Refresher
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name;
      
      System.out.print("What is your name: ");
      name = keyboard.next();
      
      if(name.equalsIgnoreCase("Mitchell") )
      {
         for(int i = 0; i < 5; i++)
         {
            System.out.println(name);
         }
      }
      else
      {
         for(int i = 0; i < 10; i++)
         {
            System.out.println(name);
         }
      }
   }
}