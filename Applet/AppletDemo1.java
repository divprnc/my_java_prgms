import java.awt.*;
import java.applet.*;
public class AppletDemo1 extends Applet
{
	/*
	<applet code = "AppletDemo1" width = 200 height = 60>
	</applet>
	*/
	String msg;
	/*public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.green);
		msg = "Inside init() ----- ";
	}
	public void start()
	{
		msg += "Inside start() ----- ";
	}*/
	public void paint(Graphics g)
	{
		msg += "Inside paint() ----- ";
		g.drawString(msg, 10, 30);
	}
}