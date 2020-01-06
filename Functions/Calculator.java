import java.util.*;

public class Calculator
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String op;
      double a,b;
      double total;
      while(true)
      {
         System.out.print("> ");
         a = keyboard.nextDouble();
         
         if(a == 0)
         {
            System.out.println("Bye, now.");
            break;
         }
         op = keyboard.next();
         b = keyboard.nextDouble();
         total = Balculate(a,b,op);
         
      }

   }
   
   public static double Balculate(double a, double b, String op)
   {
      double c;
      
      if(op.equals("+") )
      {
         c = a + b;
         System.out.println(c);
      }
      else if(op.equals("-") )
      {
         c = a - b;
         System.out.println(c);
      }
      else if(op.equals("/") )
      {
         c = a / b;
         System.out.println(c);
      }
      else if(op.equals("*") )
      {
         c = a * b;
         System.out.println(c);
      }
      else if(op.equals("^") )
      {
         c = Math.pow(a,b);
         System.out.println(c);
      }
      else if(op.equals("%") )
      {
         c = a % b;
         System.out.println(c);
      }
      else
      {
         System.out.println("Undefined operator: '" + op + "'." );
         c = 0;
      }
      return c;
   }
}