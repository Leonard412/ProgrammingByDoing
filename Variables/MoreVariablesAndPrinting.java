public class MoreVariablesAndPrinting
{
   public static void main(String[] args)
   {
      String name, eyes, teeth, hair;
      int age, height, weight;
      double weightKG, heightCM;
      
      name = "Leonard A. Hawkes";
      age = 26;
      height = 72; //inches
      weight = 260; //HeavySzn
      eyes = "Brown";
      teeth = "White";
      hair = "Black";
      weightKG = weight * .45;
      heightCM = height * 2.54;
      
      System.out.println("Let's talk about " + name + ".");
      System.out.println("He's " + height + " inches" + " (or " + heightCM + " cm" + " tall");
      System.out.println("He's " + weight + " pounds " + "(or " + weightKG + " kg)" + " heavy");
      System.out.println("Heavy szn fo sho!");
      System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
      System.out.println("His teeth are usually " + teeth + " depending if he's wearing golds or not.");
      
      //This line is tricky; try to get it exactly right.
      System.out.println("If I add " + age + ", " + height + ", and " + weight + " I get: "
         + (age + height + weight) + ".");
      
   
   
   
   
   
   
   
   
   
   
   }
}
