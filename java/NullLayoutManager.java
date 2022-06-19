import java.awt.*;
public class NullLayoutManager extends Frame
{
  Button agreedBut, denyBut;
  Label sign;
  public NullLayoutManager()
  {
    super("No Layout Manager");
    setLayout(null);
 
    sign = new Label("Click Your Acceptance");
    agreedBut = new Button("AGREED");
    denyBut = new Button("DENIED");
 
    sign.setBounds(80, 35, 130, 25);
    agreedBut.setBounds(60, 75, 75, 25);
    denyBut.setBounds(150, 75, 75, 25);
    
    add(sign);   
    add(agreedBut);  
    add(denyBut);
 
    setSize(260, 130);
    setVisible(true);
  }
  public static void main(String args[])
  {
    new NullLayoutManager ();
  }
}