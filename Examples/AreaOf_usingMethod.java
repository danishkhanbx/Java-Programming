package Examples;

import java.util.Scanner;
public class AreaOf_usingMethod {
	public static void main (String[] args)
	{
	float r;
	int a,l;
	double h,b;

	System.out.print("Enter Radius of circle:");
	Scanner input = new Scanner(System.in);
	r = input.nextFloat();
	System.out.println("Area of Circle= "+area(r,3.142f));
	
	System.out.print("\nEnter Height of the Triangle: ");
	h=input.nextDouble();
	System.out.print("Enter Base of the Triangle: ");
	b=input.nextDouble();
	System.out.println("Area of Triangle= "+area(h,b));

	System.out.print("\nEnter length of the rectangle:");
	l = input.nextInt();
	System.out.print("Enter width of the rectangle:");
	a = input.nextInt();
	System.out.println("Area of Rectangle= "+area(a,l));
	}

	public static float area(float a,float pi)
	{
	float ar = pi*a*a;
	return ar;
	}
	
	public static double area(double h,double b)
	{
	double ar = h*b/2;
	return ar;
	}	

	public static int area(int a, int l)
	{
	int x = a*l;
	return x;
	}	
}