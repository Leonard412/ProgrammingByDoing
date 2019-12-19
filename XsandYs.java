public class XsandYs
{
   public static void main(String[] args)
   {
   
      System.out.println("x            y");
      System.out.println("--------------");
      
      for(double x = -10.0; x <= 10.0; x = x + 0.5)
      {
         double squared = x * x;
         double y = squared;
         System.out.println(x+"     "+y);
      }
   }
}