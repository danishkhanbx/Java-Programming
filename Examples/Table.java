package Examples;

import java.util.*;
public class Table 
{

	public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x = s.nextInt();
        
        for(int i=1; i<=10; i++)
        	System.out.println(x+" x "+i+" = "+x*i);
	}

}
