import java.util.*;

public class AgeIn5
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name;
      int age;
      
      System.out.print("Hello. What is your name? ");
      name = keyboard.next();
      
      System.out.print("Hi, " + name + "! How old are you? ");
      age = keyboard.nextInt();
      
      int ageIn5 = age + 5;
      int age5Ago = age - 5;
      
      System.out.println("Did you know that in five years you will be " + ageIn5 + " years old? \n"
       + "And five years ago you were " + age5Ago + "! Imagine that!");
      
   
   
   
   
   
   
   
   
   
   }
}