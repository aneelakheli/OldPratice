import javax.swing.*;

class MenuDemo
{
    MenuDemo()
	{
	  JFrame f = new JFrame("menu and menubar");
	  JMenuBar bar = new JMenuBar();
	  JMenu file = new JMenu("File");
	    JMenuItem n = new JMenuItem("New");
	     file.add(n);
	    JMenuItem o = new JMenuItem("Open");
	     file.add(o);
	    JMenuItem s = new JMenuItem("save");
	     file.add(s);
	    JMenuItem e = new JMenuItem("Exit");
	     file.add(e);
			
	    JMenu saveAs = new JMenu("Saveas");
	        file.add(saveAs);
		JMenuItem old = new JMenuItem("old");
		  saveAs.add(old);
		JMenuItem ne = new JMenuItem("new");
		 saveAs.add(ne);


	  JMenu edit = new JMenu("Edit");
           JMenuItem l = new JMenuItem("Layers");
	     edit.add(l);
	    JMenuItem c = new JMenuItem("cut");
	     edit.add(c);
	    JMenuItem u = new JMenuItem("undo");
	     edit.add(u);
	    JMenuItem r = new JMenuItem("redo");
	     edit.add(r);
 	  JMenu window = new JMenu("Window");

	  bar.add(file);
	  bar.add(edit);
	  bar.add(window);
	  
	  f.setJMenuBar(bar);
	  f.setVisible(true);
	  f.setSize(500, 500);
	  
	 


          }
	public static void main(String[] args)
{
  new MenuDemo();
}
}