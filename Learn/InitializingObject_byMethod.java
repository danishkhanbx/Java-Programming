package Learn;

class Studentx
{
	int rollno;
	String name;
	
	void insertRecord(int r,String n)
	{
		rollno = r;
		name = n;
	}
	
	void displayinfo()
	{
		System.out.println(rollno+" "+name);
	}
}

public class InitializingObject_byMethod 
{
// 1: Types of Methods	
		public void fullThrottle()
		{
			System.out.println("The car is going as fast as it can!");
		}
		
		public void speed(int maxSpeed)
		{
			System.out.println("Max speed is: "+maxSpeed);
		}
		
		public static void main(String args[])
		{
			InitializingObject_byMethod myCar = new InitializingObject_byMethod();
			myCar.fullThrottle();
			myCar.speed(200);
		}
		
		
// 2: Initializing Object by Method
/*  	static void myMethod()
	{
		System.out.println("Hello Students!");
	}
	public static void main(String args[])
	{
		Studentx s1 = new Studentx();
		Studentx s2 = new Studentx();
		
		s1.insertRecord(5, "Anthony");
		s2.insertRecord(6, "Miller");
		
		myMethod();
		
		s1.displayinfo();
		s2.displayinfo();
	} */	
}
