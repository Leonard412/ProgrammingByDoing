import java.util.Scanner;
import java.io.*;

public class SummingSeveralNumbersFromAnyFile
{
   public static void main(String[] args) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Which file would you like to read numbers from: ");
      String choice = keyboard.next();
      System.out.println("Reading numbers from \"" + choice + "\"");
      
      File in = new File(choice);
      Scanner input = new Scanner(in);
      int total = 0;
         while(input.hasNext() )
         {
            int num = input.nextInt();
            System.out.print(num + " ");
            total = num + total;
         }
      System.out.println("\nTotal is " + total + "\n");
      input.close();
   }
}