import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AdditionGUI extends JFrame implements ActionListener
{
	// components
	JLabel jlbl1 = new JLabel("Enter First Integer");
	JLabel jlbl2 = new JLabel("Enter Second Integer");
	JLabel jlbl3 = new JLabel("Result");
	JTextField jtxt1 = new JTextField(10);
	JTextField jtxt2 = new JTextField(10);
	JTextField jtxt3 = new JTextField(10);
	JButton jbtn1 = new JButton("Add");
	JButton jbtn2 = new JButton("Clear");
	
	// constructor
	AdditionGUI()
	{
		setTitle("Addition");
		setVisible(true);
		setLayout(new FlowLayout());
		add(jlbl1);
		add(jtxt1);
		add(jlbl2);
		add(jtxt2);
		add(jlbl3);
		add(jtxt3);
		add(jbtn1);
		add(jbtn2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		jtxt1.requestFocus();

		// Registering event handler class object
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
	}

	// Event Handling Logic
	public void actionPerformed(ActionEvent ae)
	{
		// getActionCommand returns the button that has been clicked by the end - user
		String buttonName = ae.getActionCommand();

		if (buttonName.equals("Add"))
		{
			String s1 = jtxt1.getText();
			String s2 = jtxt2.getText();
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			int n3 = n1 + n2;
			jtxt3.setText("" + n3);
		}
		else 
		{
			jtxt1.setText("");
			jtxt2.setText("");
			jtxt3.setText("");
			jtxt1.requestFocus();
		}
	}
	
	// main method
	public static void main(String[] args) 
	{
		AdditionGUI addGUI = new AdditionGUI();
	}
}