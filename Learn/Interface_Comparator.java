package Learn;
import java.util.*;

class Stud implements Comparable<Stud>
{
	int rollno, marks;
	String name;
	
	public Stud(int rollno, String name, int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return "Student[rollno: "+rollno+", marks: "+marks+", name: "+name+"]";
	}
	
	public int compareTo(Stud s)
	{
		return marks > s.marks ? 1 : -1;
	}
}

public class Interface_Comparator 
{
	public static void main(String args[])
	{
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"Mahesh",55));
		studs.add(new Stud(24,"Sony",64));
		studs.add(new Stud(25,"Larry",25));
		studs.add(new Stud(26,"Joseph",36));
		
		Collections.sort(studs);
		for(Stud s : studs)
			System.out.println(s);
		
	}

}
