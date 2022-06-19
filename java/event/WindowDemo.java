import javax.swing.*;
import java.awt.event.*;

class WindowDemo extends JFrame implements WindowListener {
    WindowDemo() {
        setSize(500, 500);
        setVisible(true);
        addWindowListener(this);

    }

    public void windowActivated(WindowEvent arg) {
        System.out.println("activated");

    }

    public void windowClosed(WindowEvent arg) {
        System.out.println("closed");
        dispose();
    }

    public void windowClosing(WindowEvent arg) {
        System.out.println("closing");
        dispose();
    }

    public void windowDeactivated(WindowEvent arg) {
        System.out.println("deactivated");
    }

    public void windowDeiconified(WindowEvent arg) {
        System.out.println("deiconfied");
    }

    public void windowIconified(WindowEvent arg) {
        System.out.println("opened");
    }

    public void windowOpened(WindowEvent arg) {
        System.out.println("opened");
    }

    public static void main(String[] args) {
        new WindowDemo();
    }
}