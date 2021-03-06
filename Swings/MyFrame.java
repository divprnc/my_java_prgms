import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame
{
	JButton jbtn1 = new JButton("Button1");
	JButton jbtn2 = new JButton("Button2");
	JButton jbtn3 = new JButton("Button3");
	JButton jbtn4 = new JButton("Button4");
	JButton jbtn5 = new JButton("Button5");
	MyFrame()
	{
		setTitle("My First Frame");

		/* desining Border Layout
		setLayout(new BorderLayout());
		add(jbtn1, BorderLayout.WEST);
		add(jbtn2, BorderLayout.CENTER);
		add(jbtn3, BorderLayout.EAST);
		add(jbtn4, BorderLayout.NORTH);
		add(jbtn5, BorderLayout.SOUTH); */

		// desining Flow Layout
		setLayout(new FlowLayout());
		add(jbtn1, FlowLayout.LEFT);
		add(jbtn2, FlowLayout.LEFT);
		add(jbtn3, FlowLayout.LEFT);
		add(jbtn4, FlowLayout.LEFT);
		add(jbtn5, FlowLayout.LEFT);
		
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();
		System.out.println("Frame object is created");
	}
}