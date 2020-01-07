import java.util.*;

public class ForgetfulMachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String firstWord;
      String secondWord;
      
      int numberOne;
      int numberTwo;
      
      System.out.println("Give me a word!");
      firstWord = keyboard.next();
      
      System.out.println("Give me a second word!");
      secondWord = keyboard.next();
      
      System.out.println("Great, now your favorite number?");
      numberOne = keyboard.nextInt();
      
      System.out.println("And your second-favorite number...");
      numberTwo = keyboard.nextInt();
      
      System.out.println("Whew! Wasn't that fun?");
   
   
   }
}
