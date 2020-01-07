import java.util.*;

public class MoreUserInputOfData
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String firstName;
      String lastName;
      int grade;
      //String year;
      int studentID;
      String login;
      double GPA;
      
      System.out.println("Please enter the following information so I can sell it for a profit! \n");
      
      System.out.print("First name: ");
      firstName = keyboard.next();
      
      System.out.print("Last name: ");
      lastName = keyboard.next();
      
      //System.out.println("Grade or Year?");
      System.out.print("Grade (9-12): ");
      grade = keyboard.nextInt();
      
      System.out.print("Student ID: ");
      studentID = keyboard.nextInt();
      
      System.out.print("Login: ");
      login = keyboard.next();
      
      System.out.print("GPA (0.0-4.0): ");
      GPA = keyboard.nextDouble();
      
      
      
   
   
   
   }
}
