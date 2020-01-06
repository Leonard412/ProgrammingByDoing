import java.util.Scanner;

public class Refresher2
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name;
      int loop = 10;
      
      System.out.print("Enter your name: ");
      name = keyboard.next();
      
      if(name.equalsIgnoreCase("Mitchell") )
      {
         loop = 5;
      }
      
      for(int i = 0; i < loop; i++)
      {
         System.out.println(name);
      }
      
   }
}