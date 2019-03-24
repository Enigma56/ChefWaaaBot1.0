package menutesting;

<<<<<<< HEAD
import foods.*;

import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class main {
	static JFrame frame;
	JTextField textfield;
	
	Food spaghetti = new Spaghetti(.5);
=======
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class main {
	static JFrame frame;
	JTextField textfield;
>>>>>>> branch 'master' of https://github.com/Enigma56/ChefWaaaBot1.0.git
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new FunctionTest();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	public static void changeFrame(JComponent newFrame) {
		frame.setContentPane(newFrame);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                
            }
        });
	}

}
