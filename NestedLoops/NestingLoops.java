public class NestingLoops
{
   public static void main(String[] args)
   {
      //This is #1 - I'll call is "CN"
      // Inner loop is "faster" because it cycles through itself and then the outer loop
      // 2. If the loops are swapped the number moves "slower" and the char moves "faster"
      for(char c = 'A'; c <= 'E'; c++)
      {
         for(int n=1; n <= 3; n++)
         {
            System.out.println(c + " " + n);
         }
      }
      
      System.out.println("\n");
      
      //This is #2 - I'll call it "AB"
      for(int a=1; a <= 3; a++)
      {
         for(int b=1; b <= 3; b++)
         {
            //3. if changed to println it will show on 9 lines instead of 1 long line
            System.out.print(a + "-" + b + " ");
         }
         //You will add a line of code here.
         //4. This line will run after the 2nd loop has finished
         System.out.println();
      }
      System.out.println("\n");
   }
}