import java.util.*;
@SuppressWarnings("unchecked")

public class BasicArrayLists2
{
   public static void main(String[] args)
   {
      ArrayList listTest = new ArrayList();
      Random r = new Random();
      
      while(listTest.size() < 10)
      {
         listTest.add(r.nextInt(100));
      }
      
      System.out.println("ArrayList: " + listTest);
   }
}