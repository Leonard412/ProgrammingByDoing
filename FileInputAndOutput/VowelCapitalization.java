import java.util.Scanner;
import java.io.*;

public class VowelCapitalization
{
   public static void main(String[] args) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      String choice;
      
      System.out.print("Open which file: ");
      choice = keyboard.next();
      
      File in = new File(choice);
      Scanner input = new Scanner(in);
      
      while(input.hasNext() )
      {
         String line = input.nextLine();
         
         for(int i=0; i < line.length(); i++)
         {
            char c = line.charAt(i);
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            {
               System.out.print(Character.toUpperCase(c) );
            }
            else
               System.out.print(c);
         }
         System.out.println();
      }
   }
}