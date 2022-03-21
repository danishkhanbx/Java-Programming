package Learn;

abstract class A
{
	abstract void display();
}
abstract class B extends A
{
	void display()
	{
		System.out.println("Abstract Method in A");
	}
	abstract void show();
}
class D extends B
{
	void show()
	{
		System.out.println("SHOW METHOD IN D");
	}
}

public class AbstractMethodsandClasses {
	public static void main(String args[])
	{
		D obj = new D();
		obj.display();	
		obj.show();
	}
}
