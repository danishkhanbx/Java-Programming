package Learn;

/* Enum is short of this 
class Mobile
{
	static final Mobile APPLE = new Mobile(100);
	static final Mobile SAMSUNG = new Mobile();
	static final Mobile HTC = new Mobile(90);
}*/

interface demo3
{ } // enum can implement but can't extend

enum Mobile implements demo3
{
// Two ways we can set price:
	// direct method for apple and htc
	APPLE(100), SAMSUNG, HTC(90);
	
	// using constructor & methods for samsung
	int price;  
	Mobile()
	{
		price = 80;
	}
	Mobile(int p)
	{
		price = p;
	}
	public int getPrice()
	{
		return price;
	}
}

public class Enum 
{
	public static void main(String args[])
	{
		System.out.println(Mobile.APPLE.getPrice());
		System.out.println(Mobile.SAMSUNG.getPrice());
		System.out.println(Mobile.HTC.getPrice());
		
		Mobile m[] = Mobile.values();
		
		for(Mobile mobile : m)
			System.out.println(mobile);
	}
}
