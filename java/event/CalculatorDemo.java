import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CalculatorDemo implements ActionListener {

    CalculatorDemo() {

        // creating frame
        JFrame f = new JFrame("calculator");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(null);

        // creating button
        JButton b1 = new JButton("b1");
        b1.setBounds(20, 40, 60, 35);
        f.add(b1);
        JButton b2 = new JButton("b2");
        b2.setBounds(20, 85, 60, 35);
        f.add(b2);
        JButton res = new JButton("result");
        res.setBounds(20, 130, 80, 35);
        f.add(res);
        JButton pluse = new JButton("add");
        pluse.setBounds(80, 250, 70, 50);
        f.add(pluse);
        JButton sub = new JButton("sub");
        sub.setBounds(175, 250, 70, 50);
        f.add(sub);

        // creating textarea
        JTextField t1 = new JTextField();
        t1.setBounds(100, 50, 150, 20);
        f.add(t1);
        JTextField t2 = new JTextField();
        t2.setBounds(100, 100, 150, 20);
        f.add(t2);
        JTextField t3 = new JTextField();
        t3.setBounds(100, 150, 150, 20);
        f.add(t3);

        // doing actionlistener
        // b1.addActionListener(this);
        // b2.addActionListener(this);

    }

    // create action performed method to make calculation

    public void actionPerformed(ActionListener cal) {
        t1.getText();
        t2.getText();
        if (cal.getSource() == pluse) {
            c = a + b;
            t3.setText(c);
        } else if (cal.getSource() == sub) {
            c = a - b;
            t3.setText(c);
        }
    }

    public static void main(String[] args) {
        new CalculatorDemo();

    }

}