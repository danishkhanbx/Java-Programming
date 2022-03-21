package Learn;

import java.util.*;
public class SCANNER 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name =sc.nextLine();
		System.out.println("Name: "+name);
		
		System.out.println("Enter Character: ");
		char gender =sc.next().charAt(0); //only display char present at 0 index
		System.out.println("Gender: "+gender);
		
		System.out.println("Enter Your Age: ");
		int age =sc.nextInt();
		System.out.println("Age: "+age);
		
		System.out.println("Enter CGPA: ");
		double cgp =sc.nextDouble();
		System.out.println("CGPA: "+cgp);
		// float = nextFloat() & long = nextLong()
		
		
		
		
	}
	

}
