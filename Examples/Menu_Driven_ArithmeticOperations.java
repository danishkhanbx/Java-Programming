package Examples;

import java.io.*;
import java.util.*;
public class Menu_Driven_ArithmeticOperations
{
// Method 1:	
	public static void main(String args[])throws IOException
	{
		int num1,num2,choice;
		Scanner sc = new Scanner(System.in);
		DataInputStream in= new DataInputStream(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("\n\n\t\tTHIS PROGRAM PERFORMS MENU DRIVEN   ARITHMATIC OPERATION :  \n\n ");
        System.out.println("\t**** MENU ****");
        System.out.println("\t0: EXIT");
        System.out.println("\t1: Addition ");
        System.out.println("\t2: Subtraction ");
        System.out.println("\t3: Multiplication ");
        System.out.println("\t4: Divide ");
        System.out.println("\t5: Modulus");
        
        do {
        	System.out.print("Select your Operation: ");
 		     choice =Integer.parseInt(in.readLine());
        	
		    switch(choice)
		    {
		    case 1: System.out.print("Enter 1st number: ");
                num1 =Integer.parseInt(in.readLine());
   	            System.out.print("Enter 2nd number: ");
		        num2 =Integer.parseInt(in.readLine());
		    	System.out.println("Addition of "+num1+" and "+num2+": "+(num1 + num2));
			    break;
			    
		    case 2: System.out.print("Enter 1st number: ");
	            num1 =sc.nextInt();
	            System.out.print("Enter 2nd number: ");
                num2 =sc.nextInt(); 
			    System.out.println("Subtraction of "+num1+" and "+num2+": "+(num1 - num2));
			    break;
			    
		    case 3:System.out.print("Enter 1st number: ");
	            num1 =Integer.parseInt(br.readLine());
	            System.out.print("Enter 2nd number: ");
                num2 =Integer.parseInt(br.readLine()); 
			    System.out.println("Multiplication of "+num1+" and "+num2+": "+(num1 * num2));
			    break;
			    
		    case 4: System.out.print("Enter 1st number: ");
	            num1 =sc.nextInt();
	            System.out.print("Enter 2nd number: ");
                num2 =sc.nextInt();
			    System.out.println("Division of "+num1+" and "+num2+": "+((float)num1 / (float)num2));
			    break;
			    
		    case 5: System.out.print("Enter 1st number: ");
	            num1 =sc.nextInt();
	            System.out.print("Enter 2nd number: ");
                num2 =sc.nextInt();
			    System.out.println("Modulus of "+num1+" and "+num2+": "+(num1 % num2));
			    break;
			    
		    case 0: System.out.println(" Thank You!!");
		    	System.exit(0);
		    	
		    default:
			    System.out.println("Oppss.. Invalid Choice");
		   }	
		}while(choice!=0);
	}

// Method 2:
/*	public static void main(String args[])throws IOException
	{
		int num1,num2;
		char choice='a';
		Scanner sc = new Scanner(System.in);
		DataInputStream in= new DataInputStream(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("\n\n\t\tTHIS PROGRAM PERFORMS MENU DRIVEN   ARITHMATIC OPERATION :  \n\n ");
        System.out.println("\t**** MENU ****");
        System.out.println("\t&: EXIT");
        System.out.println("\t+: Addition ");
        System.out.println("\t-: Subtraction ");
        System.out.println("\t*: Multiplication ");
        System.out.println("\t/: Divide ");
        System.out.println("\t%: Modulus");
        
        do {
        	System.out.println("Select your Operation: ");
        	choice =sc.next().charAt(0);
        	
		    switch(choice)
		    {
		    case '+': System.out.println("Enter 1st number: ");
                num1 =Integer.parseInt(br.readLine());
   	            System.out.println("Enter 2nd number: ");
		        num2 =Integer.parseInt(br.readLine());
		    	System.out.println(""+num1+" + "+num2+":" +(num1 + num2));
			    break;
			    
		    case '-': System.out.println("Enter 1st number: ");
	            num1 =sc.nextInt();
	            System.out.println("Enter 2nd number: ");
                num2 =sc.nextInt(); 
			    System.out.println(""+num1+" - "+num2+":" +(num1 - num2));
			    break;
			    
		    case '*':System.out.println("Enter 1st number: ");
	            num1 =Integer.parseInt(br.readLine());
	            System.out.println("Enter 2nd number: ");
                num2 =Integer.parseInt(br.readLine()); 
			    System.out.println(""+num1+" * "+num2+":" +(num1 * num2));
			    break;
			    
		    case '/': System.out.println("Enter 1st number: ");
	            num1 =sc.nextInt();
	            System.out.println("Enter 2nd number: ");
                num2 =sc.nextInt();
			    System.out.println(""+num1+" / "+num2+":" +((float)num1 / (float)num2));
			    break;
			    
		    case '%': System.out.println("Enter 1st number: ");
	            num1 =sc.nextInt();
	            System.out.println("Enter 2nd number: ");
                num2 =sc.nextInt();
			    System.out.println(""+num1+" % "+num2+":" +(num1 % num2));
			    break;
			    
		    case '&': System.out.println(" Thank You!!");
		    	System.exit(0);
		    	
		    default:
			    System.out.println("Oppss.. Invalid Choice");
		   }	
		}while(choice!=0);
	}*/
}