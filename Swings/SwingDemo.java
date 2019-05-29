import javax.swing.*;
import java.awt.*;
class SwingDemo
{
	SwingDemo()
	{
		JFrame jf = new JFrame("First Swing Application");
		JLabel jl = new JLabel("This is Swing label Demo");
		JButton jb = new JButton("Click Me");
		jf.add(jl);
		jf.add(jb);
		jf.setSize(250, 80);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
	}
	public static void main(String[] args)
	{
				new SwingDemo();
	}
}