import java.util.*;

public class GenderGame
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String firstName;
      String lastName;
      String gender;
      int age;
      String answer;
      
      System.out.print("What is your gender (M or F) ");
      gender = keyboard.next();
      System.out.print("First Name: ");
      firstName = keyboard.next();
      System.out.print("Last Name: ");
      lastName = keyboard.next();
      System.out.print("Age: ");
      age = keyboard.nextInt();
      
      if(gender.equalsIgnoreCase("F") && age >= 20)
      {
         System.out.println("Are you married, " + firstName + " (Y or N)");
         answer = keyboard.next();
         if(answer.equalsIgnoreCase("Y"))
            System.out.println("Then I shall call you Mrs. " + lastName + ".");
         else if(answer.equalsIgnoreCase("N"))
            System.out.println("Then I shall call you Ms. " + lastName + ".");
      }
      if(gender.equalsIgnoreCase("F") && age < 20 || gender.equalsIgnoreCase("M") && age < 20)
         System.out.println("Then I shall call you " + firstName + lastName + ".");
         
      if(gender.equalsIgnoreCase("M"))
         System.out.println("Then I shall call you Mr. " + lastName);
      
   }
}
