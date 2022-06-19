import javax.swing.*;
import java.awt.*;

class GridLayoutDemo
{
   GridLayoutDemo() 
    {
       JFrame f = new JFrame();
	
	JButton b1 = new JButton("button-1");
        JButton b2 = new JButton("button-2");
        JButton b3 = new JButton("button-3");
        JButton b4 = new JButton("button-4");
 
        f.add(b1);  
        f.add(b2);
        f.add(b3);  
        f.add(b4);
        
        f.setLayout(new GridLayout(2,2,20,20));
        f.setVisible(true);
 	f.setSize(500,500);     

     }
   public static void main(String[] args)

   {
    new GridLayoutDemo();
   }
}