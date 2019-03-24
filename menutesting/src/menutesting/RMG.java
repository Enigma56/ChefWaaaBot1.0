package menutesting;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
        main.frame.validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		timefordinner = textfield.getText(); 
		Integer time; 
		time = Integer.parseInt(timefordinner);

	}

}
