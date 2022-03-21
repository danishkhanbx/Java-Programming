package Learn;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet CODE="GUIKeyEvents.class" WIDTH=400 HEIGHT=600> 
   </applet> */

public class GUIKeyEvents extends Applet implements KeyListener 
{
	int X=30, Y=30;
	String msg="KEY EVENTS";
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.white);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		msg = "KEY PRESSED";
		setBackground(Color.pink);
		showStatus("KeyPressed");
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		msg = "KEY RELEASED";
		setBackground(Color.red);
		showStatus("KeyReleased");
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		msg = "KEY TYPED IS";
		msg+=ke.getKeyChar();
		setBackground(Color.black);
		showStatus("KeyTyped");
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}

}
