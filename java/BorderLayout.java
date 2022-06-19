import javax.swing.*;
import java.awt.*;
class BorderLayoutDemo
{
   BorderLayoutDemo()
   {
     JFrame f =new JFrame();
     JButton north = new JButton("north");
     JButton west = new JButton("west");
     JButton south = new JButton("south");
     JButton east = new JButton("east");
     JButton center = new JButton("center"); 
     
     f.add(north, BorderLayout.NORTH); 
     f.add(south, BorderLayout.SOUTH);
     f.add(west, BorderLayout.WEST);
     f.add(east, BorderLayout.EAST);    
  
     f.setVisible(true);
     f.setSize(400, 400);

    }
    public static void main(String[] args)

     {
     new BorderLayoutDemo();
      }
}