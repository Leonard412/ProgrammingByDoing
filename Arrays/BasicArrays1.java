public class BasicArrays1
{
   public static void main(String[] args)
   {
      int a[] = new int[10];
      
      for(int i = 0; i < a.length; i++)
      {
         a[i] = 113;
         System.out.println("Slot " + i + " contains a " + a[i] );
      }
   }
}