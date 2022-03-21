package Learn;

public class Class_Attributes {
/*	In the previous example(Cls_Obj_1, Method 1), we used the term "variable" for x in the 
 *  example (as shown below). It is actually an attribute of the class.
 *  Or you could say that class attributes are variables within a class: */
	
   // Create a class called "Class_Attributes" with two attributes: x and y:
//  If you don't want the ability to override existing values, declare the attribute as final.	
 // final int x = 5;
	int x = 5; 
	int y = 6;
	
/*	Another term for class attributes is fields.
 *	You can access attributes by creating an object of the class, and by using the dot syntax (.):  */
	
	public static void main(String args[])
	{
		Class_Attributes myObj1 = new Class_Attributes();
		Class_Attributes myObj2 = new Class_Attributes();
		
   // Modify Attributes or Override existing values:
	//	myObj1.x = 200;  // if use final will generate an error: cannot assign a value to a final variable
		
		System.out.println(myObj1.x);
		System.out.println(myObj2.y);
		
	}

}
