package Learn;
import java.util.*;

public class Interface_List 
{
	public static void main(String args[])
	{
// Collection Objects	
			List val = new ArrayList();
			val.add(4);                 // Integer val =  new Integer(4)
			val.add(6);
			val.add(9);
			val.add("2");
			
			for(Object o : val)
				System.out.println(o);
	
// For Generics
			List<Integer> values = new ArrayList<>();
			values.add(4);                
			values.add(6);
			values.add(9);
			
			for(Integer o : values)
				System.out.print(o+" ");
			
// Methods in Collections
			Collections.sort(val);
			Collections.reverse(val);
			
			
	}
}
