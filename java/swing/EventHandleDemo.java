import javax.swing.*;
import java.awt.event.*;

class EventHandleDemo implements ActionListener {
  JTextField t1;
  JButton btn, reset;

  EventHandleDemo() {
    JFrame f = new JFrame("event handler demo");
    f.setVisible(true);
    f.setSize(500, 500);

    t1 = new JTextField();
    t1.setBounds(150, 50, 150, 20);
    btn = new JButton("click me");
    btn.setBounds(150, 100, 150, 20);
    btn.addActionListener(this);
    f.add(t1);
    reset = new JButton("Reset");
    reset.setBounds(150, 150, 150, 20);
    reset.addActionListener(this);
    f.add(btn);
    f.add(reset);
    f.setLayout(null);
  }

  public void actionPerformed(ActionEvent obj) {
    System.out.println(obj.getSource());
    if (obj.getSource() == btn) {
      System.out.println("if");

      t1.setText("clicked");
    } else {
      System.out.println("else");

      t1.setText("");
    }
  }

  public static void main(String[] args) {

    EventHandleDemo d = new EventHandleDemo();

  }

}