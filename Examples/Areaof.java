package Examples;

import java.util.*;
public class Areaof 
{
	public static void main(String args[])
	{
		int s;
		double r, w, h, b;
		float l;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius of the Circle: ");
		r=sc.nextDouble();
		Area obj = new Area(r);
		
		System.out.print("\nEnter Width of the Rectangle: ");
		w=sc.nextDouble();
		System.out.print("Enter Lenght of the Rectangle: ");
		l=sc.nextFloat();
		Area obj2 = new Area(w,l);
		
		System.out.print("\nEnter Height of the Triangle: ");
		h=sc.nextDouble();
		System.out.print("Enter Base of the Triangle: ");
		b=sc.nextDouble();
		Area obj1 = new Area(h,b);
		
		System.out.print("\nEnter Side of the Square: ");
		s=sc.nextInt();
		Area obj4 = new Area(s);
	}
}

class Area
{
	int side;
	double radius,lenght,width,height,base;
	final double pi=3.14;

	Area(double r)
	{
		radius = r;
		double Area = pi*radius*radius;
		System.out.println("Area of the CIRCLE: "+Area);
	}
	
	Area(double w,float l)
	{
		lenght = l;
		width = w;
		double Area2 = w*l;
		System.out.println("Area of the RECTANGLE: "+Area2);
	}
	
	Area(double h, double b)
	{
		height = h;
		base = b;
		double Area3 = (h*b)/2;
		System.out.println("Area of the TRIANGLE: "+Area3);
	}
	
	Area(int s)
	{
		side = s;
		int Area4 = side*side;
		System.out.println("Area of the SQUARE: "+Area4);
	}
}

// Method 2:
/*  public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Area obj = new Area();
		
		System.out.print("Enter Radius of the Circle: ");
		double r=sc.nextDouble();
		
		obj.Radius(r);
		obj.CalcArea();
        obj.displayArea();
	}
}
class Area
{
	double radius, area;
	final double pi=3.14;
	
	void Radius(double r)
	{
		radius =r;
	}
	
	void CalcArea()
	{
		area = pi*radius*radius;
	}
	
	void displayArea()
	{
		System.out.println("Area of the Circle is: "+area);
	}	
} */
