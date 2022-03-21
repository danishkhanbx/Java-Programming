package Learn;

// 2: In Different class
class differentcls
{
	static int a=10;
	
	static void display() 
	{
		System.out.println("Static Method");
	}

	static 
	{
		System.out.println("Static Block");
	}
}

public class STATIC_MethodVariableBlock {
	
	public static void main(String args[])
	{
		System.out.println("Main Method");
		System.out.println(differentcls.a);
		differentcls.display();
	}
	
	
// 1: In the same Class	
/*	static int a=10; // Static VARIABLE
	
	static void display() // Static METHOD
	{
		System.out.println("Static Method");
	}
	
	static // Static BLOCK
	{
		System.out.println("Static Block");
	}
	
	public static void main(String args[])
	{
		System.out.println("Main Method"); // i.e. main is a method too
		System.out.println(a);
		display();
	}*/	

}
