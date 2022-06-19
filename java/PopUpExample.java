import javax.swing.*;
import java.awt.event.*;

class PopUpExample

{
      PopUpExample()
   {
     JFrame j = new JFrame("pop up example");
      JPopupMenu popupmenu = new JPopupMenu("popupmenu");
     JMenuItem copy = new JMenuItem("copy");
    JMenuItem cut = new JMenuItem("cut");
     JMenuItem paste = new JMenuItem("paste");
      popupmenu.add(cut);
	popupmenu.add(copy);
	popupmenu.add(paste);
          j.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(j , e.getX(), e.getY());  
            }                 
         });
	 j.add(popupmenu);
	 j.setVisible(true);
	 j.setSize(400, 400);
	 
    

   }

    public static void main(String[] args)
   {
     new PopUpExample();

   }
}