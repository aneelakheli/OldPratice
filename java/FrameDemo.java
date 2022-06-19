import javax.swing.*;

class FrameDemo
{
 
  public static void main(String[] args)
  {
    JFrame jf = new JFrame();
    JButton btn = new JButton("sign up");
    btn.setBounds(160,100,100,40);
    jf.add(btn);
    jf.setLayout(null);
    jf.setSize(400,500);
    jf.setVisible(true);


  }




}