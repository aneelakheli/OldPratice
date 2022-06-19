import javax.swing.*;
import java.awt.*;

class FlowLayoutDemo
{

   FlowLayoutDemo()
   {
     JFrame f = new JFrame();
     JButton b1 = new JButton("button-1");
     JButton b2 = new JButton("button-2");
     JButton b3 = new JButton("button-3");
      JButton b4 = new JButton("button-4");
     JButton b5 = new JButton("button-5");


     f.setLayout(new FlowLayout(FlowLayout.RIGHT));
      
      f.add(b1);
      f.add(b2);
      f.add(b3);
      f.add(b4);
      f.add(b5);

	f.setVisible(true);
	f.setSize(400,400);

    }


    public static void main(String[] args)
    { 
      new FlowLayoutDemo();
     }
}