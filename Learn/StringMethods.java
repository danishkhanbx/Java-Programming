package Learn;

public class StringMethods {
// 1: Methods in String Class ( fixed immutable strings )	
/*	public static void main(String args[])
	{
		String str = new String("Hello");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.indexOf("H"));
		System.out.println("Character at: "+str.charAt(4));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}   */

// 2: String Buffer Class (can modify its location and value)
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("WELCOME");
		System.out.println(str);
		System.out.println(str.append(" to JAVA"));
		System.out.println(str.insert(4,"HOW"));
		System.out.println(str.delete(4, 7));
		System.out.println(str.reverse());
		System.out.println(str.length());
		System.out.println(str.reverse());
		System.out.println(str.indexOf("WELCOME"));
		System.out.println(str.charAt(6));
		System.out.println(str.substring(8));
		System.out.println(str.subSequence(11, 15));
		System.out.println(str);	
	}
}
