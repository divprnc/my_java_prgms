import java.awt.*;
import java.applet.*;
/*
<applet code = "AppletDemo" width = 200 height = 60>
</applet>
*/
public class AppletDemo extends Applet
{
	public void paint(Graphics g)
	{
		String msg = "Hello";
		g.drawString(msg, 20, 20);
	}
}