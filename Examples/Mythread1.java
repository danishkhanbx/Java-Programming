package Examples;

public class Mythread1 extends Thread 
{
	public static void main(String args[])
	{
		Mythread1 ex=new Mythread1();
		ex.create(); 
		System.out.println("this is the main thread!");
	}
	public void create()
	{
		Thread t=new Thread(this); 
		t.start(); 
	}
	public void run()
	{
		while(true) 
		{
			try
			{
				System.out.println("this is the child thread!");
				Thread.sleep(500); 
			}
			catch (InterruptedException e) { }
		}
	}
}
