package Learn;
import java.util.*;

public class Interface_MapInterface 
{
	public static void main(String args[])
	{
		Map<String,String> map = new HashMap<>();
		map.put("myName", "Danish");
		map.put("actor", "John");
		map.put("ceo", "Larry");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
			System.out.println(key+" "+map.get(key));
		
 //	    Map<String,String> m = new Hashtable<>();
	}
}
