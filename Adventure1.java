import java.util.*;

public class Adventure1
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String decision;
      
      System.out.println("WELCOME TO LEO'S TINY ADVENTURE!");
      
      System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
      decision = keyboard.next();
      
      if(decision.equalsIgnoreCase("kitchen"))
      {
         System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, "
         + "a refrigerator.\n You may open the \"refrigerator\" or look in a \"cabinet\". ");
         
         decision = keyboard.next();
         
         if(decision.equalsIgnoreCase("refrigerator"))
         {
            System.out.println("Inside the refrigerator you see \"food\" and other questionable things. It looks pretty nasty. "
            + "Would you like to eat some of the food? (\"yes\" or \"no\")");
         }
         
         decision = keyboard.next();
            if(decision.equalsIgnoreCase("yes"))
            {
               System.out.println("Your entire body turns purple as you feel your last breaths escaping your body. You die quickly.");
            }
            
            if(decision.equalsIgnoreCase("no"))
            {
               System.out.println("You die of starvation... eventually.");
            }
            
         if(decision.equalsIgnoreCase("cabinet"))
         {
            System.out.println("You open the kitchen door and a mutated rat stares back at you. Would you like to take it? "
            + "(\"yes\" or \"no\")");
         }
         
         decision = keyboard.next();
         
            if(decision.equalsIgnoreCase("yes"))
            {
               System.out.println("The rat happily accepts your camaraderie. It becomes your lifelong bodyguard.");
            }
            
            if(decision.equalsIgnoreCase("no"))
            {
               System.out.println("The rat takes offense at your gesture and lunges at you, killing you immediately.");
            }
      }
      
      if(decision.equalsIgnoreCase("upstairs"))
      {
         System.out.println("Upstairs, you see a hallway. At the end of the hallway is the master \"bedroom\". There is also" 
         + " a \"bathroom\" off the hallway. \n Where would you like to go?");
         
         decision = keyboard.next();
         
         if(decision.equalsIgnoreCase("bedroom"))
         {
            System.out.println("Inside the bedroom is an extravegent setup with an unmade bed. In the back of the bedroom is a"
            + " closet door slightly opened. Would you like to open the door? (\"yes\" or \"no\") ");
         }
         
         decision = keyboard.next();
         
            if(decision.equalsIgnoreCase("yes"))
            {
               System.out.println("You open the closet door to find an extremely long dim-lit hallway. At the end of the "
               + "hallway is a unsettling silhouette. As you slowly walk backwards the figure rushes at you and thus killing you. ");
            }
            
            if(decision.equalsIgnoreCase("no"))
            {
               System.out.println("You decide it's none of your business and leave the building.");
            }
            
         if(decision.equalsIgnoreCase("bathroom"))
         {
            System.out.println("Inside the bathroom everything appears ordinary except for the unsettling mirror. "
            + "Inside of the mirror you see \n yourself but much angrier and holding a weapon. Your reflection "
            + "then lunges out of the mirror and kills you...");
         }
      }
   }

}