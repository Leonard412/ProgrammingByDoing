import java.util.Scanner;

public class Adventure2
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String response = "";
      int nextRoom = 1;
      
      System.out.println("LEO'S TINY ADVENTURE 2");
      
      
      while(nextRoom != 0)
      {
         if(nextRoom == 1)
         {
            System.out.println("\nYou are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
            System.out.print("> ");
            response = keyboard.nextLine();
            if(response.equalsIgnoreCase("kitchen"))
               nextRoom = 2;
               
            else if(response.equalsIgnoreCase("upstairs"))
               nextRoom = 3;
            else
               System.out.println(response + " wasn't one of the options. Try again.");
         }
         
         if(nextRoom == 2)
         {
            System.out.println("There is a long countertop with dirty dishes everywhere. "
            + "Off to one side there is, as you'd expect, a refrigerator. \n" 
            + "You may open the \"refrigerator\", open the \"cabinet\" or go \"back\".");
            System.out.print("> ");
            response = keyboard.nextLine();
            if(response.equalsIgnoreCase("back"))
               nextRoom = 1;
            if(response.equalsIgnoreCase("refrigerator"))
            {
               System.out.println("The fridge contains some questionable looking \"food\"." 
               + " The door opening triggers a mechanism trapping you in the kitchen.\n "
               + "You die of hunger... eventually.");
               System.exit(0);
            }
            if(response.equalsIgnoreCase("cabinet"))
            {
               System.out.println("You see your old companion the mutated rat, eager to "
               + "join you for another journey. Do you accept? \"yes\" or \"no\"?");
               System.out.print("> ");
               response = keyboard.nextLine();

               if(response.equalsIgnoreCase("yes"))
               {
                  System.out.println("The rat joins you as you move head back towards the front door. ");
                  System.out.println("The two of you leave ready to embark on whatever quest life throws at you next.");   
                  System.exit(0);
               }
               
               else if(response.equalsIgnoreCase("no"))
               {
                  System.out.println("Immediately after you decline the offer a trio of hellhounds "
                  + "appear to attack you. Since you dissed the rat it doesn't offer to help you \n"
                  + "and after a long battle you eventually lose.");
                  System.exit(0);
               }
             }
           }
            
            if(nextRoom == 3)
            {
               System.out.println( "You find yourself in a concrete hallway. Oddly, there is only a single" );
				   System.out.println( "\"door\" visible. Otherwise, the hall just extends about fifteen feet" );
			   	System.out.println( "in either direction, and ends in a smooth, blank, concrete wall." );
				   System.out.println( "Do you want to enter the \"door\" or approach the \"wall\" looking for clues?" );
			   	System.out.print( "> " );
               response = keyboard.nextLine();
			   	if ( response.equalsIgnoreCase("door") )
			   		nextRoom = 1;
			   	else if ( response.equalsIgnoreCase("wall") )
			   		nextRoom = 4;
			   	else
					System.out.println( response + " wasn't one of the options. Try again." );
            }
            
           if ( nextRoom == 4 )
			  {
			    System.out.println( "Upon closer inspection, the seemingly blank wall shimmers ever so slightly" );
				 System.out.println( "in the dim light. You put forward a tentative hand, and it pushes through," );
				 System.out.println( "a feeling of static sliding up your arm." );
				 System.out.println();
				 System.out.println( "You pass through the portal into the unknown...." );
				 nextRoom = 0;
			  }
      }
      
      System.out.println("\nThe game is over. The next expansion can be downloaded via DLC for $19.99.");
   }
}
