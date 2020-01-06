import java.util.Scanner;

public class Keychains2
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int choice;
      int currentKeys = 0;
      int price = 10;
      
      System.out.println("Ye Olde Keychain Shoppe");
      
      do
      {
         System.out.println("\n1. Add Keychains to Order");
         System.out.println("2. Remove Keychains from Order");
         System.out.println("3. View Current Order");
         System.out.println("4. Checkout");
         
         System.out.print("\nPlease enter your choice: ");
         choice = kb.nextInt();
         
         if(choice == 1)
         {
            currentKeys = add_keychains(currentKeys);
         }
         else if(choice == 2)
            currentKeys = remove_keychains(currentKeys);
         else if(choice == 3)
            view_order(currentKeys,price);
         else if(choice == 4)
            checkout(currentKeys,price);
         else
            System.out.println("INVALID CHOICE. TRY AGAIN");
         
      }
      while(choice != 4);
   }
   //Prompt user then add that number to keychain total
   public static int add_keychains(int keyCount)
   {
      Scanner kb = new Scanner(System.in);
      int addKeycount;
      
      System.out.print("\nYou have " + keyCount + " keychains. How many to add? ");
      addKeycount = kb.nextInt();
      keyCount += addKeycount;
      System.out.println("You now have " + keyCount + " keychains.");
      return keyCount;
   }
   
   public static int remove_keychains(int keyCount)
   {
      Scanner kb = new Scanner(System.in);
      int removeKey;
      
      System.out.print("\nYou have " + keyCount + " keychains. How many to remove? ");
      removeKey = kb.nextInt();
      keyCount -= removeKey;
      System.out.println("You now have " + keyCount + " keychains.");
      return keyCount;
   }
   
   public static void view_order(int keyCount, int price)
   {  
      System.out.println("You have " + keyCount + " keychains.");
      System.out.println("Keychains cost " + "$" + price + " each.");
      System.out.println("Total cost is " + "$"  + (keyCount * price) + ".");
   }
   
   public static void checkout(int keyCount, int price)
   {
      Scanner kb = new Scanner(System.in);
      String name;
      
      System.out.println("CHECKOUT");
      System.out.print("\nWhat is your name? ");
      name = kb.next();
      System.out.println("You have " + keyCount + " keychains.");
      System.out.println("Keychains cost " + "$" + price + " each.");
      System.out.println("Total cost is " + "$" + (keyCount * price) + ".");
      System.out.println("Thanks for your order, " + name + "!");
      
   }
}