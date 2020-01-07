import java.util.*;

public class DumbCalculator
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      double firstNum;
      double secondNum;
      double thirdNum;
      
      System.out.print("What is your first number? ");
      firstNum = keyboard.nextDouble();
      
      System.out.print("What is your second number? ");
      secondNum = keyboard.nextDouble();
      
      System.out.print("What is your third number? ");
      thirdNum = keyboard.nextDouble();
      
      double total = (firstNum + secondNum + thirdNum) /2;
      
      System.out.println("(" + firstNum + " + " + secondNum + " + " + thirdNum + " ) " + " / 2 is..." + total);
   
   
   }




}
