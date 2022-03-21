package Learn;
//Variable length Arguments
class Calc
{
	public int add(int ... n) // we are passing an Array {4,5,6,7,8,9,10} 
	{
		int sum=0;
		for(int i : n)
			sum+=i;
		
		return sum;
	}
}

public class Varags 
{
	public static void main(String args[])
	{	
		Calc obj = new Calc();
		System.out.println(obj.add(4,5,6,7,8,9,10));
		System.out.println(obj.add(4,5,6,7,10));
		System.out.println(obj.add(8,9,10));
	}
}
