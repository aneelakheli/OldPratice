import java.awt.*;
import javax.swing.*;

public class GroupExample {

public static void main(String[] args)
   {
    {
       JFrame f = new JFrame("GroupExample");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container contentPanel = f.getContentpane();
       GroupLayout groupLayout = new GroupLayout(contentPanel);

       contentPanel.setLayout(groupLayout);


       JLabel clickMe = new JLabel("clickMe");
       JButton button = new JButton("this button");
       
        groupLayout.setHorizontalGroup(
           groupLayout.createSequentialGroup()
            .addComponent(clickMe)
            .addGap(10,20,100)
            .addComponent(button));
        
        groupLayout.setVerticalGroup(
          groupLayout.createParallelGroup(GroupLayout.Aligment.BASELINE)
           .addComponent(clickMe)
           .addComponent(button));  
       
       
         f.setVisible(true);
         f.pack();
 	
}
}