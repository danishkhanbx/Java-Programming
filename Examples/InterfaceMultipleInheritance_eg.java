package Examples;

class student
{
	int rollnum;
	void getNum(int n)
	{
		rollnum = n ;
	}
	void printnum()
	{
		System.out.println("Roll No.: "+rollnum);
	}
}

class test extends student
{
	float part1, part2;
	void getmarks(float a, float b)
	{
		part1 = a;
		part2 = b;
	}
	void showmarks()
	{
		System.out.println("Marks Part 1: "+part1+"/10");
		System.out.println("Marks Part 2: "+part2+"/10");
	}	
}

interface sport
{
	float sportwt = 4.5F;
	void putwt();
}

class results extends test implements sport
{
	float total;
	@Override
	public void putwt()
	{
		System.out.println("Sport Marks: "+sportwt+"/5");
	}
	void display()
	{
		total = part1 + part2 + sportwt;
		System.out.println("Total Marks: "+total+"/25");
	}
}

public class InterfaceMultipleInheritance_eg {
	public static void main(String srgs[])
	{
		results r = new results();
		r.getNum(13);
		r.printnum();
		r.getmarks(5.9F, 8.5F);
		r.showmarks();
		r.putwt();
		r.display();	
	}
}