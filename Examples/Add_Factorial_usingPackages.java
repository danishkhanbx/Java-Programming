package Examples;

import pack.Add;
import pack.Factorial;

public class Add_Factorial_usingPackages {
	public static void main(String args[]) 
	{
		int a=5,b=9,c=5;
		
		Add obj = new Add(a,b);
		Factorial obj2 = new Factorial(c);
		
		obj.show();
		obj2.show();
	}
}
