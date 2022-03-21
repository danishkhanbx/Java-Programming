package Learn;

/* Initializing an object means storing data into the object.
 * We can also create multiple objects and store information in it 
     through reference variable.  */

class Studenty
{
	int id;
	String name;
}

public class InitializingObject_byReferenceVariable 
{
	public static void main(String args[])
	{
		//Creating objects
		Studenty s1 = new Studenty();
		Studenty s2 = new Studenty();
		
		//Initializing objects
		s1.id = 144;
		s1.name = "Danish Khan";
		s2.id = 145;
		s2.name = "Nadeem Khan";
		
		//printing data members with a white space
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}	
}
