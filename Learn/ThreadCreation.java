package Learn;

// 1: Using Inheritance 
/*
class Single extends Thread 
{
	public void run()
	{
		for(int i=0; i<=5; i++)
			System.out.println(i);
	}
}


public class ThreadCreation {
	public static void main(String args[])
	{
		Single t = new Single();
		t.start();
	}
} */

// 2: Using Interface

class Single implements Runnable
{
	public void run()
	{
		for(int i=0; i<=5; i++)
			System.out.println(i);
	}
}

public class ThreadCreation
{
	public static void main(String args[])
	{
		Single s = new Single();
		Thread t = new Thread(s);
		t.start();
	}
}