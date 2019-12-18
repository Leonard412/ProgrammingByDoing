import java.util.Scanner;

public class CountingMachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Count to: ");
      int count = keyboard.nextInt();
      
      for(int num = 0; num <= count; num = num + 1)
      {
         System.out.print(num + " ");
      }
   }
}