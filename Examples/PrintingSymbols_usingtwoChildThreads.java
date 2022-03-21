package Examples;

class First extends Thread 
{
	public void run()
	{
		System.out.print("/");
	}
}
class Second extends Thread 
{
	public void run()
	{
		System.out.print("*");
	}
}
public class PrintingSymbols_usingtwoChildThreads {
	public static void main(String args[])
	{
		for(int i=0; i<5; i++)
		{
			First t1 = new First();
			t1.start();
			Second t2 = new Second();
			t2.start();
		}	
	}
}
