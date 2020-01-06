import java.util.Scanner;

public class Keychains3
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int choice;
      int currentKeys = 0;
      double price = 10.0;
      double tax = 0.0825;
      int shipping = 5;
      
      
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
            view_order(currentKeys, price, tax, shipping, additional_shipping(currentKeys) );
         else if(choice == 4)
            checkout(currentKeys, price, tax, shipping, additional_shipping(currentKeys) );
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
      int newTotal = 0;
      do
      {
         System.out.print("\nYou have " + keyCount + " keychains. How many to remove? ");
         removeKey = kb.nextInt();
         newTotal = keyCount - removeKey;
         
         if(newTotal < 0)
         {
            System.out.println("You cannot have less than 0 key chains. Please try again.");
         }
         
      }
      while(newTotal < 0);
      keyCount = newTotal;
      System.out.println("You now have " + keyCount + " keychains.");
      return keyCount;
   }
   
   public static int additional_shipping(int keyCount)
   {
      if(keyCount > 1)
      {
         return (keyCount - 1);
      }
      else
      {
         return 0;
      }
   }
   
   public static void view_order(int keyCount, double price, double tax, int base_shipping, int per_keychain_shipping)
   {  double total, totalTax;
      
      total = keyCount * price;
      totalTax = total * tax;
      System.out.println("\nYou have " + keyCount + " keychains.");
      System.out.println("Keychains cost " + "$" + price + " each.");
      System.out.println("Your subtotal is " + "$" + total + ".");
      System.out.println("Shipping is $5.00 base and $1.00 for each additional keychain.");
      System.out.println("Shipping cost: " + "$" + (base_shipping + per_keychain_shipping) + ".");
      System.out.println("Tax cost: " + "$" + totalTax + ".");
      System.out.println("Total cost is " + "$"  + (total + totalTax + base_shipping + per_keychain_shipping) + ".");
   }
   
   public static void checkout(int keyCount, double price, double tax, int base_shipping, int per_keychain_shipping)
   {
      Scanner kb = new Scanner(System.in);
      String name;
      double total, totalTax;
      
      total = keyCount * price;
      totalTax = total * tax;
      
      
      System.out.println("CHECKOUT");
      System.out.print("\nWhat is your name? ");
      name = kb.next();
      view_order(keyCount,price,tax,base_shipping,per_keychain_shipping);
      /*System.out.println("You have " + keyCount + " keychains.");
      System.out.println("Keychains cost " + "$" + price + " each.");
      System.out.println("Your subtotal is " + "$" + total + ".");
      System.out.println("Shipping is $5.00 base and $1.00 for each additional keychain.");
      System.out.println("Shipping cost: " + "$" + (base_shipping + per_keychain_shipping) + ".");
      System.out.println("Tax cost: " + "$" + totalTax + ".");
      System.out.println("Total cost is " + "$"  + (toal + totalTax + base_shipping + per_keychain_shipping) + ".");
      */
      System.out.println("\nThanks for your order, " + name + "!");
      
   }
}