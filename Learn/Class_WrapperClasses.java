package Learn;
/*
 * The wrapper class implements the technique to convert the primitive into object and object into primitive.
 * Primitive data types are faster then Wrapper.
 * There are certain things that only work with Wrapper class e.g. Hibernate, Collection API. 
 */
public class Class_WrapperClasses 
{
	public static void main(String args[])
	{
		int i = 5;                     // Primitive data type
		Integer ii = new Integer(5);  // Wrapper class
		
		// Putting a variable inside an object
		Integer ij = new Integer(i);  // Boxing - Wrapping
		int j = ij.intValue();       // UnBoxing - UnWrapping
		
		// Assigning the value to object 
		Integer value = i;    // AutoBoxing
		int k = value;       // AutoUnBoxing
		
	}
}
