package Learn;

/* Static variable is same for all the objects in a class (the static variable can be used to refer to the common property of all objects).
 * The static variable gets memory only once in the class area at the time of class loading (it saves program memory).
 * The static keyword belongs to the class than an instance of the class.
 * */

class Emp
{
	int eid;
	int salary;
	static String branch;
	static String ceo; 
	
	public Emp() // constructor will executed when we create a class
	{
		salary = 3000;
		System.out.println("in constructor");
	}

	static // static block will be executed when we load a class
	{
		ceo = "Larry";
		System.out.println("in static block");
	}
	
	public void show() 
	{
		System.out.println(eid+" : "+salary+" : "+branch+ " : "+ceo);
	}
}

public class Static { 
	
	static int i=0; // if we don't declare it static we wont be able to use it inside static method
	
	public static void main(String args[])
	{
		i=9;
		
		Emp dan = new Emp();
		dan.eid=8;
		
		Emp sha = new Emp();
		sha.eid=9;
		
		Emp.branch = "Mumbai"; // (Class -> Object)we don't need use object to access it, (Class) class will do cause less operations
		
		dan.show();
		sha.show();
	}
}
