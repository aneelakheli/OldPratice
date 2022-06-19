import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Test extends JFrame implements ActionListener {
    JButton jb1 = new JButton("ADD");
    JTextField jt1 = new JTextField("first");
    JTextField jt2 = new JTextField("second");
    JLabel lb = new JLabel("Result");

    Test() {
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        jb1.setBounds(90, 200, 100, 30);
        add(jb1);

        lb.setBounds(90, 140, 150, 30);
        add(lb);

        jb1.addActionListener(this);
        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int a = Interger.parseInt(jt1.getText());
        int b = Interger.parseInt(jt2.getText());
        int c = 0;
        if (e.getSource().equals(jb1)) {
            c = a + b;
            lb.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
    }

}