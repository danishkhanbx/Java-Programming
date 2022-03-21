package Examples;

import java.util.*;
public class Patterns 
{
	public static void main(String args[])
	{
// Method 1:
		int size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
// Method 2:
		/*stop:
		{
			nextRow:
				for(int row=1;row<=7;row++)
				{
					if(row==6)
						break stop;
					
				// its here cause the program jumps using continue, it never got entirely finished using the brackets as end of the loop so the new line never got printed     
					System.out.println(); 
					
					for(int column=1;column<=10;column++)
					{
						if(row<column) // if row gets less than column then it will send the function to next row iteration
							continue nextRow;
						
						System.out.print("*");
					}	
				}
		}*/
	}
}



