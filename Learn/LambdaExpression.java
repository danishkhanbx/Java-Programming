package Learn;
// When we have to use a class only once throughout the program we use Lambda Expression

interface Abx
{
	void show();
}

public class LambdaExpression 
{
	public static void main(String args[])
	{
		
		Abx obj = () -> System.out.println("Lambda Expression object");
		obj.show();
		
		
		Thread t1 = new Thread( () ->
		{
			for(int i=1; i<=5; i++)
				System.out.println("Hi");
		});
		
		Thread t2 = new Thread( () ->
		{
			for(int i=1; i<=5; i++)
				System.out.println("Hello");
		});
		
		t1.start();
		t2.start();
		
	}
}
