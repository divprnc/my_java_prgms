import javax.swing.*;
import java.awt.*;

public class ControlCircle1 extends JFrame
{
	 private JButton jbtnEnlarge = new JButton("Enlarge");
	 private JButton jbtnShrink = new JButton("Shrink");
	 private CirclePanel canvas = new CirclePanel();

	ControlCircle1()
	{
		JPanel panel = new JPanel();
		panel.add(jbtnEnlarge);
		panel.add(jbtnShrink);
		this.add(panel, BorderLayout.SOUTH);
		this.add(canvas, BorderLayout.CENTER);
		jbtnEnlarge.addActionListener(new EnlargeListner());
	}
	public static void main(String[] args) 
	{
		JFrame frame = new ControlCircle1();
		frame.setTitle("ControlCircle1");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400,250);
	}
}

class EnlargeListner implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		canvas.enlarge();
	}
}

class CirclePanel extends JPanel
{
	private int radius = 5;
	public void enlarge()
	{
		radius++;
		repaint();
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawOval(getWidth()/2 - radius, getHeight()/2 - radius, 2*radius, 2*radius);
	}
}
