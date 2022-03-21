package Learn;

/* If I passed int value but method is accepting double, it wont matter it will be assigned, 
      but passed double and method accepting int will give error. what type of value can be accepted by other data types is given. 
 * Type Promotion table:
   byte -> short -> int -> long
   short -> int -> long
   int -> long -> float -> double
   float -> double
   long -> float -> double
 */

class Demo
{ 
	void disp(int a, double b)
	{ 
		System.out.println("Method A"); 
	}
	
	void disp(int a, double b, double c)
	{
		System.out.println("Method B"); 
	}
	
	void disp(int a, float b)
	{
		System.out.println("Method C"); 
	}
	
	static String disp(int a, int b)
	{
		System.out.println("Method D");
		return "Method D";
	}
	
/*  static char disp(int a, int b) won't work
	{
		return "E";
	}   */
}

public class TypePromotion_inMethod {
	public static void main(String args[])
	{ 
		Demo obj = new Demo(); // This time promotion won't happen as there is  a method with arg list as (int, float) 
		obj.disp(100, 20.67f);
		obj.disp(3, 7.99);
	//  obj.disp(3.88, 8); wont work
   //   obj.disp(4.66f, 6);
  //	obj.disp(9.99, 8.88);
	    obj.disp(5,50,7);
	    obj.disp(5, 6.99, 4);
	    obj.disp(9, 0);
	}
}


