import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
   public void paint (Graphics g)
   {
      //labels
      g.setColor(Color.black);
      g.setFont(new Font(null));
      for(int X = 0; X < 800; X += 50)
         g.drawString(String.valueOf(X), X, 50);
      for(int Y = 100; Y < 600; Y+= 50)
         g.drawString(String.valueOf(Y), 28, Y);
      //lines
      g.setColor(Color.lightGray);
      for(int X = 0; X < 800; X += 50)
         g.drawLine(X,0,X,599);
      for(int Y = 0; Y < 600; Y += 50)
         g.drawLine(0,Y,799,Y);
         
      //Smiley Face
      g.setColor(Color.yellow);
      g.fillOval(250,225,300,300);
      g.setColor(Color.blue);
      g.fillOval(300,305,75,75);
      g.fillOval(425,305,75,75);
      g.setColor(Color.red);
      g.fillArc(350,475,120,10,200,130);
   }
   
   public static void main(String[] args)
   {
      JFrame win = new JFrame("SmilingFace");
      win.setSize(800,600);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SmilingFace canvas = new SmilingFace();
      win.add(canvas);
      win.setVisible(true);

   }
}  