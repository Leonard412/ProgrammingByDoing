import java.util.Scanner;

public class AreaCalculator
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int selection;
      
      System.out.println("Shape Area Calculator version 0.1 (c) 2005 Hawk Sample Output, Inc.");
      
      while(true)
      {
         System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");     
         System.out.println("1) Triangle");
         System.out.println("2) Rectangle");
         System.out.println("3) Square");
         System.out.println("4) Circle");
         System.out.println("5) Quit");
         System.out.print("Which shape: "); 
         selection = keyboard.nextInt();

         if(selection == 1)
         {
            System.out.print("\nBase: ");
            int base = keyboard.nextInt();
            System.out.print("Height: ");
            int height = keyboard.nextInt();
            System.out.println("The area is " + area_triangle(base,height) );
         }
         else if(selection == 2)
         {
            System.out.print("\nLength: ");
            int length = keyboard.nextInt();
            System.out.print("Width: ");
            int width = keyboard.nextInt();
            System.out.println("The area is " + area_rectangle(length,width) );
         }
         else if(selection == 3)
         {
            System.out.print("\nSide length: ");
            int sideLength = keyboard.nextInt();
            System.out.println("The area is " + area_square(sideLength) );
         }
         else if(selection == 4)
         {
            System.out.print("\nRadius: ");
            int radius = keyboard.nextInt();
            System.out.println("The area is " + area_circle(radius) );
         }
         else if(selection == 5)
         {
            System.out.println("Goodbye.");
            System.exit(0);
         }
      }
   }
   
   public static double area_circle(int radius)
   {
      double area;
      area = Math.PI * (radius * radius);
      
      return area;   
   }
   
   public static int area_rectangle(int length, int width)
   {
      int area;
      area = length * width;
      
      return area;
   }
   
   public static int area_square(int side)
   {
      int area;
      area = side * side;
      
      return area;
   }
   
   public static double area_triangle(int base, int height)
   {
      double area;
      area = .5 * (base * height);
      
      return area;
   }
}