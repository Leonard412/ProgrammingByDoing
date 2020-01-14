import java.util.Random;

public class CopyingArrays
{
   public static void main(String[] args)
   {
      Random r = new Random();
      int arr1[] = new int[10];
      int arr2[] = new int[10];
      
      System.out.print("Array 1: ");
      for(int i = 0; i < arr1.length; i++) 
      {
         arr1[i] = 1 + r.nextInt(100);
         System.out.print(arr1[i] + " ");
      }
      
      arr1[arr1.length - 1] = -7;
      arr2 = arr1;
      System.out.println();

      System.out.print("Array 2: ");
      
      for(int j = 0; j < arr2.length; j++)
      {
         System.out.print(arr2[j] + " ");
      }
   }
}