package Learn;

/* public class NoArgument_Constructor {
	int i;
	private NoArgument_Constructor()
	{
		i=5;
		System.out.println("Object creted and i= "+i);
	}
	public static void main(String args[])
	{
		NoArgument_Constructor obj = new NoArgument_Constructor();
	}
}*/

/* Did you notice that the access modifier of NoArgCtor() constructor is private?
    This is because the object is instantiated from within the same class. */

// 2: However, if the object was created outside of the class, you have to declare the constructor public to access it.
class Company
{
	String domainName;
	
	public Company()
	{
		domainName = "rcoe.co.in";
	}
}

public class NoArgument_Constructor 
{
	public static void main(String args[])
	{
		Company obj = new Company();
		System.out.println("Domain name = "+obj.domainName);
	}
}