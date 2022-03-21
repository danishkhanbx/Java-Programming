package Learn;

class Parent1
{
	int a=10;
	void display()
	{
		System.out.println("Parent Class");
	}
}
class Child1 extends Parent1
{
	int b=20;
	void show()
	{
		System.out.println("Child Class");
	}
}
class Grandchild extends Child1
{
	int c=30;
	void disp()
	{
		System.out.println("Grandchild Class");
	}
}

public class InheritanceMultilevel {
	public static void main(String args[])
	{
		Grandchild obj = new Grandchild();
		
		System.out.println("Grandchild class variable: "+obj.c);
		obj.disp();
		
		System.out.println("Child class variable: "+obj.b);
		obj.show();
		
		System.out.println("Parent class variable: "+obj.a);
		obj.display();
	}

}
