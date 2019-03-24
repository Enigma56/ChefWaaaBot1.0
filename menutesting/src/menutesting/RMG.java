package menutesting;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RMG extends JPanel implements ActionListener {
	 JLabel test;
	 String Meal;
	 JTextField textfield;
	 static String timefordinner;
	public RMG(String user) {
		super(new BorderLayout());
		test = new JLabel("");
        test.setText("How much time do you have for dinner? (in minutes)");
        JButton xd = new JButton("Enter Time (mins)");
        xd.setBounds(10, 10, 50, 50);
        xd.addActionListener(this);
        textfield= new JTextField();
		textfield.setBounds(110, 50, 130, 30);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		timefordinner = textfield.getText(); 
		Integer time; 
		time = Integer.parseInt(timefordinner);

	}

}
