package menutesting;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WMG extends JPanel implements ActionListener {
	JLabel test,meal1,meal2,meal3;
	String Meal;
	JTextField textfield;
	int daynumber;
	JButton xd;
	static String timefordinner;
	String daysWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday",};
	public WMG() {
		super(new BorderLayout());
		daynumber = 0;
		test = new JLabel("");
        test.setText("How much time do you have for dinner on " + daysWeek[daynumber]+ "? (in minutes)");
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
/*public String getText()
    {
        String ret = "   |";
        for (int j = 0; j < 10; j++)
            ret = ret + format(Character.toString((char)('A' + j))) + "|";
        ret = ret + "\n";
        for (int i = 0; i < 15; i++)
        {
            ret += String.format("%-3d|", i + 1);
            for (int j = 0; j < 12; j++)
            {
                ret += items[i][j] + "|";
            }
            ret += "\n";
        }
        return ret;
    }
    */
	@Override
	public void actionPerformed(ActionEvent e) {
		daynumber++;
		if(daynumber > 6) {
			xd.setVisible(false);
			//print out generated list of foods in the spreadsheet
		}
		else {
			//generate breakfast,lunch & dinner for this day, and store it in an array list 
			test.setText("How much time do you have for dinner on " + daysWeek[daynumber]+ "? (in minutes)");
		}


	}

}
