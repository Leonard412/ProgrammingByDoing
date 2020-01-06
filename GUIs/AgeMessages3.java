import java.util.*;

public class AgeMessages3
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name;
      int age;
      
      System.out.println("Enter your name");
      name = keyboard.next();
      
      System.out.println("Enter your age");
      age = keyboard.nextInt();
      
      /*System.out.println("Your name: " + name);
      System.out.println("Your age: " + age);*/
      
      if(age < 16)
      {
         System.out.println("You can't drive, " + name + ".");
      }
      
      if(age > 16 && age < 18)
      {
         System.out.println("You can drive but not vote, " + name + ".");
      }
      
      if(age > 18 && age < 25)
      {
         System.out.println("You can vote but not rent a car, " + name + ".");
      }
      
      if(age >= 25)
      {
         System.out.println("You can do pretty much anything, " + name + ".");
      }
   }
}
