package Examples;

import java.util.*;
public class Palindrone_orNot {
	public static void main(String args[])
	{
		String str,rev;
		
		StringBuffer str1 = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		str = sc.nextLine();
		
		str1.append(str);  // creating a new element which store str value to reverse it
		str1.reverse();
		System.out.println(rev = str1.toString());  // str1 is StringBuffer data type so it's type casted to String
		
		if(str.equalsIgnoreCase(rev))    // it will ignore upper & lower case and compare two cases
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
