import java.util.Scanner;

public class NumberPuzzles2
{
   public static void main(String[] args)
   {
      int choice;
      
      while(true)
      {     
         choice = menuOptions();

         if(choice == 1)
            optionOne();
         else if(choice == 2)
            optionTwo();
         else if(choice == 3)
            break;
         
         else
            System.out.println("Invalid option. Please try again.");
      }
   }
   
   //This will generate a list of two digit numbers that are <= 56
   // and the sum of whose digits is > 10
   public static void optionOne()
   {
       for(int tens = 1; tens <= 5; tens++) //tens
      {
         for(int ones = 0; ones < 10; ones++) //ones
         {
            if( (tens + ones) > 10 && ( (tens * 10) + ones) <= 56)
               System.out.println(tens + "" + ones);
         }
      }
      System.out.println();
   }
   
   //Find a 2 digit number that the number minus the reverse is == to sum of digits
   public static void optionTwo()
   {
      for(int i = 1; i <= 5; i++)
      {
         for(int j = 0; j < 10; j++)
         {
            if( ((i * 10) + j) - ((j * 10) + (i))  == ((i) + j) )
               System.out.println((i * 10) + j + "\n");
         }
      }
   }
   
   public static int menuOptions()
   {
         Scanner keyboard = new Scanner(System.in);
         int choice;
         
         System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");  
         System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
         System.out.println("3) Quit");
         System.out.println("\n\n");
         System.out.print("> ");
         choice = keyboard.nextInt();
         
         return choice;
   }
}