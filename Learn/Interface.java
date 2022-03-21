package Learn;

// 1: Interfaces

/*
interface a1
{
	void Adisplay();
	void Ashow();
}
interface b1
{
	void Bdisplay();
	void Bshow();
}
class AB implements a1,b1
{
	public void Adisplay()
	{
		System.out.println("A DISPLAY");
	}
	public void Ashow()
	{
		System.out.println("A SHOW");
	}
	public void Bdisplay()
	{
		System.out.println("B DISPLAY");
	}
	public void Bshow()
	{
		System.out.println("B SHOW");
	}	
}

public class Interface {
	public static void main(String args[])
	{
		AB obj = new AB();
		obj.Adisplay();	
		obj.Ashow();
		obj.Bdisplay();	
		obj.Bshow();
	}
}
*/

// 2: Default method in interface

interface Features
{
	void dialing();
	void messaging();
	default void greet()
	{
		System.out.println("\nWelcome");
	}
}
interface Addons
{
	void vcalling();
	void mms();
}
class FeaturedPhone implements Features
{
	@Override
	public void dialing()
	{
		System.out.println("Featured Phone is Dialing...");
	}

	@Override
	public void messaging() 
	{
		System.out.println("Featured Phone is Messaging...");	
	}
}
class SmartPhone implements Features,Addons
{
	@Override
	public void dialing()
	{
		System.out.println("Smart Phone is Dialing...");
	}
	
	@Override
	public void messaging() 
	{
		System.out.println("Smart Phone is Messaging...");	
	}

	@Override
	public void vcalling() {
		System.out.println("Smart Phone is in Video Call...");
		
	}

	@Override
	public void mms() {
		System.out.println("Smart Phone is sending MMS...");
	}
}
public class Interface {
	public static void main(String args[])
	{
		FeaturedPhone fp = new FeaturedPhone();
	    SmartPhone sp = new SmartPhone();
	    
	    fp.greet();
		fp.dialing();
		fp.messaging();
		
		sp.greet();
		sp.dialing();
		sp.messaging();
		sp.vcalling();
		sp.mms();
	}
}