package Examples;

import java.util.*;
import java.io.*;
public class MenuDriven_Shoppinglist {
	public static void main(String args[])
	{
		int choice=0, index, len;
		String item, str;
		
		Vector v = new Vector();
		Scanner sc = new Scanner(System.in);
		
		len = args.length;
        for(int i=0;i<len;i++)
            v.addElement(args[i]);
		
		System.out.println("***MENU***");
		System.out.println("1. Add item at specified location");
		System.out.println("2. Add item at the END");
		System.out.println("3. Delete an item");
		System.out.println("4. Show all the items");
		System.out.println("5. Exit");
		do 
		{
			try 
			{
				System.out.flush();
				BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Select your Operation: ");
				str=sc.nextLine();
	            choice=Integer.parseInt(str);
				
				switch(choice)
				{
					case 1:
				        System.out.flush();
						System.out.print("Enter Item to be Insert: ");
	                    item=obj.readLine();
	                    System.out.print("Enter Position to insert item: ");
	                    str=obj.readLine();
	                    index=Integer.parseInt(str);
	                    v.insertElementAt(item,index-1);
	                    break;
					case 2:
						System.out.flush();
						System.out.print("Enter Item name: ");
						item=sc.nextLine();
						v.add(item);
						break;
					case 3:
						System.out.print("Enter the Item: ");
						str=sc.nextLine();
						v.removeElement(str);
						break;
					case 4:
						System.out.println("Items in the list are: ");
						for(int i=0; i<v.size();i++)
							System.out.println((i+1)+": "+v.elementAt(i));
						break;
					case 5: 
						System.out.println(" Thank You!!");
					    System.exit(0);
			        default:
			        	System.out.println("Oppss.. Invalid Choice");	
				}	
			}catch(Exception e) {}
		}while(choice!=5);
	}
}