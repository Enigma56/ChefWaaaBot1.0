package menutesting;

import foods.*;

import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class main {
	static JFrame frame;
	JTextField textfield;
	//TODO: Change the 1s to user input when possible
	static Food borger = new Cheeseburger(1), vegLasaga = new LasagnaVeg(1), meatLasaga = new LasagnaMeat(1), 
			meatLof = new Meatloaf(1), marSpaghoot = new SpaghettiMarinara(1), meatSpaghoot = new SpaghettiMeat(1), 
			stake = new Steak(1), saled = new WalnutSalad(1), kledFood = new Tacos(1), sammich = new Sandwich(1),
			timpano = new Timpano(1), eggu = new Eggs(1);
	
	//static ArrayList<Food> shortFoods = new ArrayList<Food>();
	//static ArrayList<Food> longFoods = new ArrayList<Food>();
	
	static Food[] shortFoods = {borger, marSpaghoot, meatSpaghoot, saled, kledFood, sammich, eggu};
	static Food[] longFoods = {vegLasaga, meatLasaga, meatLof, stake, timpano};
	static Food[] allFoods = {vegLasaga, meatLasaga, meatLof, stake, timpano, 
			borger, marSpaghoot, meatSpaghoot, saled, kledFood, sammich, eggu};
	
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
