package Learn;

/* Method Overriding and the use of Super keyword:
 * If the method name, parameters, and return type is same for P & C. When it's called for display then child's value will override parents.
 * Both output will be what's defined in child class i.e the values of methods and variables declared in child class.
 * To avoid this we use super() keyword in child class which access variables, methods, constructors of immediate parent class.
 * Terms defined with STATIC or FINAL keyword cannot be overridden.
 * Constructors: It is implicitly called by the JVM. If there are 2 constructor in Derived & Base class, base class constructor will execute 
 *              first, then derived class constructors. Constructors execute from top to bottom.
 */

class P
{
	P()
	{
		System.out.println("Parent Constructor");
	}
	
	int a=10;
	
	void display()
	{
		System.out.println("Parent Class");
	}
}
class C extends P
{
	C()
	{
		System.out.println("Child Constructor");
	}
	
	int a=20;
	
	void display()
	{
		System.out.println("Child Class");
		System.out.println(a);
	
		super.display();                 // if wants child to completely override parent classes then just don't use super keyword
		System.out.println(super.a);
	}
}

public class MethodOverriding_SuperKeyword {
	public static void main(String args[])
	{
		C obj = new C();
		obj.display();
	}
}
