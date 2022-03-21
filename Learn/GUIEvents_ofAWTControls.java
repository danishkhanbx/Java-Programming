package Learn;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet CODE="GUIEvents_ofAWTControls.class" WIDTH=400 HEIGHT=600> 
   </applet> */

// 1: LABEL 
/*
public class GUIEvents_ofAWTControls extends Applet
{
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.white);
		Label l1 = new Label("BRANCH");
		Label l2 = new Label("COLLEGE");
		add(l1);
		add(l2);
	}
	public void paint(Graphics g)
	{
		g.drawString("LABELS",50,50);
	}
}*/

// 2: BUTTONS
/*
public class GUIEvents_ofAWTControls extends Applet implements ActionListener
{
	public void init()
	{
		Button b1 = new Button("Red");
		Button b2 = new Button("Blue");
		Button b3 = new Button("Green");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("BUTTONS",100,100);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str.equals("RED"))
			setBackground(Color.red);
		else if(str.equals("BLUE"))
			setBackground(Color.blue);
		else
			setBackground(Color.green);
	}	
} */

// 3: Check Box
/*
public class GUIEvents_ofAWTControls extends Applet 
{
	public void init()
	{
		Checkbox c1 = new Checkbox("Cricket",true);
		Checkbox c2 = new Checkbox("Tennis",true);
		Checkbox c3 = new Checkbox("Football");
		add(c1);
		add(c2);
		add(c3);
		
	}
	public void paint(Graphics g)
	{
		g.drawString("CHECK BOX",100,100);
	}
} */

// 4: Check Box Group(only one can selected)
/*
public class GUIEvents_ofAWTControls extends Applet 
{
	public void init()
	{
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("CSE",cbg,true);
		Checkbox c2 = new Checkbox("ECE",cbg,false);
		Checkbox c3 = new Checkbox("EEE",cbg,false);
		Checkbox c4 = new Checkbox("CIVIL",cbg,false);
		Checkbox c5 = new Checkbox("MECH",cbg,false);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);	
	}
	public void paint(Graphics g)
	{
		g.drawString("BRANCHES",100,100);
	}
} */

// 5 & 6: Choice & List
public class GUIEvents_ofAWTControls extends Applet implements ItemListener,ActionListener
{
	Choice c;
	List l;
	String cmsg, lmsg;
	public void init()
	{
		c = new Choice();
		l = new List();
		c.add("C");
		c.add("Python");
		c.add("Java");
		l.add("C");
		l.add("Python");
		l.add("Java");
		add(c);
		add(l);
		c.addItemListener(this);
		l.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		cmsg = c.getSelectedItem();
		lmsg = l.getSelectedItem();
		g.drawString(cmsg,300,200);
		g.drawString(lmsg,300,400);
	}
}