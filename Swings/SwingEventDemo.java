import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingEventDemo 
{
	JLabel jlabel2;
	SwingEventDemo()
	{
		JFrame jf = new JFrame("A Sample Swing Event Demo Application");
		jlabel2 = new JLabel();
		JLabel jlabel1 = new JLabel("Press Any Button");
		JButton alpha = new JButton("Alpha");
		JButton beta = new JButton("Beta");

		jf.add(jlabel1);
		jf.add(alpha);
		jf.add(beta);
		jf.add(jlabel2);

		alpha.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jlabel2.setText("Alpha is pressed");
			}
		});

		beta.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jlabel2.setText("Beta is pressed");
			}
		});

		jf.setSize(150, 150);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

	}
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new SwingEventDemo();
			}
		});
	}
}