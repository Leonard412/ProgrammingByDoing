import java.util.*;

public class HowManyTimes
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      int a[] = new int[10];
      int occurance = 0;
      int value;
      
      System.out.print("Array: ");
      for(int i = 0; i < a.length; i++)
      {
         a[i] = 1 + r.nextInt(50);
         System.out.print(a[i] + " ");
      }
      System.out.print("\nValue to find: ");
      value = keyboard.nextInt();
      System.out.println();
      
      for(int i = 0; i < a.length; i++)
      {
         if(a[i] == value)
            occurance++;
      }
      System.out.println(value + " was found " + occurance + " times.");
   }
}