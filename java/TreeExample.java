import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
   
     TreeExample() 
    {
     JFrame f = new JFrame();
     DefaultMutableTreeNode programminglanguage = new DefaultMutableTreeNode("programming language"); 
     DefaultMutableTreeNode ja = new DefaultMutableTreeNode("java");
     DefaultMutableTreeNode php = new DefaultMutableTreeNode("php");
     DefaultMutableTreeNode c = new DefaultMutableTreeNode("c");
      programminglanguage.add(ja);
      programminglanguage.add(php);
      programminglanguage.add(c);
     DefaultMutableTreeNode jse = new DefaultMutableTreeNode("JSE");
     DefaultMutableTreeNode jee = new DefaultMutableTreeNode("JEE");
     DefaultMutableTreeNode jme = new DefaultMutableTreeNode("JME");
      ja.add(jse);
      ja.add(jee);
      ja.add(jme);
        DefaultMutableTreeNode serv = new DefaultMutableTreeNode("servlet");
        DefaultMutableTreeNode jsp = new DefaultMutableTreeNode("jsp");
       jee.add(serv);
	jee.add(jsp);
        JTree jt = new JTree(programminglanguage);

      f.add(jt);
      f.setSize(500 , 500);
      f.setVisible(true);

    }

public static void main(String[] args)
{
  new TreeExample();
}



}