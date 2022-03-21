package Learn;

/** MultiThreading **/
class Example
{
	void display()
	{
		Thread g = Thread.currentThread();
		for(int i=0; i<=5; i++)
		{
			try
			{
				Thread.sleep(100);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception e) { }
		}
	}
}

class T extends Thread
{
	Example e;
	T(Example e)
	{
		this.e=e;
	}
	public void run()
	{
		e.display();
	}	
} 

public class ThreadSynchronization_andMultiThreading {
	public static void main(String args[])
	{
		Example ex = new Example();
		T t1 = new T(ex);
		T t2 = new T(ex);
		T t3 = new T(ex);
		t1.start();
		t2.start();
		t3.start();
	}
} 

/* Synchronization:-
 * Process Synchronization:
 * It means sharing system resources by processes in such a way that, Concurrent access to shared data is handled thereby minimizing the chance of inconsistent data.
 * Thread Synchronization:
 * It means that every access to data shared between threads is protected so that when any thread starts operation on the shared data, no other thread is allowed access until the first thread is done.
 * Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
 * Java Synchronization is better option where we want to allow only one thread to access the shared resource.
 * The synchronization is mainly used for:
   1) To prevent thread interference.
   2) To prevent consistency problem.
 */

// 1: Synchronization using Method
// class Example {  synchronized void display() { }   }  
 
// 2: Synchronization using Synchronized Block
/*
class Example {   
	void display(){
		Thread g = Thread.currentThread();
		synchronized(this){ }
	}   
} */ 

// 3: Synchronization using Synchronized Static Block
/*
class Example {
    synchronized static void display() {
		Thread g = Thread.currentThread();
		for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(100);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception e) { }
		}
	}
}
class T extends Thread {
	public void run() {
		Example.display();
	}	
}
public class ThreadSynchronization_andMultiThreading {
	public static void main(String args[]) {
		Example ex = new Example();
		T t1 = new T();
		T t2 = new T();
		T t3 = new T();
		t1.start();
		t2.start();
		t3.start();
	}
} */
