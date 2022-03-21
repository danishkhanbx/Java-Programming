package Learn;
import java.awt.*;
import javax.swing.*;

class swing extends JFrame
{
	public swing()
	{
		setLayout(new FlowLayout());   // AWT method
		
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("Welcome to Swing");
		add(l);
		add(l1);
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}

public class GUISwing 
{
	public static void main(String args[])
	{
		swing obj = new swing();
		
// Either this direct method or class method		
/*	    obj.setVisible(true);
		obj.setSize(400, 400);
		
		obj.setLayout(new FlowLayout());   // AWT method
		
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("Welcome to Swing");
		obj.add(l);
		obj.add(l1);
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	}
}
