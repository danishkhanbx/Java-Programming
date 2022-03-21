package Learn;
// When we need a class(Inner) for a specific purpose(Outer), we use Inner class
// 1: Normal Class
/*
class Outer
{
	public void show() 
	{ 
		System.out.println("out show"); 
	}
	
	class Inner  // Outer$Inner.class
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
}

public class Class_InnerClass 
{
	public static void main(String args[])
	{
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}
}*/  

// 2: Static Inner class
/*
class Outer
{
	public static void show()           // static method
	{ 
		System.out.println("out show"); 
	}
	
	static class Inner               // static Inner class
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
}

public class Class_InnerClass 
{
	public static void main(String args[])
	{
		Outer.show();
		
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}
} */

//3: Anonymous Inner class
class Aa
{
	public void show()         
	{ 
		System.out.println("out A show"); 
	}
}

interface Abc
{
	void display();
}

public class Class_InnerClass 
{
	public static void main(String args[])
	{	
		Aa obj = new Aa()
				{
			        public void show()
			        {
			        	System.out.println("in A show");
			        }
				};
		obj.show();	
		
		Abc obj1 = new Abc() 
				{
			        public void display()
			        {
			        	
			            System.out.println("interface A display");
			        }
			
				};
		obj1.display();
	}
} 