package Examples;

import java.util.Scanner;
public class Sumof_eachRow_eachColumn {
	public static void main(String args[])
	{
		int i, j , sumrow, sumcol;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter total rows: ");
		int row=inp.nextInt();
		System.out.print("Enter total columns: ");
		int col=inp.nextInt();
		
		int [][] arr = new int[row][col];
		System.out.println("Enter matrix:");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
				arr[i][j] = inp.nextInt();
		}
		
		System.out.println("Orignal Matrix: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		for(i=0; i<row; i++)  // fixing rows i.e. for row 0 column will move 0, 1, 2,... 
		{
			sumrow = 0;
			for(j=0; j<col; j++) // fixing row and moving columns 
				sumrow += arr[i][j];  // 0,0 , 0,1 , 0,2 for each row, after 1 row it will go to the next row after printing row1 values
			System.out.println("Sum of " + (i+1) +" row: " + sumrow);
		}
		
		for(i=0; i<col; i++) // fixing columns i.e. for column 0 row will move 0, 1, 2,...
		{
			sumcol = 0;
			for(j=0; j<row; j++) // fixing column and moving rows 
				sumcol += arr[j][i]; // 0,0 , 1,0 , 2,0 its a column
			System.out.println("Sum of " + (i+1) +" column: " + sumcol);
		}
	}
}
