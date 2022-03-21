package Examples;

import java.util.Scanner;
interface Matrix
{
	int M=5,N=5;
	void readMatrix();
    void displayMatrix();
	void addMatrix();
	void sum_Diagonal_Matrix();
}
class myMatrix implements Matrix
{
	int[][] set01 = new int[M][N];
	int[][] set02 = new int[M][N];
	int[][] add = new int[M][N];
	int sum1,sum2;
	
	 @Override
	 public void readMatrix() 
	 {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter First Matrix : ");
		 for (int i = 0; i < M; i++) 
		 {
			 for (int j = 0; j < N; j++) 
			 {
				 System.out.print("Enter Element at ("+(i+1)+","+(j+1)+") :");
				 set01[i][j] = scan.nextInt();
			 }
		 }
		 System.out.println("Enter Second Matrix : ");
		 for (int i = 0; i < M; i++) 
		 {
			 for (int j = 0; j < N; j++) 
			 {
				 System.out.print("Enter Element at ("+(i+1)+","+(j+1)+") :");
				 set02[i][j] = scan.nextInt();
			}
		 }
	 }
	 
	 @Override
	 public void displayMatrix() 
	 {
		 System.out.println("First 5x5 Matrix:-");
		 for (int[] x : set01) 
		 {
			 for (int y : x)
				 System.out.print(y+"\t");
			 System.out.println();
		 }
		 
	
		 System.out.println("Second 5x5 Matrix:-");
		 for (int[] x : set02) 
		 {
			 for (int y : x)
				 System.out.print(y+"\t");
			 System.out.println();
		 }
		 
		 System.out.println("Addition of 5x5 Matrix:-");
		 for (int[] x : add) 
		 {
			 for (int y : x)
				 System.out.print(y+"\t");
			 System.out.println();
		 }
	 }
	 
	 @Override
	 public void addMatrix() 
	 {
		 for (int i = 0; i < add.length; i++) {
			 for (int j = 0; j < add[i].length; j++) 
				 add[i][j] = set01[i][j] + set02[i][j];
			 }
	 }
	 
	 @Override
	 public void sum_Diagonal_Matrix() 
	 {
		 for (int i = 0; i < set01.length; i++) 
		 {
			 for (int j = 0; j < set01[i].length; j++) 
			 {
				 if (i==j)
					 sum1 += set01[i][j];
			 }
		 }
		 System.out.println("Sum of Diagonal of Matrix 1: "+sum1);
		 
		 for (int i = 0; i < set02.length; i++) 
		 {
			 for (int j = 0; j < set02[i].length; j++) 
			 {
				 if (i==j)
					 sum2 += set02[i][j];
			 }
		 }
		 System.out.println("Sum of Diagonal of Matrix 1: "+sum2);
	}

 
}
public class Matrix_AddDiagonalsum_usingInterface {
	public static void main(String[] args) 
	{
		Matrix my_max = new myMatrix();
		my_max.readMatrix();
		my_max.addMatrix();
		my_max.displayMatrix();
		my_max.sum_Diagonal_Matrix();
	}
}
 
