package Learn;

public class MethodOverloading {
	
// 1: Overloading Main() method
	/*	public static void main(String args[])
		{
			System.out.println("main in String[]");
		}
		
		public static void main(String args)
		{
			System.out.println("main in String");
		}
		
		public static void main()
		{
			System.out.println("main withou args");
		}  */
	
// 2: Overload Static Methods
	/*	public static void foo()
		{
			System.out.println("Test.foo() called");
		}

		public static void foo(int a)
		{
			System.out.println("Test.foo(int) called");
		}

		public static void main(String args[])
		{
			MethodOverloading.foo();
			MethodOverloading.foo(10);
		}  */
	
// 3: Method overloading and null error and how to avoid it
	public static void fun(Integer i)
	{
		System.out.println("fun(Integer)");
	}

	public static void fun(String name)
	{
		System.out.println("fun(String)");
	}

	public static void main(String args[])
	{
		MethodOverloading mv = new MethodOverloading();
		
	   // mv.fun(null); // this line will throw an compile time error
// null is any of the literal(reference type i.e. class, array,..) so we need to assign it & we can't convert it too a specific type 	
		
	   // int arg = null;  // means converting null to int so it wont work
		Integer arg = null; // whereas Integer means we are assigning null to an Integer arg
		mv.fun(arg);
	}
}
