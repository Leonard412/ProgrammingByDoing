import java.util.Scanner;

public class SpaceBoxing
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      double Venus, Mars, Jupiter, Saturn, Uranus, Neptune;
      int weight;
      int planetSelect;
      Venus = 0.78;
      Mars = 0.39;
      Jupiter = 2.65;
      Saturn = 1.17;
      Uranus = 1.05;
      Neptune = 1.23;
      
      System.out.print("Please enter your current earth weight: ");
      weight = keyboard.nextInt();
      
      System.out.println("I have information for the following planets: ");
      System.out.println("1. Venus  2. Mars   3. Jupiter");
      System.out.println("4. Saturn 5. Uranus 6. Neptune");
      planetSelect = keyboard.nextInt();
      
      if(planetSelect == 1)
      {
         System.out.println("Your weight would be " + (weight * Venus) + " on that planet");
      }
      else if(planetSelect == 2)
      {
         System.out.println("Your weight would be " + (weight * Mars) + " on that planet");
      }
      else if(planetSelect == 3)
      {
         System.out.println("Your weight would be " + (weight * Jupiter) + " on that planet");
      }
      else if(planetSelect == 4)
      {
         System.out.println("Your weight would be " + (weight * Saturn) + " on that planet");
      }
      else if(planetSelect == 5)
      {
         System.out.println("Your weight would be " + (weight * Uranus) + " on that planet");
      }
      else if(planetSelect == 6)
      {
         System.out.println("Your weight would be " + (weight * Neptune) + " on that planet");
      }
      else
      {
         System.out.println("That is not a correct response.");
      }
      
   }

}
