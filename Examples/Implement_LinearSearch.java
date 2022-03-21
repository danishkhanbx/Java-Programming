package Examples;

import java.util.*;
public class Implement_LinearSearch {
	public static void main(String args[])
	{
		int size,i,find,key=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		size=sc.nextInt();
		
		int arr[]= new int[size];
		
		System.out.println("Enter the elements one by one: ");
		for(i=0;i<size;i++) 
			arr[i]=sc.nextInt();
		
		for(i=0;i<size;i++)
			System.out.println(arr[i]);
		
		System.out.print("Enter the element to be found: ");
		find=sc.nextInt();
		
		for(i=0;i<size;i++) 
		{
			if(find==arr[i])
			{
				key=1;
				break;
			}
		}
		if(key==1)
			System.out.println("Element" +find+"is present in the array at" +(i+1)+"position ");
		else
			System.out.println("Element not present in the array");
	}
}
