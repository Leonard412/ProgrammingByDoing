import java.util.Scanner;
import java.io.*;

public class HighScore
{
   public static void main(String[] args) throws IOException
   {
      File score = new File("Score.txt");
      FileWriter fw = new FileWriter(score);
      PrintWriter pw = new PrintWriter(fw);
      Scanner keyboard = new Scanner(System.in);
      
      String name;
      int highScore;
      
      System.out.println("You got a high score!");
      
      System.out.print("\n\nPlease enter your score: ");
      highScore = keyboard.nextInt();
      System.out.print("Please enter your name: ");
      name = keyboard.next();
      System.out.println("Data stored into score.txt");
      
      pw.println(highScore);
      pw.println(name);
      pw.close();
   }
}