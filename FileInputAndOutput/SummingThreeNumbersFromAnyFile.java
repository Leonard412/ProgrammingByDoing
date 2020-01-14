import java.util.Scanner;
import java.io.*;

public class SummingThreeNumbersFromAnyFile
{
   public static void main(String[] args) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      
      String choice;
      
      System.out.print("Which file would you like to read numbers from: ");
      choice = keyboard.next();
      
      Scanner fileIn = new Scanner(new File(choice));
      int firstNum = fileIn.nextInt();
      int secondNum = fileIn.nextInt();
      int thirdNum = fileIn.nextInt();
      int sum = firstNum + secondNum + thirdNum;

      System.out.println("Reading numbers from file " + choice + " ... done.\n");
      System.out.println(firstNum + " + " + secondNum + " + " + thirdNum + " = " + sum);
   }
}