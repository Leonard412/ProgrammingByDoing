import java.util.*;

public class CollatzSequence
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Starting number: ");
      
      int startNum = keyboard.nextInt();
      int even = startNum / 2;
      int odd = (startNum * 3) + 1;
      String evenOrOdd = "odd";
      
      if(startNum % 2 == 0)
      {
         evenOrOdd = "even";
         
      }
      
      else if(startNum % 2 != 0)
      {
         evenOrOdd = "odd";
      }
      
      while (startNum >= 1)
         
         if(startNum % 2 == 0)
         {
            System.out.print(startNum);
            System.out.print("    ");
            even = startNum / 2;
            startNum = even;
            
               if(startNum == 1)
               {
                  System.out.print;
               }
         }
         
         else if (startNum % 2 != 0)
         {
            System.out.print(startNum);
            System.out.print("    ");
            odd = (startNum * 3) + 1;
            startNum = odd;
            
               if(startNum == 1)
               {
                  System.exit(0);
               }
         }
         
         System.out.println();
      
   }
}