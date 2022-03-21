package Learn;

public class Class_Object_1 
{
	
// 1: Main within the class 	
 /*	   In Java, an object is created from a class. We have already created
	    the class named Class_Object_1,so now we can use this to create objects.*/	
/*	int x=5;
	public static void main(String args[]) 
	{
		Class_Object_1 myObj = new Class_Object_1();
		System.out.println(myObj.x);
	}  */
	
	
// 2: Main outside the class
/*     Java Program to demonstrate having the main method in another 
        class Creating Student class. */
	
	//Creating another class TestStudent1 which contains the main method
		public static void main(String args[])
		{
			Student s1=new Student();
			System.out.println(s1.id);
			System.out.println(s1.name);
		} 	
}

class Student
{
	int id;
	String name;
} 

