public class FindingPrimeNumbers
{
   public static void main(String[] args)
   {
      for(int i = 2; i <= 20; i++)
      {
         System.out.print(i + " ");
         
         if(isPrime(i))
            System.out.print("<");
            
         System.out.println();
      }
   }
   
   public static boolean isPrime(int n)
   {
      for(int x = 2; x < n; x++)
      {
         if(n % x == 0)
            return false; //If number is divisible then its not a prime number
      }
      return true; //if no divisible found then the number is prime
   }  

}