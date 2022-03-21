package Learn;

import java.applet.*;
import java.awt.*;
/* <applet CODE="GUIApplets.class" WIDTH=400 HEIGHT=600> 
   </applet> */

public class GUIApplets extends Applet
{
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.white);
	}
	
	public void paint(Graphics g)
	{
	// Classes:	
		Color c = new Color(0,255,0);
		Font f = new Font("Bookman Old Style",3,30);
		g.setColor(c);
		g.setFont(f);
	// Methods:	
		int x[] = {200, 250, 260, 270, 290};
		int y[] = {100, 200, 300, 400, 500};
		g.drawPolygon(x,y,5);
		
		g.drawString("Welcome to Applets",40,40);
		g.drawLine(40,240,100,40);
		
		g.drawRect(40, 70, 100, 100);
		g.drawRect(20, 20, 100, 100); // its a SQUARE
		g.fillRect(40, 70, 100, 100);
		g.drawOval(40, 170, 30, 30);
		g.drawOval(40, 40, 30, 30);  // its a CIRCLE
		g.fillOval(40, 170, 30, 30);
		
		g.drawArc(40,260,60,100,60,60);	
	}
}
