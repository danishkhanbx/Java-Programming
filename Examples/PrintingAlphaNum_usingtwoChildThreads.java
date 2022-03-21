package Examples;

class Alpha extends Thread 
{
	public void run()
	{
		for(char i='a'; i<='z'; i++)
			System.out.print(i+", ");
	}
}
class Num extends Thread 
{
	public void run()
	{
		for(int i=1; i<=26; i++)
			System.out.print(i+", ");
	}
}

public class PrintingAlphaNum_usingtwoChildThreads {
	public static void main(String args[])
	{
		Alpha t1 = new Alpha();
		t1.start();
		Num t2 = new Num();
		t2.start();
	}
}
