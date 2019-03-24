package menutesting;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 *  ButtonDemo.java requires these files:
 *   images/Bird.gif
 *   images/Cat.gif
 *   images/Dog.gif
 *   images/Rabbit.gif
 *   images/Pig.gif
 */
public class ListenTest extends JPanel implements ActionListener {
    static String birdString = "Daily Meal Planner";
    static String catString = "Weekly Meal Planner";
    static String dogString = "Random Meal Generator";
    static String rabbitString = "Credits";
    static String pigString = "Change username";

    JLabel picture;
    JLabel test;
    String user;
    public ListenTest(String user) {
        super(new BorderLayout());
        test = new JLabel("");
        this.user = user;
        picture = new JLabel(new ImageIcon("Were_heree.jpg"));
        picture.setPreferredSize(new Dimension(177, 122));
        test.setText("Hello " + user + ", what would you like to do");
        //Create the   buttons.
        JButton birdButton = new JButton(birdString);
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand(birdString);

        JButton catButton = new JButton(catString);
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand(catString);

        JButton dogButton = new JButton(dogString);
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand(dogString);

        JButton rabbitButton = new JButton(rabbitString);
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand(rabbitString);

        JButton pigButton = new JButton(pigString);
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand(pigString);

        //Group the   buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);
        //Register a listener for the   buttons.
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        JPanel  Panel = new JPanel(new GridLayout(0, 1));
         Panel.add(birdButton);
         Panel.add(catButton);
         Panel.add(dogButton);
         Panel.add(rabbitButton);
         Panel.add(pigButton);
        
        add( Panel, BorderLayout.LINE_START);
        add(test,BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
    /** Listens to the   buttons. */
    public void actionPerformed(ActionEvent e) {
    	String help = e.getActionCommand();
    	JComponent secondContentPane = new ListenTest(user);
    	if(help.equals(birdString)) {
    		picture.setIcon(new ImageIcon("Were_heree.jpg"));
    		test.setText("");
    		add(picture, BorderLayout.PAGE_START);
    		picture.setVisible(true);
    	}
    	else if(help.equals(dogString)){
    		secondContentPane = new RMG(user);	
    	}
    	else if(help.equals(pigString)) {
    		secondContentPane = new FunctionTest();
    	}
    	else {
    		secondContentPane = new ListenTest(user);
    	}
    	main.changeFrame(secondContentPane);
    	main.frame.validate();
    }
    
}