package Examples;

import java.util.*;

// 1: Using Multilevel Inheritance
class Scanning
{
	int r;
	final double pi = 3.14;
	Scanner sc =new Scanner(System.in);
	int display()
	{
		r = sc.nextInt();
		return r;	
	}
}

class AreaofCircle extends Scanning
{
	double AC;
	void disp()
	{
		AC = pi*r*r;
		System.out.println("Area of the Circle: "+AC);
	}
}
class VolofSphere extends AreaofCircle
{
	double VS;
	void show()
	{
		VS = (pi*r*r*r)*3/4;
		System.out.println("Volume of a Sphere: "+VS);
		super.disp();
	}

}

public class VolumeofSphere_MultleveliInheritance {
	public static void main(String args[])
	{
		VolofSphere obj = new VolofSphere();
		
		System.out.print("Enter radius: "+obj.r);
		obj.display();
		obj.show();	
	}
}  
/*
// 2: Using Method Overriding 

interface supz
{
	final double pi=3.14;
	public void display();
}
class Data
{
	double r;
    public void gdata()
    {
    	System.out.print("Enter Radius: ");
        Scanner s = new Scanner(System.in);
        r=s.nextFloat();
    }
}   
class AreaofCircle extends Data
{
	double area;
    public void aclc()
    {
    	area = r*r*3.14;
    }
    public void display()
    {
    	System.out.println("Area of Circle= "+area);
    }
}
class  VolofSphere extends AreaofCircle implements supz
{
	double v;
    public void vclc()
    {
    	v=(4*r*r*r*pi)/3;
    }
    public void display()
    {
    	super.display();   // it will send it to display() of Circle and then it will display volume
    	System.out.println("Volume of Sphere= "+v);
    }
}

public class VolumeofSphere_MultleveliInheritance{
	public static void main(String args[])
    {
		VolofSphere v = new VolofSphere();
        v.gdata(); 
        v.aclc(); 
        v.vclc();
        v.display();
    }
} */