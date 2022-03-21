package Learn;

class Th extends Thread
{
	@Override
	public void run()
	{
		Thread t = currentThread();
		for(int i=0; i<=5; i++)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e){ }
			System.out.println(i);
		}
	}
}

public class ThreadMethods {
	public static void main(String args[])
	{
		Th t1 = new Th();
		Th t2 = new Th();
		
// ID and Name: we can get both and only set name which defaultly starts naming from 0 to n	
		System.out.println("ID: "+t1.getId());
		System.out.println("Theard Name: "+t1.getName());
		t1.setName("Fill");
		System.out.println("Theards New Name: "+t1.getName());
		
// Priority: we can get and set priority, It ranges from MIN=1 -> NORM=5(Default) -> MAX=10		
		System.out.println("Priority of Thread: "+t1.getPriority());
		t1.setPriority(10);
		System.out.println("New Priority of Thread: "+t1.getPriority());
		
// Starts Threading
		t1.start(); // it will implicitly called run function in class Thread, which is overridden in extends
		try
		{
			t1.join();   // finish 1 thread at a time, then let other thread run
		}
		catch(Exception e) { }
		System.out.println("Thread 1 Running: "+t1.isAlive());
		
		t2.start();	
		System.out.println("\nThread 2 Running: "+t2.isAlive());
	}
}
