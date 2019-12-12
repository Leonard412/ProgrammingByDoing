import java.util.*;

public class Dice
{
   public static void main(String[] args)
   {
      Random r = new Random();
      
      int randNum1 = 1 + r.nextInt(6);
      int randNum2 = 1 + r.nextInt(6);
      
      System.out.println("HERE COMES THE DICE! \n");
      
      System.out.println("Roll #1: " + randNum1);
      System.out.println("Roll #2: " + randNum2);
      
      int randTotal = randNum1 + randNum2;
      
      System.out.println("The total is " + randTotal + "!");
      
   }
}