package Examples;

import java.util.*;
public class TransposeOfMatrix {
	public static void main(String args[])
	{
		int i, j;
		
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
		
// Method 1:		
// Interchanging 0,1 and 1,0 & symmetric indexes		
	/*	for(i=0; i<row; i++) // when its 0 , j will try 0,1,2 index with it. When its 1 j can only try 2 index with it, so there will be no swapping of terms which is already transposed
		{
			for(j=0; j<col; j++)
				if(i<j)  // 0<0 -> 0<1 then the value at index 0,1 swaps with 1,0 & vice versa. It wont be able to swap 1,1 & 2,2 which are the same in transpose. 
				{
				    int temp;
					temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}		
		}  
		
		System.out.println("Transpose of a Matrix: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		} */

// Method 2:
		System.out.println("Transpose of a Matrix: ");
		// in transpose suppose there is a matrix of 3x2 after Transpose it should become 2x3 (transpose rules), so we interchange row with column.
		for(i = 0; i < col; i++)  // 
		{
			for(j = 0; j < row; j++)
				System.out.print(arr[j][i]+" "); // directly 0,1 becomes 1,0 & vice versa. 0,0 , 1,1 , 2,2 remains the same. 
		System.out.println(" ");
		}
		
	}
}
