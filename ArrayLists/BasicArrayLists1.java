import java.util.*;
@SuppressWarnings("unchecked")

public class BasicArrayLists1
{
   public static void main(String[] args)
   {
      ArrayList listTest = new ArrayList();
      while(listTest.size() < 10)
      {
         listTest.add("-113");
      }
      
      for(int i = 0; i < listTest.size(); i++)
      {
         System.out.println("Slot " + i + " contains a " + listTest.get(0) );
      }
   }
}