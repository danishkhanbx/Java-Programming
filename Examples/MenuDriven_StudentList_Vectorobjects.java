package Examples;
import java.util.*;
import java.io.*;

public class MenuDriven_StudentList_Vectorobjects {
	public static void main(String args[])
	{
		int choice=0;
		String s, stu;
		
		DataInputStream ds = new DataInputStream(System.in);
		Vector v = new Vector();
		
		try
		{
			System.out.println("***MENU***");
            System.out.println("1 - Add Element");
            System.out.println("2 - Remove Element");
            System.out.println("3 - View Elements");
            System.out.println("4 - Exit");
            do 
            {
            	System.out.print("Select your Operation: ");
            	choice=Integer.parseInt(ds.readLine());
            	
            	switch(choice)
            	{
            	case 1:
            		System.out.print("Enter Student name: ");
            		stu = ds.readLine();
            		if(v.contains(stu))
            			System.out.println(" Student name already exists");
            		else
            		{
            			v.addElement(stu);
            			System.out.println("Student name added");
            		}
            		break;
            	case 2:
            		if(v.isEmpty())
            			System.out.println("Student list is empty");
            		else
            		{
            			System.out.print("Enter Student name: ");
            			stu=ds.readLine();
            			if(v.contains(stu))
            			{
            				v.remove(stu);
            				System.out.println("Student name removed");
            			}
            			else
            				System.out.println("Student name does not exist");
            		}
            		break;
            	case 3:
            		if(v.isEmpty())
            			System.out.println("Student list is Empty");
            		else
            			System.out.println("Vector : "+v.toString());
            		break;
            	case 4:
            		System.out.println(" Thank You!!");
				    System.exit(0);
		        default:
		        	System.out.println("Oppss.. Invalid Choice");	
            	}         	
            }while(choice!=4);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught: "+e);
		}
	}
}
