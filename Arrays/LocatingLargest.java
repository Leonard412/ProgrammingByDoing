import java.util.Random;

public class LocatingLargest
{
   public static void main(String[] args)
   {
      Random r = new Random();
      int arr[] = new int[10];
      int largest = arr[0];
      int slot = 0;
      
      System.out.print("Array: ");
      for(int i = 0; i < arr.length; i++)
      {
         arr[i] = 1 + r.nextInt(100);
         System.out.print(arr[i] + " ");
      }
      
      for(int i = 0; i < arr.length; i++)
      {
         if(largest < arr[i])
         {
            largest = arr[i];
            slot = i;
         }
      }
      System.out.println();
      System.out.println("The largest value is " + largest + ".");
      System.out.println("It is found in slot " + slot + ".");
   }
}