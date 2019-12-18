import java.util.Scanner;

public class CountingMachineRevisted
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int countFrom;
      int countTo;
      int countBy;
      
      System.out.print("Count from: ");
      countFrom = keyboard.nextInt();
      
      System.out.print("Count to: ");
      countTo = keyboard.nextInt();
      
      System.out.print("Count by: ");
      countBy = keyboard.nextInt();
      
      for(int num = countFrom; num <= countTo; num = num + countBy)
      {
         System.out.print(num + " ");
      }
   }
}