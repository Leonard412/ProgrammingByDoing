import java.util.*;

public class WhereIsIt
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      int a[] = new int[10];
      int value;
      int occurance = 0;
      
      boolean found = false;
      
      System.out.print("Array: ");
      for(int i = 0; i < a.length; i++)
      {
         a[i] = 1 + r.nextInt(50);
         System.out.print(a[i] + " ");
      }
      
      System.out.print("\nValue to find: ");
      value = keyboard.nextInt();
      
      for(int i = 0; i < a.length; i++)
      {
         if(value == a[i] && ! found)
         {
            found = true;
            occurance = i;
         }
      }
      
      if(found)
      {
         System.out.println(value + " is in slot " + occurance + "." );
      }
      else
      {
         System.out.println(value + " is not in the array.");
      }
      
   }
}