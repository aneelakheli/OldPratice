import javax.swing.*;

//inheritance 
class FrameInheritance extends JFrame {
    FrameInheritance() {
        super("TESTING");
        JButton btn = new JButton("click me!");
        btn.setBounds(130, 100, 100, 40);
        add(btn);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FrameInheritance();
    }

}