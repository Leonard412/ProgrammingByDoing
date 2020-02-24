import java.util.*;
@SuppressWarnings("unchecked")

public class BasicArrayLists3
{
   public static void main(String[] args)
   {
      ArrayList listTest = new ArrayList();
      Random r = new Random();
      
      while(listTest.size() < 1000)
      {
         for(int i = 11; i <= 99; i++)
         {
            listTest.add(r.nextInt(i) );  
         }
      }
      System.out.print(listTest + ",\t");
   }
}