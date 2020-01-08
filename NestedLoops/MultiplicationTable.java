public class MultiplicationTable
{
   public static void main(String[] args)
   {
      System.out.println("x | 1  2  3  4  5  6  7  8  9 ");
      System.out.println("==+==============================");
      
      for(int i = 1; i < 13; i++)
      {
            
         for(int j = 1; j < 10; j++)
         {
            System.out.print((i*j) + "\t"); 
         }
         System.out.println();
      }
   }
}