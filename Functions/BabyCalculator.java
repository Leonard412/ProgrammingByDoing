import java.util.Scanner;

public class BabyCalculator
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int a,b,c;
      String op;
      
      do
      {
         System.out.print("> ");
         a = keyboard.nextInt();
         op = keyboard.next();
         b = keyboard.nextInt();
         
         if(a == 0)
         {
            System.out.println("Bye, now.");
            break;
         }
         
         if(op.equals("+") )
            c = a + b;
         else if(op.equals("-") )
            c = a - b;
         else if(op.equals("/") )
            c = a / b;
         else if(op.equals("*") )
            c = a * b;
         else
         {
            System.out.println("Undefined operator: '" + op + "'." );
            c = 0;
         }
         System.out.println(c);
      } while(a != 0);
   }
}