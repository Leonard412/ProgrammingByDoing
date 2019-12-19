import java.util.Scanner;

public class AddingValuesForLoop
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Number: ");
      
      int sum = 0;
      int randNum = keyboard.nextInt();
      
      for(int num = 1; num <= randNum; num = num + 1)
      {
         System.out.print(num + " ");
         sum = sum + num;
      }
      System.out.println("\nThe sum is " + sum);
   }
}