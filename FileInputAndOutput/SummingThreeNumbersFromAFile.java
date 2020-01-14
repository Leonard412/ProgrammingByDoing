import java.util.Scanner;
import java.io.*;

public class SummingThreeNumbersFromAFile
{
   public static void main(String[] args) throws Exception
   {
      Scanner fileIn = new Scanner(new File("3nums.txt"));
      int firstNum = fileIn.nextInt();
      int secondNum = fileIn.nextInt();
      int thirdNum = fileIn.nextInt();
      int sum = firstNum + secondNum + thirdNum;
      
      System.out.println("Reading numbers from file \"3nums.txt\"... done.");
      System.out.println(firstNum + " + " + secondNum + " + " + thirdNum + " = " + sum);
   }  
}