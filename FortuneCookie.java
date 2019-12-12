import java.util.*;

public class FortuneCookie
{
   public static void main(String[] args)
   {
      Random r = new Random();
      
      int randNum = 1 + r.nextInt(6);
      
      if(randNum == 1)
         System.out.println("Fortune Cookie says: You will face your rival in combat.");
      else if(randNum == 2)
         System.out.println("Fortune Cookie says: You will find happiness at the defeat of others.");
      else if(randNum == 3)
         System.out.println("Fortune Cookie says: Great fortune smiles upon you.");
      else if(randNum == 4)
         System.out.println("Fortune Cookie says: You will find happiness with a new love.");
      else if(randNum == 5)
         System.out.println("Fortune Cookie says: You will encounter someone from your past.");
      else if(randNum == 6)
         System.out.println("Fortune Cookie says: You will accomplish your greatest goal.");
         
      System.out.print(1 + r.nextInt(54) + " - ");
      System.out.print(1 + r.nextInt(54) + " - ");
      System.out.print(1 + r.nextInt(54) + " - ");
      System.out.print(1 + r.nextInt(54) + " - ");
      System.out.print(1 + r.nextInt(54) + " - ");
      System.out.print(1 + r.nextInt(54) + " - ");
      System.out.print(1 + r.nextInt(54));
   }
}