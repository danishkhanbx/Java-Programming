package Learn;
import java.util.*;

public class Interface_SetInterface 
{
	public static void main(String args[])
	{
		Set<Integer> values = new HashSet<>();
		values.add(4);                
		values.add(65);
		values.add(9);
		values.add(9);
		values.add(92);
		values.add(19);
		values.add(86);
		
		System.out.print("Hashed: [");
		for(int i : values)
			System.out.print(i+", ");
		System.out.print("]\n");
		
		Set<Integer> val = new TreeSet<>();
		val.add(4);                
		val.add(65);
		val.add(9);
		val.add(9);
		val.add(92);
		val.add(19);
		val.add(86);
		
		System.out.print("Sorted: [");
		for(int i : val)
			System.out.print(i+", ");
		System.out.print("]");
	}

}
