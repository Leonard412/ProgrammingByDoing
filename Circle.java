import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas
{
   public void paint(Graphics g)
   {
      //int diameter = radius * 2;
      g.setColor(Color.green);
      g.fillOval(400,120,100,100);
   }
   
   public static void main(String[] args)
   {
      //You can change title and size here
      JFrame win = new JFrame("Circle");
      win.setSize(800,600);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Circle canvas = new Circle();
      win.add(canvas);
      win.setVisible(true);
   }
}