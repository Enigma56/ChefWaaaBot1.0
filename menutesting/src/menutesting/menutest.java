package menutesting;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.AbstractButton;
import javax.swing.AbstractAction; 
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
public class menutest {
	JTextArea output;
    JScrollPane scrollPane;
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("MenuLookDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        menutest demo = new menutest();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
public JMenuBar createMenuBar () { 
	  JMenuBar menuBar;
	  JMenu menu, submenu;
	  JMenuItem menuItem;
	  JRadioButtonMenuItem rbMenuItem;
	  JCheckBoxMenuItem cbMenuItem;
	  //Action testaction = new AbstractAction(); 
	  menuBar = new JMenuBar();
	  menu = new JMenu("Test Menu");
	  menu.setMnemonic(KeyEvent.VK_A); 
	  menu.getAccessibleContext().setAccessibleDescription("This is a test menu");
	  menuBar.add(menu);
	 JMenuItem item1 = new JMenuItem("This is a test", KeyEvent.VK_F);
	 menu.add(item1);
	 menuItem = new JMenuItem("Both text and icon",new ImageIcon("Were_heree.jpg"));
	 menuItem.setMnemonic(KeyEvent.VK_B);
	 menu.add(menuItem);
	 menu.addSeparator();
	 ButtonGroup group = new ButtonGroup();
	 rbMenuItem  = new JRadioButtonMenuItem("IDK WHAT THIS MEEEEAAAAAAAAAANS");
	 rbMenuItem.setSelected(true);
	 rbMenuItem.setActionCommand("TEST");
	 rbMenuItem.setMnemonic(KeyEvent.VK_R);
	 group.add(rbMenuItem);
	 menu.add(rbMenuItem);
	 cbMenuItem = new JCheckBoxMenuItem("POGU");
	 menu.add(cbMenuItem);	
	 menu.addSeparator();
	 submenu = new JMenu("A submenu");
	 submenu.setMnemonic(KeyEvent.VK_S);

	 menuItem = new JMenuItem("An item in the submenu");
	 menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
	 submenu.add(menuItem);

	 menuItem = new JMenuItem("Another item");
	 submenu.add(menuItem);
	 menu.add(submenu);

	 //Build second menu in the menu bar.
	 menu = new JMenu("Another Menu");
	 menu.setMnemonic(KeyEvent.VK_N);
	 menu.getAccessibleContext().setAccessibleDescription("This menu does nothing");
	 menuBar.add(menu);
	 return (menuBar);
}
public Container createContentPane() {
    //Create the content-pane-to-be.
    JPanel contentPane = new JPanel(new BorderLayout());
    contentPane.setOpaque(true);

    //Create a scrolled text area.
    output = new JTextArea(15, 50);
    output.setEditable(false);
    scrollPane = new JScrollPane(output);

    //Add the text area to the content pane.
    contentPane.add(scrollPane, BorderLayout.CENTER);

    return contentPane;
}
	  public static void main(String[] args) {
		createAndShowGUI();
	  }
}

