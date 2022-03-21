package Learn;

class Parent
{
	int a=10;
	void display()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	int b=20;
	void show()
	{
		System.out.println("Child Class");
	}
}

public class InheritanceSingle {
	public static void main(String args[])
	{
		Child obj = new Child();
		
		System.out.println("Child class variable: "+obj.b);
		obj.show();
		
		System.out.println("Parent class variable: "+obj.a);
		obj.display();	
	}
}
