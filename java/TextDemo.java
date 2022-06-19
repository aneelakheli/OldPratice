import javax.swing.*;

class TextDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Example");
        JTextField tf = new JTextField();
        tf.setBounds(50, 100, 200, 30);
        tf.add();
        tf.setSize(400, 400);
        tf.setLayout(null);
        tf.setVisible(true);

    }
}