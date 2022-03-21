package Examples;

import java.util.*;
import java.io.*;
public class CountFrequency_String {
/*	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter A Sentence: ");
		String str = in.nextLine();  // to read a string
	  //str =  str.toLowerCase();
		System.out.println("String is : "+str);
		
		System.out.println("\nCharacter Frequency: ");
		
		for(char ch='a'; ch<='z'; ch++)
		{
			int count=0;
			for(int i=0; i<str.length(); i++)
			{
				if(ch==str.charAt(i))  // char at 0 index of string = char the count+1
					count++;
			}
			if(count!=0)
				System.out.println(ch+"\t"+count);
		}
		for(char ch='A'; ch<='Z'; ch++)
		{
			int count=0;
			for(int i=0; i<str.length(); i++)
			{
				if(ch==str.charAt(i))
					count++;
			}
			if(count!=0)
				System.out.println(ch+"\t"+count);
		}	
	}  */
	
	
	public static void main(String args[ ])
	{
		char ch='a';   // initialization of char like Integer starts from 0
		int count=0;
		
		String str = new String();
		DataInputStream in = new DataInputStream(System.in);  // using DtInStr instead of Scanner
		
		try   
		{
			System.out.print("Enter String : ");
			str = in.readLine();     // reading a whole string(sentence)

			System.out.print("Enter a character to be searched in string : ");
			ch = (char)in.read();    // reading a single character
			System.out.println("String is : "+str);
		}
		catch(Exception e)  // if the user enters something which is not in the string
		{ 
			System.out.println("I/O Error"); 
		}
		
		for(int i=0; i<str.length(); i++)
		{
			if(ch==str.charAt(i))  // comparing character with each element of array
				count++;    
		}
		System.out.println("Frequency of character '"+ch+"' in string is "+count);
	
	
	}
	
}
