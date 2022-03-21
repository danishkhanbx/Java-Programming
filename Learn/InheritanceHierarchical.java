package Learn;

class Parentx
{
	int a=10;
	void display()
	{
		System.out.println("Parent Class");
	}
}
class Childy extends Parentx
{
	int b=20;
	void show()
	{
		System.out.println("Child 1 Class");
	}
}
class Childz extends Parentx
{
	int c=30;
	void disp()
	{
		System.out.println("Child 2 Class");
	}
}

public class InheritanceHierarchical {
	public static void main(String args[])
	{
		Childy obj1 = new Childy();
		
		System.out.println("Child class variable: "+obj1.b);
		obj1.show();
		
		System.out.println("Parent class variable: "+obj1.a);
		obj1.display();
		
		Childz obj2 = new Childz();
			
		System.out.println("\nChild class variable: "+obj2.c);
		obj2.disp();
			
		System.out.println("Parent class variable: "+obj2.a);
		obj2.display();	
	}

}
