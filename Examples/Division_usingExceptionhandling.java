package Examples;

import java.io.*;
public class Division_usingExceptionhandling {
//1: Multiple try-catch blocks	
	/*	public static void main(String args[]) throws IOException
		{	
			try
			{
				int a,b,c;
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("Enter Num 1: ");
				a =Integer.parseInt(in.readLine());
				System.out.println("a: "+a);
				System.out.print("Enter Num 2: ");
				b =Integer.parseInt(in.readLine());
				System.out.println("b: "+b);
				c = a/b;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}

		}*/
	
// 2: Nested try-catch	
	public static void main(String args[])throws IOException
	{
		try
		{
			int a,b;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter Num 1: ");
			a =Integer.parseInt(in.readLine());

			System.out.print("Enter Num 2: ");
			b =Integer.parseInt(in.readLine());

			try
			{
				int x = a/b;
			}
			catch(ArithmeticException e2)
			{
				System.out.println(e2);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}		
	}
}

