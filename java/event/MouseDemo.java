import javax.swing.*;

import java.awt.event.*;

class MouseDemo extends JFrame implements MouseListener {

    MouseDemo() {
        setSize(100, 100);
        setVisible(true);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");

    }

    public void mouseExited(MouseEvent e) {
        System.out.println("exited");

    }

    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");

    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("RELEASED");
    }

    public static void main(String[] args) {
        new MouseDemo();
    }

}