package Examples;

import java.util.*;
public class DiagonalEle_ofSqrMatrix {
	public static void main(String args[])
	{
		int i,j, row, col, sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		row=sc.nextInt(); 
		
		System.out.print("Enter the number of columns: ");
		col=sc.nextInt();
		
		int[][] mat = new int[row][col];
		System.out.println("Enter the elements of the matrix: ") ;
		for(i=0;i<row; i++)
		{
			for(j=0; j<col; j++)
				mat[i][j] =sc.nextInt();
		}
		
		System.out.println("The elements of the matrix") ;
		for(i=0; i<row; i++)
		{
			for (j=0; j<col; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println("");
		}
		
		for(i=0;i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				if(i==j)
					sum +=mat[i][j];
			}
		}
		System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
	}
}
