package menutesting;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FunctionTest extends JPanel implements ActionListener {
    JLabel test;
    JTextField textfield;
    public static String user;
    static JFrame frame;
    static Boolean pressed;
	public FunctionTest() {
		super(new BorderLayout());
        test = new JLabel("");
        test.setText("Please enter your name");
<<<<<<< HEAD
        JButton xd = new JButton("Enter Name");
        xd.setBounds(10, 10, 50, 50);
        xd.addActionListener(this);
        textfield= new JTextField();
		textfield.setBounds(110, 50, 130, 30);
		JPanel  Panel = new JPanel(new GridLayout(0, 1));
		add( Panel, BorderLayout.LINE_START);
        add(test,BorderLayout.PAGE_START);
        add(textfield,BorderLayout.CENTER);
        add(xd,BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
=======
        test.setBounds(100,100,300,300);
        JButton xd = new JButton("Enter Name");
        xd.setBounds(20, 20, 100, 100);
        xd.addActionListener(this);
        textfield= new JTextField();
		textfield.setBounds(220, 100, 260, 60);
		
        add(test,BorderLayout.PAGE_START);
        add(textfield,BorderLayout.CENTER);
        add(xd,BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(400,400,400,400));
>>>>>>> branch 'master' of https://github.com/Enigma56/ChefWaaaBot1.0.git
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		test.setText("Hello " + textfield.getText());
		user = textfield.getText(); 
		JComponent secondContentPane = new ListenTest(user);
        main.changeFrame(secondContentPane);

	}
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
}
