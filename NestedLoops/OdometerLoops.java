import java.util.Scanner;

public class OdometerLoops
{
   public static void main(String[] agrs) throws Exception
   {
      Scanner keyboard = new Scanner(System.in);
      int base;
      
      System.out.print("Which base (2-10): ");
      base = keyboard.nextInt();
      
      for(int thous=0; thous<base; thous++)
      
         for(int hund=0; hund<base; hund++)
         
            for(int tens=0; tens<base; tens++)
            
               for(int ones=0; ones<base; ones++)
               {
                  System.out.print(" " + thous + " " + hund + " " + tens + " " + ones + "\r");
                  Thread.sleep(500);
               }//It still works without the braces for the outer loops
              
         
      
      System.out.println();
   }
}