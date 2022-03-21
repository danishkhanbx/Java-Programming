package Examples;

import java.util.Scanner;
public class Add_SquareMatrices {
	public static void main(String args[])
	{
		int i,j;
		
		int add[][] = new int[3][3];
		int a[ ][ ] = new int[3][3];
		int b[ ][ ] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first 3X3 matrix is :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				a[i][j] = sc.nextInt();
		}
		
		System.out.println("Enter second 3X3 matrix is :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				b[i][j] = sc.nextInt();
		}
		
		System.out.println("\nThe first 3X3 matrix is : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println(" ");
		}
		
		
		System.out.println("\nThe second 3X3 matrix is : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(b[i][j]+"\t");
			System.out.println(" ");
		}
		
		System.out.println(" ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				add[i][j] = a[i][j] + b[i][j];  
		}
		
		System.out.println("The resultant addition 3X3 matrix is :") ;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(add[i][j]+"\t");
			System.out.println(" ");
		}
		
	}
}
