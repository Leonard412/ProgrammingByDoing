import java.util.*;
import java.text.*;

public class BMICategories
{
   private static DecimalFormat df = new DecimalFormat("0.00");
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int heightFeet;
      int heightInches;
      double weight;
      double BMI;
      int heightTotal;
      
      System.out.print("Enter your height (feet): ");
      heightFeet = keyboard.nextInt();
      
      System.out.print("Enter your height (inches): ");
      heightInches = keyboard.nextInt();
      
      System.out.print("Enter your weight (lbs): ");
      weight = keyboard.nextDouble();
      
      heightTotal = heightFeet * 12 + heightInches;
      
      BMI = (weight * 705) / (heightTotal * heightTotal);
      
      System.out.println("Your BMI is: " + df.format(BMI));
      
      if(BMI < 18.5)
      {
         System.out.println("BMI Category: underweight");
      }
      
      if(BMI >= 18.5 && BMI <= 24.9)
      {
         System.out.println("BMI Category: normal weight");
      }
      
      if(BMI >= 25.0 && BMI <= 29.9)
      {
         System.out.println("BMI Category: overweight");
      }
      
      if(BMI >= 30.0)
      {
         System.out.println("BMI Categroy: obese");
      }
   }
}
