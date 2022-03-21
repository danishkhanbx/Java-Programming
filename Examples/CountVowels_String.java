package Examples;

import java.util.*;
public class CountVowels_String {
	public static void main(String args[])
	{
		int vowel=0;

		String str = new String();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter A Sentence: ");
		str = in.nextLine();  
		System.out.println("String is : "+str);
		
		System.out.print("\nVowel Frequency: ");
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				if((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')||(ch == 'A')||(ch == 'E')||(ch == 'I')||(ch == 'O')||(ch == 'U'))  
					vowel++;
			}	
		}
		System.out.println(vowel);
		
	}
}
