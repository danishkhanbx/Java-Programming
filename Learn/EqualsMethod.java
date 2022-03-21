package Learn;

/* .equals() 
 * In general, both equals() and “==” operators in Java are used to compare objects to check equality, but here are some of the differences between the two: 
 *  The main difference between the .equals() method and == operator is that one is a method, and the other is the operator.
 *  We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
 *  If a class does not override the equals method, then by default, it uses the equals(Object o) method of the closest parent class that has overridden this method.
*/

public class EqualsMethod 
{
	public static void main(String args[])
	{
		String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
  
        System.out.println(s1 == s2);         // true
        System.out.println(s1 == s3);        // false
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3)); // true
		
	}

}

/* Explanation: Here, we create two objects, namely s1 and s2. 
 * Both s1 and s2 refer to different objects.
 * When we use the == operator for s1 and s2 comparison, the result is true as both have the same addresses in the string constant pool.
 * Using equals, the result is true because it’s only comparing the values given in s1 and s2. */