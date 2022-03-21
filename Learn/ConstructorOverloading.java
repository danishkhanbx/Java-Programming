package Learn;

class ConstructorOverloading 
{
		private int stuID;
		private String stuName;
		private int stuAge;
		
		ConstructorOverloading()
		{
			stuID = 100;
			stuName = "New Student";
			stuAge = 17;
		}
		
		ConstructorOverloading(int num1, String str, int num2)
		{
			stuID = num1;
			stuName = str;
			stuAge = num2;
		}
		
/* The get method returns the variable value, and the set method sets the value.		
   However, as the name variable is declared as private, we cannot access it from outside this class. */	
		//Getter and setter methods
		public int getStuID()
		{
			return stuID;
		}
		public void setStuID(int stuID)
		{
			this.stuID = stuID;
		}
		
		public String getStuName()
		{
			return stuName;
		}
		public void setStuName(String stuName)
		{
			this.stuName = stuName;
		}
		
		public int getStuAge()
		{
			return stuAge;
		}
		public void setStuAge(int stuAge)
		{
			this.stuAge = stuAge;
		}
		
		public static void main(String args[])
		{
			ConstructorOverloading obj = new ConstructorOverloading();
			System.out.println("Student Name is: "+obj.getStuName());
			System.out.println("Student Age is: "+obj.getStuAge());
			System.out.println("Student ID is: "+obj.getStuID());
			
			ConstructorOverloading obj2 = new ConstructorOverloading(555, "Chat", 25);
			System.out.println("Student Name is: "+obj2.getStuName());
			System.out.println("Student Age is: "+obj2.getStuAge());
			System.out.println("Student ID is: "+obj2.getStuID());
		}
}


