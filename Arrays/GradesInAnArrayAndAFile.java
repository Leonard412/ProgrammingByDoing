import java.util.*;
import java.io.*;

public class GradesInAnArrayAndAFile
{
   public static void main(String[] args) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      int a[] = new int[5];
      String choice;
      String fname;
      String lname;
      
      System.out.print("Name (first, last): ");
      fname = keyboard.next();
      lname = keyboard.next();
      System.out.print("\nFilename: ");
      choice = keyboard.next();
      
      FileWriter fw = new FileWriter(choice);
      fw.write(fname+ " " + lname);
      fw.write("\n");
      System.out.println();
      System.out.println("Here are your randomly-selected grades (hope you pass): ");
      
      for(int i = 0; i < a.length; i++)
      {
         a[i] = 1 + r.nextInt(100);
         fw.write(a[i] + " ");
         System.out.println("Grade " + (i + 1) + ": " + a[i]);
      }
      
      fw.close();
      System.out.println("Data saved in " + "\"" + choice + "\"" + ".");
   }
}