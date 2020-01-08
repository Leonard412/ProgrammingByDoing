public class ArmstrongNumbers
{
   public static void main(String[] args)
   {
      for(int i = 1; i <= 9; i++)
      {
         for(int j = 0; j < 10; j++)
         {
            for(int k = 0; k < 10; k++)
            {
               if( (Math.pow(i,3) + Math.pow(j,3) + Math.pow(k,3)) == ( (i * 100) + (j * 10) + k) )
                  System.out.println((i * 100) + (j * 10) + k);
            }
         }
      }
   }
}