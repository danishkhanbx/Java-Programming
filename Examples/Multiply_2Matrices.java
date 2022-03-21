package Examples;

import java.util.Scanner;

public class Multiply_2Matrices {
	public static void main(String args[])
	{
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		
		//creating another matrix to store the multiplication of two matrices
		int c[][]=new int[3][3]; //3 rows and 3 columns
	
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				c[i][j] = 0; // value 0, to save a*b then add it with c*d then add it with e*f. 0,0 index of c. When next index start it reset to 0 to save thier values
				for(int k=0; k<3; k++)
				{
					c[i][j] += a[i][k]*b[k][j]; //  [0][1] * [1][0] add with previous c[i][j] = [0][0]*[0][0]
				}
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
