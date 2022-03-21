package Examples;

import java.util.*;
public class SwitchMonth_name {
	
	public static void main(String args[])
	{
		int choice;
		Scanner month=new Scanner(System.in);
		
		do {
			System.out.println("Enter Number");
			choice=month.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Febraury");
			    break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			case 0:
				System.out.println("Thank You!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");	
			}
		}while(choice!=0);
	}
}
