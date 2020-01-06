public class NoticingEvenNumbers
{
   public static void main(String[] args)
   {
      for(int num = 0; num <= 20; num = num + 1)
      {
         if(num % 2 == 0)
            System.out.println(num + " <");
         else
            System.out.println(num);
      }
   }
}
