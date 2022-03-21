package Examples;

public class GCD_usingMethod_Constructor {
	public static void main(String args[])
	{
		int num1 ,num2 ;
		
		Constructor  obj = new Constructor();
		obj.diplay();
	}	
}

class Constructor 
{
	static int num1,num2;
	Constructor()
		{
			num1=8;
			num2=9;
		}
	
	private static int findGCD(int num1, int num2) 
	{  
		if(num2 == 0)
		{ 
			return num1;
		}	
		  return findGCD(num2, num1%num2); 
	}
	
	void diplay()
	{
		System.out.println("GCD of two numbers " + num1 +" and " + num2 +" is :" + findGCD(num1,num2));
	}
}



