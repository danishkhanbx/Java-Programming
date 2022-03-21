package Examples;

import java.io.*;
/*
// 1: Volume of Sphere and Hemisphere 
interface volx
{
	final double pi=3.14;
	void vol();
}

class sph implements volx
{ 
	double r;
    sph() throws IOException
    { 
    	DataInputStream in=new DataInputStream(System.in);
    	System.out.print("Enter Radius of Sphere: ");
    	r=Double.parseDouble(in.readLine());
    }
    @Override
    public void vol()
    {
    	System.out.println("Volume of Sphere: "+(4*r*r*r*pi)/3);
    }
}

class hmsph implements volx
{ 
	double r;
	hmsph() throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("\nEnter Radius of Hemisphere: ");
		r=Double.parseDouble(in.readLine());
	}
	@Override
	public void vol()
	{
		System.out.println("Volume of Sphere: "+(2*r*r*r*pi)/3);
	}
}

public class VolofSphereHemisphere_uisngAbstract
{
    public static void main(String args[]) throws IOException
    {
    	sph a=new sph();
    	a.vol();
    	hmsph b=new hmsph();
    	b.vol();
    }
} */

// 2: Area of Square and Rectangle
abstract class Shape
{
	abstract void area();
}

class Rectangle extends Shape
{ 
	int l,w;
    Rectangle() throws IOException
    { 
    	DataInputStream in=new DataInputStream(System.in);
    	System.out.println("Enter Length and width of Rectangle:");
    	l=Integer.parseInt(in.readLine());
    	w=Integer.parseInt(in.readLine());
    }
    @Override
    void area()
    {
    	System.out.println("Area of Rectangle = "+(l*w));
    }
}

class Square extends Shape
{ 
	double s;
	Square() throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("Enter Radius of a Circle: ");
		s=Double.parseDouble(in.readLine());
	}
	@Override
	void area()
	{
		System.out.println("Area of Circle = "+(s*s));
	}
}

public class VolofSphereHemisphere_uisngAbstract
{
    public static void main(String args[]) throws IOException
    {
    	Square c=new Square();
    	c.area();
    	Rectangle d=new Rectangle();
    	d.area();
    }
}