import java.applet.*;
import java.awt.*;
public class DrawShape extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(50,50,100,100);
		g.setColor(Color.green);
		g.fillRect(200,50,100,60);
		g.setColor(Color.blue);
		g.drawLine(50,200,300,200);
	}
}
