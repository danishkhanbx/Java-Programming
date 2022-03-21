package Learn;

public class ArrayCopying 
{
	public static void main(String args[])
	{
		int marks[]= {2,3,4,7,8};
		int markscopy[]=new int[5];
		
//Method 1: Same memory location		
	 /* markscopy=marks;
		
		marks[2]=100;
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		for(int i=0;i<markscopy.length;i++)
		{
			System.out.print(markscopy[i]);
		}  */
		
//Method 2: Different memory location
   // A:
		/*	for(int i=0;i<marks.length;i++)
			{
				markscopy[i]=marks[i];
			}
			marks[2]=100;
			
			for(int i=0;i<marks.length;i++)
			{
				System.out.println(marks[i]);
			}
			
			for(int i=0;i<markscopy.length;i++)
			{
				System.out.print(markscopy[i]);
			}  	*/
   // B: Using System Class
		System.arraycopy(marks, 0, markscopy, 0, marks.length);
		marks[2]=100;
		
		System.out.println("The marks array");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("\nThe markscopy array");
		for(int i=0;i<markscopy.length;i++)
		{
			System.out.println(markscopy[i]);
		}  	
	}
}
