package Learn;
import java.util.*;

public class Interface_IteratorInterface 
{
	public static void main(String args[])
	{
		Collection val = new ArrayList();
		val.add(4);
		val.add(6);
		val.add(2);
		
// 1: simple print but cant traverse in this 
		System.out.println(val);
		
		Iterator it = val.iterator();

// 2: it will throw an exception when trying to print the element which is not their 
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
//		System.out.println(it.next());  // this will throw exception, we may don't know how many objects are their in the list.

// 3: It will first check that next object is their or nor if their, visit it then check again
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}
