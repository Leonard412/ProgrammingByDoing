import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
   public void paint(Graphics g)
   {
      /* //labels
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
         g.drawLine(0,Y,799,Y);*/
         
      //clock
      g.setColor(Color.black);
      g.drawOval(250,200,300,300);
      
      //NUMBERS
      g.setFont(new Font("TimesRoman",Font.PLAIN, 50));
      g.drawString("12",380,235);
      g.drawString("6", 390,494);
      g.drawString("3", 530,362);
      g.drawString("9", 255,362);
      g.drawString("1", 455,255);
      g.drawString("2", 500,300);
      g.drawString("4", 500,435);
      g.drawString("5", 455,480);
      g.drawString("7", 340,483);
      g.drawString("8", 290,445);
      g.drawString("10",270,300);
      g.drawString("11",313,260);
      
      //Center
      g.setColor(Color.lightGray);
      g.fillOval(395,345,13,13);
      
      //Hands
      g.setColor(Color.black);
      g.drawLine(400,344,400,235); //big hand
      g.drawLine(397,350,350,350); //small hand
   }
   
   public static void main(String[] args)
   {
      JFrame win = new JFrame("ClockFace");
      win.setSize(800,600);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ClockFace canvas = new ClockFace();
      win.add(canvas);
      win.setVisible(true);
   }
}