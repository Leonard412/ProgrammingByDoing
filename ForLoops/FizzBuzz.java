public class FizzBuzz
{
   public static void main(String[] args)
   {
      String Fizz = "Fizz";
      String Buzz = "Buzz";
      String FizzBuzz = "FizzBuzz";
      for(int num = 1; num <= 100; num = num + 1)
      {   
         if(num % 3 == 0)
         {
            System.out.println(Fizz);
         }
         else if(num % 5 == 0)
         {
            System.out.println(Buzz);
         }
         else if(num % 3 == 0 && num % 5 == 0)
         {
            System.out.println(FizzBuzz);
         }
         else
         {
            System.out.println(num);
         }
      }
   }
}
