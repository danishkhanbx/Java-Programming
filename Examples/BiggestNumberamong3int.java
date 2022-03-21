package Examples;

import java.util.*;

public class BiggestNumberamong3int 
{

	public static void main(String[] args) 
	{
		int x=0, y=0, z=0, largest;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        largest = x > (y>z ? y:z) ? x:(y>z? y:z) ;
        System.out.print("The lagerst number is "+largest);
	}

}
