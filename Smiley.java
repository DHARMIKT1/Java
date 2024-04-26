// Java program to Draw a 
// Smiley using Java Applet
import java.applet.*;
import java.awt.*;
/*<applet code ="Smiley" width=600 height=600>
</applet>*/

public class Smiley extends Applet
{
	public void paint(Graphics g)
	{

		setSize(500,300);
		// Oval for face outline
		g.drawOval(80, 70, 150, 150);
		// Ovals for eyes
		// with black color filled
		g.setColor(Color.blue);
		g.fillOval(120, 120, 15, 15);
		g.setColor(Color.red);
		g.fillOval(170, 120, 15, 15);
		// Arc for the smile
		g.drawArc(130, 180, 50, 200, 90, 180);
	}
}
