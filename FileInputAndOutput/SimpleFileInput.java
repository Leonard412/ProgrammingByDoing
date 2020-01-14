import java.io.*;
import java.util.Scanner;

public class SimpleFileInput
{
   public static void main(String[] args) throws Exception
   {
      Scanner fileIn = new Scanner(new File("name.txt"));      
      String firstName = fileIn.next();
      String lastName = fileIn.next();
      
      System.out.println("Using my psychic powers (aided by reading data from the file), I have ");
      System.out.println("determined that your name is: " + firstName + " " + lastName);  
      System.out.println("Amazing, huh?");
   }
}