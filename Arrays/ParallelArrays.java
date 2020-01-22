import java.util.Scanner;

public class ParallelArrays
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String[] lname = {"Mitchell", "Hawkes", "Omobuwa", "Ortiz", "Jones"};
      double[] grade = {99.5, 98.7,90.3, 78.5, 83.7};
      int[] studentID = {123456, 369412, 987232, 813225, 307760};
      int idNum;
      int slot = 0;
      String name = " ";
      int id = 0;
      double average = 0.0;
      
      System.out.print("Values: \n\t\t");
      for(int i = 0; i < lname.length; i++)
         System.out.print(lname[i] + " " + grade[i] + " " + studentID[i] + "\n\t\t");
      
      System.out.print("\nID number to find: ");
      idNum = keyboard.nextInt();
      
      for(int i = 0; i < studentID.length; i++)
      {
         if(idNum == studentID[i])
         {
            slot = i; 
            name = lname[i];
            average = grade[i];
            id = studentID[i];
         }
      }
      System.out.print("Found in slot " + slot + "\n\t\t");
      System.out.print("Name: " + name + "\n\t\t");
      System.out.print("Average: " + average + "\n\t\t");
      System.out.print("ID: " + id);
      
   }
}