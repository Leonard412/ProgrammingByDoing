import java.util.Scanner;
import java.io.*;

public class DisplayingAFile
{
   public static void main(String[] args) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Open which file: ");
      String choice = keyboard.next();
      
      File in = new File(choice);
      Scanner input = new Scanner(in);
         while(input.hasNext() )
         {
            System.out.println(input.nextLine() );
         }

   }
}