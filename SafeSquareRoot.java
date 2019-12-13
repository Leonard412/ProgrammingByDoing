import java.util.*;

public class SafeSquareRoot
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int num;
      
      System.out.println("SQUARE ROOT!");
      System.out.print("Enter a number: ");
      num = keyboard.nextInt();
      
      if(num < 0)
      {
         do
         {
            System.out.println("You can't take the square root of a negative nummber, silly.");
            System.out.print("Try again: ");
            num = keyboard.nextInt();
         }
         while(num < 0);
      }
      
      System.out.println("The square root of " + num + " is " + Math.sqrt(num) + ".");
      
   }
}