import java.util.Scanner;
import java.io.*;

public class LittlePuzzle
{
   public static void main(String[] args) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      
      String choice;
      //Input the file name
      System.out.print("Open which file: ");
      choice = keyboard.next();
      
      System.out.println();
      //Read file mentioned above
      File in = new File(choice);
      Scanner input = new Scanner(in);
      
      //Display the string from the file
      String text = input.nextLine();
      input.close();
      
      //change the text from above to display every 3rd character
      for(int i = 0; i < text.length(); i++)
      {
         if( (i+1) % 3 == 0)
            System.out.print(text.charAt(i) );
      }
      System.out.println(); 
   }
}

