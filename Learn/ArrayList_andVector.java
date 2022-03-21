package Learn;

/* Vectors vs. ArrayList:
 * Array list and Vectors both have same operations, use same functions, & implements a list interface that allows us to create re-sizable arrays.
 * It is recommended to use Array list because vectors are thread safe and less efficient.
 * Size: ArrayList 1.5x times of original array & Vector 2x times of original array.
 */

import java.util.*;
public class ArrayList_andVector {
	public static void main(String args[])
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>(5);
//		Vector<datatype> v = new Vector();
		
// adding:
		System.out.println("Inserted elements:");
		l1.add(0,2); //add(index,object)
		l1.add(1,8);
		l1.add(3);
		
		l2.add(39);
		l2.add(27);
		l2.add(98);
		
		l1.addAll(l2); // addAll(list)
		for(int i=0; i<l1.size();i++)       // size() works same as length()-> can't use in array list or vector
			System.out.println(l1.get(i));
		
		
// removing:	
	  //l1.clear();      // clear all the elements in l1 list
		l1.remove(0);   // can remove a whole list or elements of list
		
		System.out.println("\nAfter removing: ");
		for(int i=0; i<l1.size();i++)
			System.out.println(l1.get(i));
		
		System.out.println("\nIs l1 contains element 30: "+l1.contains(30));
		System.out.println("\nIndex of element 8 is "+l1.indexOf(8));
		
		l1.set(4,420);
		System.out.println("\nIndex 4 new value is:");
		for(int i=0; i<l1.size();i++)
			System.out.println(l1.get(i));
		
		System.out.println("\nIs List l1 empty:"+l1.isEmpty());
      //System.out.println("\nConverting List l1 to Array l1:"+l1.toArray());
			
	}
}
