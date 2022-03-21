package Examples;


import java.util.*;

public class StringandSubsets {
	private static String[] prints;

	public static void main(String[] args) throws NullPointerException
	{
        Scanner scan = new Scanner(System.in);
        String[] tokens = null;
        String[] prints = null;
        if(!scan.hasNext())
        {
            return;
        }
        
        String s = scan.nextLine();
        scan.close();
        
        if(s.length() >0)
            tokens = s.trim().split(",");
   
        tokens = sort(tokens,tokens.length);
        
        int r=1, j=0, l=1;
        int len= tokens.length;
        do
        {
            int x = len - l;
            System.out.print(tokens[x]);
        	j++;
        	l++;
        	r++;
        }while(len-1 == len-r);
    }
	
	static String[] sort(String []s, int n)
	{
	    for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	        int j = i - 1;
	        while (j >= 0 && temp.length() < s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
		return s;
	}
}
