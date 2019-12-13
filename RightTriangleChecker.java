import java.util.*;

public class RightTriangleChecker
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int firstSide;
      int secondSide;
      int thirdSide;
      double triangleTest;
      
      System.out.println("Enter three integers: ");
      System.out.print("Side 1: ");
      firstSide = keyboard.nextInt();
      
      do
      {
         System.out.print("Side 2: ");
         secondSide = keyboard.nextInt();
         
         if(secondSide < firstSide)
         {
            System.out.println(secondSide + " is smaller than " + firstSide + "." + " Try again.");
            System.out.print("Side 2: ");
            secondSide = keyboard.nextInt();
         }
      }while(secondSide < firstSide);
      
      do
      {
         
         System.out.print("Side 3: ");
         thirdSide = keyboard.nextInt();
         
         if (thirdSide < secondSide)
         {
            System.out.println(thirdSide + " is smaller than " + secondSide + "." + " Try again.");
            System.out.print("Side 3: ");
            thirdSide = keyboard.nextInt();
         }
      
      }
      while(thirdSide < secondSide);
      
      System.out.println("Your sides are " + firstSide + " " + secondSide + " " + thirdSide);
      
      triangleTest = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
      
      if(triangleTest == thirdSide)
      {
         System.out.println("These sides *do* make a right triangle. We lit!");
      }
      
      else
      {
         System.out.println("NO! These sides do not make a right triangle!");
      }
   }
}