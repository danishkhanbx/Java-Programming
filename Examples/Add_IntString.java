package Examples;

import java.util.Scanner;

public class Add_IntString {
	public static void main (String[] args)
	{
	int Int;
	String str = null;

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Integer:");
	Int = input.nextInt();
	
	System.out.println(addition(Int,str)+ " = Rank ");
	
	}
	
	public static String addition(int Int, String str)
	{
		str = "";
	    String st= str+Int;
	    return st;
	}
}
