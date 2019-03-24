package menutesting;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DMG extends JPanel implements ActionListener {
	JLabel test,meal1,meal2,meal3;
	String Meal;
	JTextField textfield;
	static String timefordinner;
	JButton xd;
	public DMG() {
		super(new BorderLayout());
		test = new JLabel("");
        test.setText("How much time do you have for dinner? (in minutes)");
        test.setBounds(100,100,300,300);
        xd = new JButton("Enter Time (mins)");
        xd.setBounds(100, 100, 300, 300);
        xd.addActionListener(this);
        textfield= new JTextField();
		textfield.setBounds(110,300, 130, 300);
		JPanel  Panel = new JPanel(new GridLayout(0, 1));
		add( Panel, BorderLayout.LINE_START);
        add(test,BorderLayout.PAGE_START);
        add(textfield,BorderLayout.CENTER);
        add(xd,BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(400,400,400,400));
	}
	public void actionPerformed(ActionEvent e) {
		timefordinner = textfield.getText(); 
		Integer time; 
		time = Integer.parseInt(timefordinner);
		//code that generates and assigns the meals to meal1-3 
		add(meal1,BorderLayout.NORTH);
		add(meal2,BorderLayout.CENTER);
		add(meal3,BorderLayout.SOUTH);
		xd.setVisible(false);

	}

}
