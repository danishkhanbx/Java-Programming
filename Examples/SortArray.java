package Examples;

import java.util.*;
public class SortArray {
	public static void main(String args[])
	{
		int i, j, n, temp;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the SIZE: ");
		n =in.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter all the elements:");
		for(i=0; i<n; i++)
				arr[i] = in.nextInt();
		
// Bubble Sort:		
		for(i=0; i<n-1; i++) // 1 element sorted at i=0, repeating the sorting for i=1 till n-1 times cause the last element will automatically get sorted 
		{
			for(j=0; j<n-i-1; j++) // when 1 element sorted we don,t need to compare it again, so we minus by i(no. of elements yet sorted), when 0 nothing sorted yet
			{
				if(arr[j] > arr[j+1]) // for ascending order index 0 should be less than 1, so if it's greater than we swap
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		for(i=0; i<n; i++)   // for descending just print it backwards or change the if condition
			System.out.print(arr[i]+" ");	
	}
}
