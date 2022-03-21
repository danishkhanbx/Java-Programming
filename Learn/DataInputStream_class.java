package Learn;

import java.io.*;
public class DataInputStream_class 
{
	public static void main(String args[])throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		
		/*System.out.println("Enter Your Name: ");
		String name =in.readLine();
		System.out.println("Name: "+name);
		
		System.out.println("Enter Your Age: ");
		int age =Integer.parseInt(in.readLine());
		System.out.println("Age: "+age);*/
		
		System.out.println("Enter Character: ");
		char c=(char)System.in.read();
		System.out.println("Gender: "+c);
		
		
		// float = Float.parseFloat(in.readLine()); & double = Double.parseDouble(in.readLine());
	}
}
